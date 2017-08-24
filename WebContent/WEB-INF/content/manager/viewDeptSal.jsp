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
<title>查看本部门上个月的发薪</title>
<link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="mgrheader.jsp"%>
	<div width="100%" align="center">
		<table class="tableView" align="center">
			<tr bgcolor="#e1e1e1">
				<td colspan="5"><div class="mytitle">您正在查看上个月部门的全部工资</div></td>
			</tr>
			<tr class="pt11" height="45">
				<td><b>员工名</b></td>
				<td><b>薪水</b></td>
			</tr>
			<s:iterator value="sals" status="index">
				<s:if test="#index.odd == true">
					<tr style="background-color: #dddddd" class="pt11" height="32">
				</s:if>
				<s:else>
					<tr class="pt11" height="32">
				</s:else>
				<td><s:property value="empName" /></td>
				<td><s:property value="amount" /></td>
			</s:iterator>
		</table>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>