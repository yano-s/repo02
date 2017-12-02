<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
	<h1>セッションテスト!</h1>
	<%@include file="/WEB-INF/jsp-fragment/common.jspf" %>

	<p><a href="${pageContext.request.contextPath}/first">/first</a></p>
	
</body>
</html>
