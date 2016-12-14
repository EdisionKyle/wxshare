<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8" />
<base href="<%=basePath%>">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-transform" />
<title>微信公众平台开发</title>
<link rel="bookmark" href="images/favicon.ico">
<link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />
<link type="text/css" rel="stylesheet" href="css/common.css" />
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5shiv.min.js"></script>
<![endif]-->
</head>
<body class="page-container">
	这是我的小家园...
	<br />
	<img alt="创意" src="images/index_publicity.jpg">
</body>
</html>