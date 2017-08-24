<%--
网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2012, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>经理首页</title>
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="mgrheader.jsp"%>
	<style type="text/css">
tbody {
	text-align: center;
}
</style>
	<div width="100%" align="center">
		<table class="tableView" align="center" style="background: none;">
			<tr height="60">
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><s:if test="actionMessages.size()>0">
						<div class="error">
							<s:actionmessage cssStyle="font-size: 25px;list-style: none;"/>
						</div>
					</s:if></td>
			</tr>
			<tr height="80">
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td style="font-size: 18px"><s:property value="#session.user" /> ，
					欢迎您使用JavaEE简单工作流系统，您是经理！</td>
			</tr>
			<tr height="60">
				<td>&nbsp;</td>
			</tr>
		</table>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>
