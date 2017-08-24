
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工查看自己的工资</title>
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="empheader.jsp"%>
	<div width="100%" align="center">
		<table class="tableView" align="center">
			<tr bgcolor="#e1e1e1">
				<td colspan="5"><div class="mytitle">
						当前用户：
						<s:property value="#session.user" />
					</div></td>
			</tr>
			<tr class="pt11" height="45">
				<td><b>发薪月份</b></td>
				<td><b>薪水</b></td>
			</tr>
			<s:iterator value="salarys" status="index">
				<s:if test="#index.odd == true">
					<tr style="background-color: #dddddd" class="pt11" height="32">
				</s:if>
				<s:else>
					<tr class="pt11" height="32">
				</s:else>
				<td><s:property value="payMonth" /></td>
				<td><s:property value="amount" /></td>
			</s:iterator>

		</table>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>