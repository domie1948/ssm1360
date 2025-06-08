<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑家政服务</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>家政服务管理</span></li>
								<li class="breadcrumb-item active"><span>编辑家政服务</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">家政服务信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>家政姓名</label>
										<input id="jiazhengxingming" name="jiazhengxingming" class="form-control" placeholder="家政姓名">
									</div>
									<div class="form-group col-md-6">
										<label>性别</label>
										<select id="xingbieSelect" name="xingbie" class="form-control">
												<option value=""></option>
												<option class="xingbieOption" value="男">
													男
												</option>
												<option class="xingbieOption" value="女">
													女
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>年龄</label>
										<input id="nianling" name="nianling" class="form-control" placeholder="年龄">
									</div>
									<div class="form-group col-md-6">
										<label>服务类型</label>
										<select id="fuwuleixingSelect" name="fuwuleixing" class="form-control">
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>家政类型</label>
										<select id="jiazhengleixingSelect" name="jiazhengleixing" class="form-control">
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>服务费用</label>
										<input id="fuwufeiyong" name="fuwufeiyong" class="form-control" placeholder="服务费用">
									</div>
									<div class="form-group col-md-6">
										<label>联系方式</label>
										<input id="lianxifangshi" name="lianxifangshi" class="form-control" placeholder="联系方式">
									</div>
									<div class="form-group col-md-6">
										<label>工作年数</label>
										<input id="gongzuonianshu" name="gongzuonianshu" class="form-control" placeholder="工作年数">
									</div>
									<div class="form-group col-md-6">
										<label>家政图片</label>
										<div><img id="jiazhengtupianImg" src="" width="100" height="100">
										<div class="upload">选择文件<input name="file" type="file" id="jiazhengtupianupload" class="form-control-file"></div>
										<input name="jiazhengtupian" id="jiazhengtupian-input" type="hidden"></div>
									</div>
									<div class="form-group col-md-6">
										<label>个人简介</label>
										<input id="gerenjianjie" name="gerenjianjie" class="form-control" placeholder="个人简介">
									</div>
										
											<div class="form-group  col-md-12">
												<label>工作内容</label>
												<div><div class="upload"><input id="gongzuoneirongupload" name="file" type="file">选择文件</div>
												<script id="gongzuoneirongEditor" type="text/plain" style="width:800px;height:230px;"></script>
												<script type="text/javascript">
												    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
												   //相见文档配置属于你自己的编译器
												 var gongzuoneirongUe = UE.getEditor('gongzuoneirongEditor', {
													toolbars: [
														[
															'undo', //撤销
															'bold', //加粗
															'redo', //重做
															'underline', //下划线
															'horizontal', //分隔线
															'inserttitle', //插入标题
															'cleardoc', //清空文档
															'fontfamily', //字体
															'fontsize', //字号
															'paragraph', //段落格式
															'inserttable', //插入表格
															'justifyleft', //居左对齐
															'justifyright', //居右对齐
															'justifycenter', //居中对
															'justifyjustify', //两端对齐
															'forecolor', //字体颜色
															'fullscreen', //全屏
															'edittip ', //编辑提示
															'customstyle', //自定义标题
															 ]
														]
													});
												</script>
												<input type="hidden" name="gongzuoneirong" id="gongzuoneirong-input">
												</div>
											</div>	
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "jiazhengfuwu";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};

		var fuwuleixingOptions = [];
		var jiazhengleixingOptions = [];

				function fuwuleixingSelect(){
					http("option/fuwuleixing/fuwuleixing","GET",{},(res)=>{
						if(res.code == 0){
							fuwuleixingOptions = res.data;
							var nullOption = document.createElement('option');
							var fuwuleixingSelect = document.getElementById('fuwuleixingSelect');
							fuwuleixingSelect.appendChild(nullOption);
							for(var i=0;i<fuwuleixingOptions.length;i++){
								var fuwuleixingOption = document.createElement('option');
								fuwuleixingOption.setAttribute('name','fuwuleixingOption');
								fuwuleixingOption.setAttribute('value',fuwuleixingOptions[i]);
								fuwuleixingOption.innerHTML = fuwuleixingOptions[i];									
								if(ruleForm.fuwuleixing == fuwuleixingOptions[i]){
									fuwuleixingOption.setAttribute('selected','selected');
								}
								fuwuleixingSelect.appendChild(fuwuleixingOption);
							}
						}
					});
				}	
				function jiazhengleixingSelect(){
					http("option/jiazhengleixing/jiazhengleixing","GET",{},(res)=>{
						if(res.code == 0){
							jiazhengleixingOptions = res.data;
							var nullOption = document.createElement('option');
							var jiazhengleixingSelect = document.getElementById('jiazhengleixingSelect');
							jiazhengleixingSelect.appendChild(nullOption);
							for(var i=0;i<jiazhengleixingOptions.length;i++){
								var jiazhengleixingOption = document.createElement('option');
								jiazhengleixingOption.setAttribute('name','jiazhengleixingOption');
								jiazhengleixingOption.setAttribute('value',jiazhengleixingOptions[i]);
								jiazhengleixingOption.innerHTML = jiazhengleixingOptions[i];									
								if(ruleForm.jiazhengleixing == jiazhengleixingOptions[i]){
									jiazhengleixingOption.setAttribute('selected','selected');
								}
								jiazhengleixingSelect.appendChild(jiazhengleixingOption);
							}
						}
					});
				}	

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "jiazhengfuwu/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
			$('#jiazhengtupianupload').fileupload({
				url: baseUrl + 'file/upload',
				headers:{ token: window.sessionStorage.getItem("token")},
				dataType: 'json',
				done: function (e, data) {				
					document.getElementById('jiazhengtupian-input').setAttribute('value',baseUrl+"upload/"+data.result.file);
					if(document.getElementById('jiazhengtupianFileName') != null){
						document.getElementById('jiazhengtupianFileName').innerHTML = "上传成功!";
					}				
					$("#jiazhengtupianImg").attr("src",baseUrl+"upload/"+data.result.file);								
				}
			});
			$('#gongzuoneirongupload').fileupload({
				url: baseUrl + 'file/upload',
				headers:{ token: window.sessionStorage.getItem("token")},
				dataType: 'json',
				done: function (e, data) {	
					UE.getEditor('gongzuoneirongEditor').execCommand('insertHtml','<img src=\"'+ baseUrl +'upload/'+ data.result.file + '\" width=900 height=560>');					
				}
			});
		}  

		// 表单提交
		function submit() {
			if(validform() ==true && compare() == true){
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				httpJson("jiazhengfuwu/"+urlParam,"POST",data,(res)=>{
					if(res.code == 0){
						window.sessionStorage.removeItem('id');
						let flag = true;
						if(flag){
							alert(successMes);
						}
						if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
							window.sessionStorage.removeItem('onlyme');
							window.location.href="${pageContext.request.contextPath}/index.jsp";
						}else{
							window.location.href="list.jsp";
						}
						
					}
				});
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
			if(ruleForm.gongzuoneirong != null && ruleForm.gongzuoneirong != 'null' && ruleForm.gongzuoneirong != ''){
				var gongzuoneirongMes = '' + ruleForm.gongzuoneirong;
				var gongzuoneirongUeditor = UE.getEditor('gongzuoneirongEditor');
				gongzuoneirongUeditor.ready(function() {
					gongzuoneirongUeditor.setContent(gongzuoneirongMes);
				});
			}
		}  

		// 获取富文本框内容
		function getContent(){
			if(UE.getEditor('gongzuoneirongEditor').hasContents()){
				$('#gongzuoneirong-input').attr('value',UE.getEditor('gongzuoneirongEditor').getPlainTxt());
			}
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    xingbie: {
					},
				    nianling: {
					digits: true,
					},
				    fuwuleixing: {
					},
				    jiazhengleixing: {
					},
				    fuwufeiyong: {
					required: true,
					},
				    lianxifangshi: {
					},
				    gongzuonianshu: {
					digits: true,
					},
				    jiazhengtupian: {
					},
				    gerenjianjie: {
					},
				    gongzuoneirong: {
					},
				},
				messages: {
					xingbie: {
					},
					nianling: {
						digits: "请输入整数",
					},
					fuwuleixing: {
					},
					jiazhengleixing: {
					},
					fuwufeiyong: {
						required: "服务费用不能为空",
					},
					lianxifangshi: {
					},
					gongzuonianshu: {
						digits: "请输入整数",
					},
					jiazhengtupian: {
					},
					gerenjianjie: {
					},
					gongzuoneirong: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
			jQuery.validator.addMethod("isIdCardNo", function(value, element) {
				return this.optional(element) || idCardNoUtil.checkIdCardNo(value);
			}, "请正确输入您的身份证号码");
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("jiazhengfuwu/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												fuwuleixingSelect();
						jiazhengleixingSelect();
						//注册表单验证
						$(validform());	
					}
				});
			}else{
				fuwuleixingSelect();	
				jiazhengleixingSelect();	

		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
		}		
		function calculationSE(colName){
			//单列求和接口
			http("jiazhengfuwu"+colName,"GET",{
				tableName: "jiazhengfuwu",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){

				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#jiazhengxingming").val(ruleForm.jiazhengxingming);	
			var xingbieOptions = document.getElementsByClassName("xingbieOption");
			for(var xingbieCount = 0; xingbieCount < xingbieOptions.length;xingbieCount++){
				if(xingbieOptions[xingbieCount].getAttribute('value') == ruleForm.xingbie){
					xingbieOptions[xingbieCount].setAttribute('selected','selected');
				}
			}
			$("#nianling").val(ruleForm.nianling);	
			var fuwuleixingOptions = document.getElementsByClassName("fuwuleixingOption");
			for(var fuwuleixingCount = 0; fuwuleixingCount < fuwuleixingOptions.length;fuwuleixingCount++){
				if(fuwuleixingOptions[fuwuleixingCount].getAttribute('value') == ruleForm.fuwuleixing){
					fuwuleixingOptions[fuwuleixingCount].setAttribute('selected','selected');
				}
			}
			var jiazhengleixingOptions = document.getElementsByClassName("jiazhengleixingOption");
			for(var jiazhengleixingCount = 0; jiazhengleixingCount < jiazhengleixingOptions.length;jiazhengleixingCount++){
				if(jiazhengleixingOptions[jiazhengleixingCount].getAttribute('value') == ruleForm.jiazhengleixing){
					jiazhengleixingOptions[jiazhengleixingCount].setAttribute('selected','selected');
				}
			}
			$("#fuwufeiyong").val(ruleForm.fuwufeiyong);	
			$("#lianxifangshi").val(ruleForm.lianxifangshi);	
			$("#gongzuonianshu").val(ruleForm.gongzuonianshu);	
			$("#jiazhengtupian-input").val(ruleForm.jiazhengtupian);
			$("#gerenjianjie").val(ruleForm.gerenjianjie);	
			$("#gongzuoneirong").val(ruleForm.gongzuoneirong);	
		}		
		//图片显示
		function showImg(){
			var jiazhengtupianFileName = "\"" + ruleForm.jiazhengtupian + "\"";
			$("#jiazhengtupianImg").attr("src",ruleForm.jiazhengtupian);
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.jiazhengxingming != null && res.data.jiazhengxingming != ''){

					$("#jiazhengxingming").val(res.data.jiazhengxingming);
					}
					if(res.data != null && res.data != '' && res.data.xingbie != null && res.data.xingbie != ''){

					var xingbieOptions = document.getElementsByClassName("xingbieOption");
						for(var xingbieCount = 0; xingbieCount < xingbieOptions.length;xingbieCount++){
							if(xingbieOptions[xingbieCount].getAttribute('value') == res.data.xingbie){
								xingbieOptions[xingbieCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.nianling != null && res.data.nianling != ''){

					$("#nianling").val(res.data.nianling);
					}
					if(res.data != null && res.data != '' && res.data.fuwuleixing != null && res.data.fuwuleixing != ''){

					var fuwuleixingOptions = document.getElementsByClassName("fuwuleixingOption");
						for(var fuwuleixingCount = 0; fuwuleixingCount < fuwuleixingOptions.length;fuwuleixingCount++){
							if(fuwuleixingOptions[fuwuleixingCount].getAttribute('value') == res.data.fuwuleixing){
								fuwuleixingOptions[fuwuleixingCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.jiazhengleixing != null && res.data.jiazhengleixing != ''){

					var jiazhengleixingOptions = document.getElementsByClassName("jiazhengleixingOption");
						for(var jiazhengleixingCount = 0; jiazhengleixingCount < jiazhengleixingOptions.length;jiazhengleixingCount++){
							if(jiazhengleixingOptions[jiazhengleixingCount].getAttribute('value') == res.data.jiazhengleixing){
								jiazhengleixingOptions[jiazhengleixingCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.fuwufeiyong != null && res.data.fuwufeiyong != ''){

					$("#fuwufeiyong").val(res.data.fuwufeiyong);
					}
					if(res.data != null && res.data != '' && res.data.lianxifangshi != null && res.data.lianxifangshi != ''){

					$("#lianxifangshi").val(res.data.lianxifangshi);
					}
					if(res.data != null && res.data != '' && res.data.gongzuonianshu != null && res.data.gongzuonianshu != ''){

					$("#gongzuonianshu").val(res.data.gongzuonianshu);
					}
					if(res.data != null && res.data != '' && res.data.jiazhengtupian != null && res.data.jiazhengtupian != ''){

					$("#jiazhengtupianImg").attr("src",res.data.jiazhengtupian);
					$("#jiazhengtupian-input").val(res.data.jiazhengtupian);
					}
					if(res.data != null && res.data != '' && res.data.gerenjianjie != null && res.data.gerenjianjie != ''){

					$("#gerenjianjie").val(res.data.gerenjianjie);
					}
					if(res.data != null && res.data != '' && res.data.gongzuoneirong != null && res.data.gongzuoneirong != ''){

					$("#gongzuoneirong").val(res.data.gongzuoneirong);
					}
				}
			});  
            }
            window.sessionStorage.removeItem('crossTableName');
			window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			readonly();
		});		

		function readonly(){
			if(window.sessionStorage.getItem('role') != '管理员'){
				$('#jifen').attr('readonly','readonly');
				$('#money').attr('readonly','readonly');
			}
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(largerVal<=smallerVal){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
