<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="user" action="/mybatis/saveUser" method="post">
	用户名：<form:input id="username" path="username"/><br/>
	密码：<form:input id="password" path="password"/><br/>
	性别：<form:radiobutton path="gender" value="男" label="男"/>
		 <form:radiobutton path="gender" value="女" label="女"/><br/>
	 手机操作系统：<form:radiobuttons path="mobilesys" items="${allmobilesys}" /><br/>
	是否同意此协议：<form:checkbox path="agree"/><br/>
	技能：
		<form:checkbox path="telcols" value="画画" label="画画"/>
		<form:checkbox path="telcols" value="游泳" label="游泳"/>
		<form:checkbox path="telcols" value="编程" label="编程"/>
		<form:checkbox path="telcols" value="足球" label="足球"/>
		<br/>
		<!-- 
			items：数据源，以集合的el表达式描述
			itemLabel：设置那个属性作为显示文本
			itemValue：设置选中的值
		 -->
	拥有的车型：<form:checkboxes items="${allCarList}" path="carLists" itemLabel="brand" itemValue="brandNo" /><br/>
	来自那个国家：<form:select path="country">
				<%-- <form:option value="中国">中国</form:option>
				<form:option value="美国">美国</form:option>
				<form:option value="韩国">韩国</form:option> --%>
				<form:options items="${allCountry}" />
			  </form:select><br/>
	<input type="submit" value="提交"/>		  
</form:form>
</body>
</html>