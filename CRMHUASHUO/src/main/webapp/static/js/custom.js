var CURRENT_URL = window.location.href.split('#')[0].split('?')[0],
    $BODY = $('body'),
    $MENU_TOGGLE = $('#menu_toggle'),
    $SIDEBAR_MENU = $('#sidebar-menu'),
    $SIDEBAR_FOOTER = $('.sidebar-footer'),
    $LEFT_COL = $('.left_col'),
    $RIGHT_COL = $('.right_col'),
    $NAV_MENU = $('.nav_menu'),
    $FOOTER = $('footer');

// Sidebar
function init_sidebar() {
    // TODO: This is some kind of easy fix, maybe we can improve this
    var setContentHeight = function () {
        // reset height
        $RIGHT_COL.css('min-height', $(window).height());

        var bodyHeight = $BODY.outerHeight(),
            footerHeight = $BODY.hasClass('footer_fixed') ? -10 : $FOOTER.height(),
            leftColHeight = $LEFT_COL.eq(1).height() + $SIDEBAR_FOOTER.height(),
            contentHeight = bodyHeight < leftColHeight ? leftColHeight : bodyHeight;

        // normalize content
        contentHeight -= $NAV_MENU.height() + footerHeight;

        $RIGHT_COL.css('min-height', contentHeight);
    };

    var openUpMenu = function () {
        $SIDEBAR_MENU.find('li').removeClass('active active-sm');
        $SIDEBAR_MENU.find('li ul').slideUp();
    }

    $SIDEBAR_MENU.find('a').on('click', function (ev) {
    	setStoragePage(1);
        var $li = $(this).parent();

        if ($li.is('.active')) {
            $li.removeClass('active active-sm');
            $('ul:first', $li).slideUp(function () {
                setContentHeight();
            });
        } else {
            // prevent closing menu if we are on child menu
            if (!$li.parent().is('.child_menu')) {
                openUpMenu();
            } else {
                if ($BODY.is('nav-sm')) {
                    if (!$li.parent().is('child_menu')) {
                        openUpMenu();
                    }
                }
            }

            $li.addClass('active');

            $('ul:first', $li).slideDown(function () {
                setContentHeight();
            });
        }
    });

    // toggle small or large menu
    $MENU_TOGGLE.on('click', function () {
        if ($BODY.hasClass('nav-md')) {
            $SIDEBAR_MENU.find('li.active ul').hide();
            $SIDEBAR_MENU.find('li.active').addClass('active-sm').removeClass('active');
        } else {
            $SIDEBAR_MENU.find('li.active-sm ul').show();
            $SIDEBAR_MENU.find('li.active-sm').addClass('active').removeClass('active-sm');
        }

        $BODY.toggleClass('nav-md nav-sm');

        setContentHeight();
    });

    // check active menu
    $SIDEBAR_MENU.find('a[href="' + CURRENT_URL + '"]').parent('li').addClass('current-page');

    $SIDEBAR_MENU.find('a').filter(function () {
        return this.href == CURRENT_URL;
    }).parent('li').addClass('current-page').parents('ul').slideDown(function () {
        setContentHeight();
    }).parent().addClass('active');

    setContentHeight();

    // fixed sidebar
    if ($.fn.mCustomScrollbar) {
        $('.menu_fixed').mCustomScrollbar({
            autoHideScrollbar: true,
            theme: 'minimal',
            mouseWheel: { preventDefault: true }
        });
    }
}
// /Sidebar

// NProgress
if (typeof NProgress != 'undefined') {
    $(document).ready(function () {
        NProgress.start();
    });

    $(window).on('load', function () {
        NProgress.done();
    });
}

$(document).ready(function () {
	if ($(".progress .progress-bar")[0]) {
        $('.progress .progress-bar').progressbar();
    }
    init_sidebar();
});

function setStoragePage(num) {
	window.sessionStorage.setItem('currPage', num);
}
function getStoragePage() {
	return parseInt(window.sessionStorage.getItem('currPage')) || 1;
}

