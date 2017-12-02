<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Confirm</title>
</head>
<body>
	<h1>Confirm</h1>
	<%@include file="/WEB-INF/jsp-fragment/common.jspf" %>
	<dl>
		<dt>firstForm.firstValue</dt>
		<dd>
			<c:if test="${!empty firstForm }">
				<c:out value="${firstForm.firstValue }" />
			</c:if>
		</dd>
		<dt>secondForm.secondValue</dt>
		<dd>
			<c:if test="${!empty secondForm }">
				<c:out value="${secondForm.secondValue }" />
			</c:if>
		</dd>
		<dt>thirdForm.thirdValue</dt>
		<dd>
			<c:if test="${!empty thirdForm }">
				<c:out value="${thirdForm.thirdValue }" />
			</c:if>
		</dd>
	</dl>
	<form:form method="POST">
		<p>
			<button type="submit">実行</button>
		</p>
	</form:form>
	<ul>
		<li><a href="${pageContext.request.contextPath}/">home</a></li>
		<li><a href="${pageContext.request.contextPath}/first">first</a></li>
		<li><a href="${pageContext.request.contextPath}/second">second</a></li>
		<li><a href="${pageContext.request.contextPath}/third">third</a></li>
	</ul>

</body>
</html>
