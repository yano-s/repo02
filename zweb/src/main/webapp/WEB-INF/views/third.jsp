<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Third</title>
</head>
<body>
	<h1>Third</h1>
	<%@include file="/WEB-INF/jsp-fragment/common.jspf" %>
	<form:form modelAttribute="thirdForm" method="POST">
		<p>
			<form:label path="thirdValue">secondValue</form:label>
			<form:input path="thirdValue" />
			<button type="submit">実行</button>
		</p>
		<p><a href="${pageContext.request.contextPath}/second">back</a></p>
	</form:form>

</body>
</html>