function setStorageCategory(name) {
	window.localStorage.setItem('category', name);
}
function getStorageCategory() {
	return parseInt(window.localStorage.getItem('category')) || -1;
}
function makerArray(n) {
	var arr = []
	for (var i = 0; i < n; i++) {
		arr.push(i+1);
	}
	return arr;
}
function renderPagination(data) {
	if (data) {		
		$("#table-pagination").empty();
		//构建元素
		var pageUl = $('<ul class="pagination" />'),
		firstPageLi = $('<li class="page-item" />').append($('<a class="page-link" />').append('首页').attr('href', '#')),
		prePageLi = $('<li class="page-item" />').append($('<a class="page-link" />').append('&laquo;')),
		nextPageLi = $('<li class="page-item" />').append($('<a class="page-link" />').append('&raquo;')),
		lastPageLi = $('<li class="page-item" />').append($('<a class="page-link" />').append('末页').attr('href', '#')),
		pageCurrentNum = data.pageNum,
		pageNums = data.pages,
		pageArr = [];
		prePageLi.on('click', function() {
			pageCurrentNum > 1 && jumpPage(pageCurrentNum - 1);
		});
		nextPageLi.on('click', function() {
			pageCurrentNum < pageNums && jumpPage(pageCurrentNum + 1);
		});
		if (data.pages > 5) {
			if (pageCurrentNum <= 5) {
				pageArr = [1, 2, 3, 4, 5];
			} else if (pageCurrentNum > pageNums - 5) {
				pageArr = [pageNums - 4, pageNums - 3, pageNums - 2, pageNums -1, pageNums];
			} else {
				pageArr = [pageCurrentNum - 2, pageCurrentNum - 1, pageCurrentNum, pageCurrentNum + 1, pageCurrentNum + 2];
			}
		} else {
			pageArr = makerArray(data.pages || 1);
		}
		
		if (data.hasPreviousPage == false) {
			firstPageLi.addClass('disabled');
			prePageLi.addClass('disabled');
		} else {
			//为元素添加点击翻页的事件
			firstPageLi.click(function () {
				setStoragePage(1);
				window.location.href = window.location.href;
			});
			prePageLi.click(function () {
				setStoragePage(data.pageNum - 1);
				window.location.href = window.location.href;
			});
		}
		
		if (data.hasNextPage == false) {
			nextPageLi.addClass('disabled');
			lastPageLi.addClass('disabled');
		} else {
			nextPageLi.click(function () {
				setStoragePage(data.pageNum + 1);
				window.location.href = window.location.href;
			});
			lastPageLi.click(function () {
				setStoragePage(data.pages);
				window.location.href = window.location.href;
			});
		}
		
		pageUl.append(firstPageLi).append(prePageLi);
		
		$.each(pageArr, function(i, item) {
			var numLi = $('<li class="page-item" />').append($('<a class="page-link" href="#" />').append(item));
			if (pageCurrentNum == item) {
				numLi.addClass('active');
			}
			numLi.click(function () {
				setStoragePage(item);
				window.location.href = window.location.href;
			});
			pageUl.append(numLi);
		});
		
		pageUl.append(nextPageLi).append(lastPageLi);
		
		var navEle = $('<nav aria-label="Page navigation" />').append(pageUl);
		navEle.appendTo('#table-pagination');
	}
}

/* loading */
function showLoading() {
	if ($('#loading').length <= 0) {
		var htmlStr = '<div id="loading">' +
		    '<div class="load-img spinner-border" role="status">' +
		      '<span class="sr-only">Loading...</span>' +
		    '</div>' +
		  '</div>';
		$(document.body).append(htmlStr);
	}
	$('#loading').show();
	$(document.body).css('overflow', 'hidden');
}

function hideLoading() {
	$('#loading').hide();
	$(document.body).css('overflow', 'auto');
}