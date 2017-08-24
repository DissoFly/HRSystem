<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>出错提示页</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%@include file="header.jsp"%>
	<table width="98%" align="center" style="background-size: 100%;"
		background="${pageContext.request.contextPath}/images/bodybg.jpg">
		<tr>
			<td height="39"><br>
				<div align="center">
					<font color="#FF0000" size="+1"><b>系统处理过程中发生了一个错误，信息如下：</b></font>
				</div></td>
		</tr>
		<tr>
			<td height="315" align="center">
				<div class="pt11" align="center"
					style="color: red; width: 600px; height: 300px; border: 1px solid black; border-radius: 10px;">
					${exception.message}
					<s:property value="exception.message" />
			</td>
		</tr>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>

