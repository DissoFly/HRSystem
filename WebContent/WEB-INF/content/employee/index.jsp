
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工首页</title>
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="empheader.jsp"%>
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
			<td style="font-size: 18px"><s:property value="#session.user" />
				，欢迎您使用JavaEE简单工作流系统，您是普通员工</td>
		</tr>
		<tr height="60">
			<td>&nbsp;</td>
		</tr>
	</table>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>
