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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加新员工</title>
<s:head />
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="mgrheader.jsp"%>
	<div width="100%" align="center">
		<table class="tableView" align="center" style="background: none;">
			<tr>
				<td ><h3>请您输入新员工的资料：</h3><br> <s:if test="actionMessages.size()>0">
						<div class="error">
							<s:actionmessage />
						</div>
					</s:if>
					<div align="center">
						<s:form action="processAdd" cssClass="form_wrapper"
							cssStyle="border:0px">
							<s:textfield name="emp.name" label="员工用户名" />
							<s:textfield name="emp.pass" label="员工密码" />
							<s:textfield name="emp.salary" label="员工月薪" />
							<s:token />
							<tr>
								<td colspan="2" ><s:submit cssClass="bottom" value="添加新员工"
										theme="simple" /> </td>
							</tr>
						</s:form>
					</div>
				</td>
			</tr>
		</table>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>
