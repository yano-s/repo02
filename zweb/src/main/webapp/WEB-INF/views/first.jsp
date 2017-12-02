<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>First</title>
</head>
<body>
	<h1>First</h1>
	<%@include file="/WEB-INF/jsp-fragment/common.jspf" %>
	<form:form modelAttribute="firstForm" method="POST">
		<p>
			<form:label path="firstValue">firstValue</form:label>
			<form:input path="firstValue" />
			<button type="submit">実行</button>
		</p>
		<p><a href="${pageContext.request.contextPath}/">back</a></p>
	</form:form>

</body>
</html>
