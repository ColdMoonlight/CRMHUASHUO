<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
  <% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>分类管理</title>

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
            <div class="title_left col-md-6 col-sm-6">
              <h4>图片分类 </h4>
            </div>

            <div class="title_right col-md-6 col-sm-6">
              <button id="btn-add" class="btn btn-primary" type="button" data-toggle="modal"
                data-target="#add-modal">添加分类</button>
            </div>
          </div>

          <div class="row">
            <div class="col-md-12 col-sm-12 ">
              <div class="table-responsive">
                <table id="datatable" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0"
                  width="100%">
                  <thead>
                    <tr>
                      <th>ID</th>
                      <th>分类名字</th>
                      <th>父类名字</th>
                      <th>分类描述</th>
                      <th>操作</th>
                    </tr>
                  </thead>
                  <tbody id="table-body"></tbody>
                </table>
              </div>

              <div id="table-pagination"></div>
            </div>
          </div>
        </div>
        <!-- /page content -->
        <!-- add-picture modal -->
        <div class="modal fade" id="add-modal" data-backdrop="static" tabindex="-1" role="dialog"
          aria-labelledby="add-picture-modal" aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title">添加分类</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <form id="formData">
                  <input hidden name="imgCategoryId" value="-1">
                  <input hidden name="imgCategoryParentName" value="--none--">
                  <div class="form-group row">
                    <label class="col-sm-2" for="imgCategoryName">分类名</label>
                    <input type="text" class="form-control col-sm-10" name="imgCategoryName" id="imgCategoryName"
                      placeholder="请输入分类名" required></input>
                  </div>
                  <div class="form-group row">
                    <label class="col-sm-2" for="imgCategoryParentId">归属分类</label>
                    <select class="form-control col-sm-10 select-category" style="width: 300px;" name="imgCategoryParentId" id="selectCategory">
                      <option value="--none--">--none--</option>
                    </select>
                  </div>
                  <div class="form-group row">
                    <label class="col-sm-2" for="imgCategorySeo">分类SEO</label>
                    <input type="text" class="form-control col-sm-10" name="imgCategorySeo" id="imgCategorySeo"
                      placeholder="请输入分类seo" required></input>
                  </div>
                  <div class="form-group row">
                    <label class="col-sm-2" for="imgCategoryDesc">分类描述</label>
                    <input type="text" class="form-control col-sm-10" name="imgCategoryDesc" id="imgCategoryDesc"
                      placeholder="请输入分类描述" disabled value="--none--"></input>
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
      function renderTableBody(data) {
        var htmlStr = '';
        for (var i = 0, len = data.length; i < len; i++) {
          htmlStr += '<tr>' +
            '<td>' + data[i].imgCategoryId + '</td>' +
            '<td>' + data[i].imgCategoryName + '</td>' +
            '<td>' + data[i].imgCategoryParentName + '</td>' +
            '<td>' + data[i].imgCategoryDesc + '</td>' +
            '<td>' +
            '<button id="btn-edit" data-id="' + data[i].imgCategoryId + '" class="btn btn-primary" data-toggle="modal" data-target="#add-modal">编辑</button>' +
            '<button id="btn-delete" data-id="' + data[i].imgCategoryId + '" class="btn btn-danger" disabled>删除</button>' +
            '</td>' +
            '</tr>';
        }
        $('#table-body').html(htmlStr);
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

        $('#selectCategory').html(htmlStr);
        // search category
        $('#selectCategory').select2({
            language: 'zh-CN',
            matcher: matchStart,
            width: 'resolve'
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

      // 填充分类数据
      function addCategoryData(data) {
        $('input[name="imgCategoryId"]').val(data.imgCategoryId);
        $('input[name="imgCategoryName"]').val(data.imgCategoryName);
        $('select[name="imgCategoryParentId"]').val(data.imgCategoryParentId);
        $('input[name="imgCategoryParentName"]').val(data.imgCategoryParentName);
        $('input[name="imgCategorySeo"]').val(data.imgCategorySeo);
        $('input[name="imgCategoryDesc"]').val(data.imgCategoryDesc);
      }
      function resetCategoryData() {
        $('input[name="imgCategoryId"]').val('');
        $('input[name="imgCategoryName"]').val('');
        $('select[name="imgCategoryParentId"]').val('-1');
        $('input[name="imgCategoryParentName"]').val('--none--');
        $('input[name="imgCategorySeo"]').val('');
        $('input[name="imgCategoryDesc"]').val('');
      }
      // 获取分类数据
      function jumpPage(pn) {
        $.ajax({
          url: "${APP_PATH }/ImgCategory/getImgCategoryByPage",
          data: "pn=" + pn,
          type: "post",
          success: function (data) {
            if (data.code == 100) {
              renderTableBody(data.extend.pageInfo.list);
              renderPagination(data.extend.pageInfo);
            } else {
              toastr.error('加载分类数据失败');
            }
            hideLoading();
          }
        });
      }
      var categoryData = null;
      // default
      showLoading();
      jumpPage(getStoragePage());
      // delte category
      $(document.body).on('click', '#btn-delete', function (e) {
        $.ajax({
          url: "${APP_PATH }/ImgCategory/delete",
          data: JSON.stringify({ "imgCategoryId": $(this).data('id') }),
          type: "post",
          dataType: "json",
          contentType: 'application/json',
          success: function (data) {
            if (data.code == 100) {
              toastr.success('删除分类成功');
              jumpPage(getStoragePage());
            } else {
              toastr.error('删除分类失败');
            }
          }
        });
      });
      // event change category
      $(document.body).on('change', '#selectCategory', function (val) {
        var targetId = $(this).val();
        var category = getCategory(targetId)[0];
        $('input[name="imgCategoryParentName"]').val(category.imgCategoryParentName);
        $('input[name="imgCategoryDesc"]').val(category.imgCategoryDesc);
      });
      function getCategory(id) {
        return categoryData.filter(function (item) {
          return item.imgCategoryId == id
        });
      }
      // edit category
      $(document.body).on('click', '#btn-edit', function (e) {
        categoryData = getCategoryDown();
        renderCategory(categoryData);
        addCategoryData(getCategory($(this).data('id'))[0]);
      });
      // add category
      $(document.body).on('click', '#btn-add', function (e) {
        categoryData = getCategoryDown();
        renderCategory(categoryData);
        resetCategoryData();
      });
      // save category
      $(document.body).on('click', '#btn-save', function (e) {
        var data = {};
        showLoading();
        data.imgCategoryId = $('input[name="imgCategoryId"]').val();
        data.imgCategoryName = $('input[name="imgCategoryName"]').val();
        data.imgCategoryParentId = $('select[name="imgCategoryParentId"]').val();
        data.imgCategoryParentName = $('input[name="imgCategoryParentName"]').val();
        data.imgCategorySeo = $('input[name="imgCategorySeo"]').val();
        data.imgCategoryDesc = $('input[name="imgCategoryDesc"]').val();
        $.ajax({
          url: "${APP_PATH }/ImgCategory/save",
          data: JSON.stringify(data),
          type: "post",
          dataType: "json",
          contentType: 'application/json',
          success: function (data) {
            if (data.code == 100) {
              toastr.success('保存分类成功');
              $('#add-modal').modal('hide');
              jumpPage(getStoragePage());
            } else {
              toastr.error('保存分类失败');
            }
          }
        });
      });
    </script>
</body>

</html>