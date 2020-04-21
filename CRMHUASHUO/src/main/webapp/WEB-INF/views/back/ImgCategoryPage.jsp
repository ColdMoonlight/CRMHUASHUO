<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
  <% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>图片列表</title>

 <%--  <!-- Bootstrap -->
  <link href="${APP_PATH }/static/css/bootstrap.min.css" rel="stylesheet">
  <!-- Font Awesome -->
  <link href="${APP_PATH }/static/css/font-awesome.min.css" rel="stylesheet">
  <!-- NProgress -->
  <link href="${APP_PATH }/static/css/nprogress.css" rel="stylesheet">
  <!-- Toastr -->
  <link href="${APP_PATH }/static/css/toastr.min.css" rel="stylesheet">
  <!-- Select2 Style -->
  <link href="${APP_PATH }/static/css/select2.min.css" rel="stylesheet"> --%>
  <link href="${APP_PATH }/static/css/lib.min.css" rel="stylesheet">
  <!-- Custom Theme Style -->
  <link href="${APP_PATH }/static/css/custom.css" rel="stylesheet">
</head>

<body class="nav-md">
  <div class="container body">
    <div class="main_container">
      <div class="col-md-3 left_col menu_fixed">
        <div class="left_col scroll-view" style="width: 100%;">
          <!-- sidebar menu -->
          <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
              <h2 class="text-center">静态资源管理</h2>
              <ul class="nav side-menu">
                <li>
                  <a><i class="glyphicon glyphicon-picture"></i> 图片管理 <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu">
                    <li><a href="${APP_PATH }/index/tobackIndexPage">图片分类</a></li>
                    <li><a href="${APP_PATH }/ImgCategory/toImgCategoryPage">图片列表</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
          <!-- /sidebar menu -->
        </div>
      </div>

      <!-- page content -->
      <div class="right_col" role="main">
        <!-- top navigation -->
        <div class="nav_menu">
          <div class="nav toggle">
            <a id="menu_toggle"><i class="fa fa-bars"></i></a>
          </div>
        </div>
        <!-- /top navigation -->

        <div class="main-box">
          <div class="page-title row">
            <div class="title_left col-md-3 col-sm-3">
              <h4>图片列表</h4>
            </div>
            <div class="title_middle col-md-3 col-sm-3">
              <button id="btn-add" class="btn btn-primary" type="button" data-toggle="modal" data-target="#add-modal">添加图片</button>
            </div>
            <!-- <div class="custom-control custom-checkbox col-md-3 col-sm-3">
			  <input type="checkbox" class="custom-control-input" id="custom-filename">
			  <label class="custom-control-label" for="custom-filename">是否定义下载文件名</label>
			</div> -->

            <div class="title_right col-md-3 col-sm-3">
              <select class="form-control col-sm-10 select-category" name="imgDetailCategoryId"  id="selectCategory2">
                <option value="-1">--none--</option>
              </select>
            </div>
          </div>

          <div class="row">
            <div class="col-md-12 col-sm-12">
              <div class="gallery-box">
                <div id="js-gallery"></div>
              </div>

              <div id="table-pagination"></div>
            </div>
          </div>
        </div>
      </div>
      <!-- /page content -->
      <!-- add-picture modal -->
      <div class="modal fade" id="add-modal" data-backdrop="static" tabindex="-1" role="dialog"
        aria-labelledby="add-picture-modal" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">添加图片</h5>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <form id="formData">
                <div class="form-group row">
                  <label class="col-sm-2" for="imgDetailCategoryId">归属分类</label>
                  <select class="form-control col-sm-10 select-category" style="width: 300px;" name="imgDetailCategoryId"
                    id="selectCategory"></select>
                </div>
                <div class="form-group row">
                  <label class="col-sm-2" for="imgDetailUrl">上传图片</label>
                  <div class="col-sm-10">
                    <div class="input-file">
                      <div class="input-file-plus col-ofset-2"></div>
                      <input type="file" class="form-control" name="imgDetailUrl" id="imgDetailUrl" placeholder="请上传图片"
                        required></input>
                      <div class="upload-progress">
                        <div class="load-img spinner-border" role="status">
                          <span class="sr-only">Loading...</span>
                        </div>
                      </div>
                    </div>
                    <div class="input-file-list"></div>
                  </div>
                </div>
              </form>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
              <button type="button" id="btn-save" class="btn btn-primary">保存</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- download modal -->
  <div class="modal fade" id="fixDownloadFilename" tabindex="-1" role="dialog" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title">修改下载文件</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        <div class="form-group row">
			    <label for="downloadFiname" class="col-sm-2 col-form-label">文件名</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="downloadFilename" placeholder="请输入文件名。。。">
			    </div>
			  </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-primary" id="continueDownload">继续下载</button>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- delete modal -->
	<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title">删除图片</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        <p class="text-center">你确定要删除图片吗？</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-primary" id="confirmDelete">确定</button>
	      </div>
	    </div>
	  </div>
	</div>
  <!-- jQuery -->
  <script src="${APP_PATH }/static/js/jquery.min.js"></script>
  <%-- <!-- Bootstrap -->
  <script src="${APP_PATH }/static/js/bootstrap.min.js"></script>
  <!-- NProgress -->
  <script src="${APP_PATH }/static/js/nprogress.js"></script>
  <!-- Toastr -->
  <script src="${APP_PATH }/static/js/toastr.min.js"></script>
  <!-- PhotoScript Scripts -->
  <script src="${APP_PATH }/static/js/jquery.magnific-popup.min.js"></script>
  <!-- Select2 Scripts -->
  <script src="${APP_PATH }/static/js/select2.min.js"></script> --%>
  <script src="${APP_PATH }/static/js/jquery.lib.min.js"></script>
  <!-- Custom Theme Scripts -->
  <script src="${APP_PATH }/static/js/custom.js"></script>
  <script>
    function renderPhotoList(parent, data) {
      var htmlStr = '',
        len = data.length;

      parent.html('');
      if (len > 0) {
        for (var i = 0; i < len; i++) {
          htmlStr += '<a class="slide" href="' + data[i].imgDetailUrl + '" data-url="' + data[i].imgDetailUrl + '" data-id="' + data[i].imgDetailId + '">' +
            '<img src="' + data[i].imgDetailUrl + '" data-original-src-width="2000" data-original-src-height="2000" />' +
            '<div class="picture-delete"><span aria-hidden="true">x</span></div>' +
            '<span class="picture-download"><i class="fa fa-cloud-download"></i></span>' +
            '</a>';
        }
        parent.html(htmlStr);
        // lightbox
        parent.find('.slide').magnificPopup({
          type: 'image',
          closeOnContentClick: true,
          closeBtnInside: false,
          fixedContentPos: true,
          mainClass: 'mfp-no-margins mfp-with-zoom',
          gallery: {
            enabled: true,
            navigateByImgClick: true,
          },
          image: {
            verticalFit: true
          },
          zoom: {
            enabled: true,
            duration: 300
          }
        });
        // del-picture
        parent.find('.picture-delete').each(function (index, item) {
          $(item).on('click', function (e) {
            e.preventDefault();
            e.stopPropagation();
            var self = this;
            $('#deleteModal').modal('show');
            $('#confirmDelete').off('click');
            $('#confirmDelete').on('click', function() {
            	isModalDelete = true;
            	deletePicture(self);
            });
            /* var timer = setInterval(function() {
              if (isDelSuccess) {
                isDelSuccess = false;
                clearInterval(timer);
                window.location.href= window.location.href;
              }
            }, 500) */
          });
        });
        // download-picture
        parent.find('.picture-download').each(function (index, item) {
          $(item).on('click', function (e) {
            e.preventDefault();
            e.stopPropagation();
            var filename = '',
            	self = this;
            isInputFilename = $('#custom-filename').prop('checked');
            if (isInputFilename) {
            	$('#fixDownloadFilename').modal('show');
            	function downloadFn() {
	           		downloadPicture($(self).parent().data('url'), $('#downloadFilename').val().trim() || 'download');
	           	}

            	$('#continueDownload').off('click');
	           	$('#continueDownload').on('click', downloadFn);
            } else {
            	filename = 'download'
            	downloadPicture($(self).parent().data('url'), 'download');
            }

       		$('#downloadFilename').val('');
          });
        });
      } else {
        toastr.error('该分类下暂无数据！');
      }
    }
    // 获取归属分类数据
    function getCategoryDown() {
      var resData;
      $.ajax({
        url: "${APP_PATH }/ImgCategory/getImgCategoryAll",
        type: "get",
        async: false,
        success: function (data) {
          if (data.code == 100) {
            resData = data.extend.mlbackCategorydownList;
          } else {
            toastr.error('加载分类数据失败');
          }
        }
      });
      return resData;
    }
    // 渲染分类select
    function renderCategory(data) {
      var htmlStr = '',
        len = data ? data.length : 0,
        defaultValue = parseInt(getStorageCategory());
      if (len > 0) {
        htmlStr += '<option value="-1" '+ (defaultValue == -1 ? "selected" : "" ) +'>--none--</option>';
        for (var i = 0; i < len; i++) {
          htmlStr += '<option value="' + data[i].imgCategoryId + '" '+ (defaultValue == data[i].imgCategoryId ? "selected" : "" ) +'>' + data[i].imgCategoryName + '</option>';
        }
      }

      // search category
      $('.select-category').each(function (index, item) {
        $(item).html(htmlStr);
        $(item).select2({
          language: 'zh-CN',
          matcher: matchStart,
          width: 'resolve',
        });
      });
    }

    function matchStart(params, data) {
      if ($.trim(params.term) === '') {
        return data;
      }

      var filteredData = [];
      if (data.text.indexOf(params.term) == 0) {
        filteredData.push(data);
      }

      if (filteredData.length) {
        var modifiedData = $.extend({}, data, true);
        modifiedData.children = filteredData;

        return modifiedData;
      }

      // Return `null` if the term should not be displayed
      return null;
    }

    function renderCategoryData() {
      categoryData = getCategoryDown();
      renderCategory(categoryData);
    }
    // 获取图片数据
    function jumpPage(pn) {
      $.ajax({
        url: "${APP_PATH }/ImgDeatil/getImgDetailByCategoryId",
        data: {
          pn: parseInt(pn),
          imgDetailCategoryId: parseInt(getStorageCategory())
        },
        type: "post",
        success: function (data) {
          if (data.code == 100) {
            renderPhotoList($('#js-gallery'), data.extend.pageInfo.list);
            renderPagination(data.extend.pageInfo);
          } else {
            toastr.error('加载图片数据失败');
          }
        },
        error: function (error) {
          console.log(error);
          toastr.error('加载数据失败')
        },
        complete: function () {
          hideLoading();
        }
      });
    }
    // add picture list
    function addPicture(data) {
      var bgUrl = data.imgDetail && data.imgDetail.imgDetailUrl,
      	bgId = data.imgDetail && data.imgDetail.imgDetailId,
        itemEl = $('<div class="input-file-item" data-id="' + bgId + '" data-url="' + bgUrl + '" data-index="' + (fileList.length) + '" style="background-image: url(' + bgUrl + ');"/>'),
        itemClose = $('<div class="picture-delete"><span aria-hidden="true">x</span></div>');
      itemEl.append(itemClose);
      // del-picture
      itemClose.on('click', function (e) {
        deletePicture(this);
        isDelSuccess = false;
      });
      $('.input-file-list').append(itemEl);
    }

    // 获取归属分类数据
    function getCategory(id) {
      return categoryData.filter(function (item) {
        return item.imgCategoryId == id
      });
    }
    // 上传图片
    function uploadPicture(file) {
      var data = new FormData();
      data.append('file', file);
      data.append('imgDetailCategoryId', $('#selectCategory').val());
      $.ajax({
        url: "${APP_PATH }/UpImg/toUploadImgDetail",
        data: data,
        type: "post",
        processData: false, // 不处理数据
        contentType: false, // 不设置内容类型,
        success: function (data) {
          if (data.code == 100) {
            toastr.success('保存图片成功');
            addPicture(data.extend);
          } else {
            toastr.error('保存图片失败');
          }
        },
        error: function (err) {
          toastr.error('保存图片失败');
          console.log(err)
        },
        complete: function () {
          uploadProgress(true);
        }
      });
    }
    // 上传进度
    function uploadProgress(flag) {
      if (flag) {
        $('.upload-progress').hide();
      } else {
        $('.upload-progress').show();
      }
    }
    // 上传 rule
    function uploadRule(file) {
      // 上传小于2Mb
      if (file.size > 1024 * 1024 * 10) {
        toastr.error('上传图片大小超过10Mb，请选择合适的图片上传！');
        $('.upload-progress').hide();
        return false;
      }
      return true;
    }
    // 删除图片
    function deletePicture(self) {
      $.ajax({
        url: "${APP_PATH }/ImgDeatil/delete",
        data: JSON.stringify({
          "imgDetailId": $(self).parent().data('id'),
          "imgDetailUrl": $(self).parent().data('url')
        }),
        type: "post",
        dataType: "json",
        contentType: 'application/json',
        success: function (data) {
          if (data.code == 100) {
            isDelSuccess = true;
            toastr.success('删除图片成功');
            $(self).parent().remove();
            fileList.splice(parseInt($(self).data('index')), 1);
            if (isModalDelete) $('#deleteModal').modal('hide');
          } else {
            toastr.error('删除图片失败，请重试！');
          }
        },
        error: function (err) {
          console.log(err);
          toastr.error('删除图片失败，请重试！');
        },
        complete: function() {
        	isModalDelete = false;
        }
      });
    }
    // 下载图片
    function downloadPicture(url, filename) {
      showLoading();
      var $downLoad = $('.download-btn');
      if ($downLoad.length <= 0) {
        $downLoad = $('<a class="download-btn" download="download"></a>');
        $(document.body).append($downLoad);
      }
      // to blob
      fetch(url).then(function (response) {
        if (response.status == 200) {
          return response.blob();
        }
      }).then(function (blob) {
        $downLoad.attr('href', URL.createObjectURL(blob));
        $downLoad.attr('download', filename);
        $downLoad[0].click();
        toastr.success('下载图片成功！');
        if (isInputFilename) {
        	$('#fixDownloadFilename').modal('hide');
        }
      }).catch(function (error) {
        toastr.error('下载图片失败！');
        console.log(error);
      }).finally(function () {
        hideLoading();
      });
    }

    var categoryData = null,
      fileList = [],
      isDelSuccess = false,
      isInputFilename = false,
      isModalDelete = false;
    // default
    showLoading();
    renderCategoryData();
    jumpPage(getStoragePage());
    $('#selectCategory').val(getStorageCategory());
    $('#selectCategory2').val(getStorageCategory());
    // event change category
    $(document.body).on('change', '#selectCategory', function (val) {
      var targetId = $(this).val();
      var category = getCategory(targetId)[0];
      $('input[name="imgCategoryParentName"]').val(category.imgCategoryParentName);
      $('input[name="imgCategoryDesc"]').val(category.imgCategoryDesc);
    });
    $(document.body).on('change', '#selectCategory2', function (val) {
      setStorageCategory($(this).val());
      setStoragePage(1);
      window.location.href = window.location.href;
    });
    // edit picture
    $(document.body).on('click', '#btn-edit', function (e) {
      renderCategoryData();
    });
    // add picture
    $(document.body).on('click', '#btn-add', function (e) {
      $('.input-file-list').html('');
    });
    // upload picture
    $(document.body).on('change', '.input-file>input', function (e) {
      var file = $('input[name="imgDetailUrl"]')[0].files[0];
      $('input[name="imgDetailUrl"]').val('');
      // enable status
      uploadProgress(false);
      // check picture is fit to rule
      uploadRule(file) && uploadPicture(file);
    });
    // save picture
    $(document.body).on('click', '#btn-save', function (e) {
      showLoading();
      $('#add-modal').modal('hide');
      window.location.href = window.location.href;
    });
  </script>
</body>

</html>