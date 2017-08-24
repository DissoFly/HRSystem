<%--
网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2012, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子打卡</title>
<link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<%@include file="../header.jsp"%>
<%@include file="mgrheader.jsp"%> 
<table align="center" width="100%">
		<tr>
			<td colspan="3"><br /> <br />
				<h3 align="center">电子打卡系统</h3></td>
		</tr>
		<tr>
			<td colspan="3" style="text-align: center;"><br /> <!-- 当punchIsValid为1、3时，可上班打卡 -->
				<s:if test="punchIsValid==1 
	|| punchIsValid==3">
					<s:form cssClass="form_wrapper" action="managerCome"
						cssStyle="border:0px" theme="simple">
						<s:submit cssClass="bottom" value="上班打卡" cssStyle="float:none"/>
					</s:form>
				</s:if> <s:if test="punchIsValid!=1 && punchIsValid!=3">
					<div class="form_wrapper" style="border: 0px">
						<input type="submit" class="bottom"  value="上班打卡(未开放)"
							style="color: rgba(189, 189, 189, 1);float:none">
					</div>

				</s:if> <!-- 当punchIsValid为2、3时，可下班打卡 --> <s:if
					test="punchIsValid==2
	|| punchIsValid==3">
					<s:form cssClass="form_wrapper" action="managerLeave"
						cssStyle="border:0px" theme="simple">
						<s:submit cssClass="bottom" value="下班打卡" cssStyle="float:none"/>
					</s:form>
				</s:if>
				<s:if test="punchIsValid!=2 && punchIsValid!=3">
					<div class="form_wrapper" style="border: 0px">
						<input type="submit" class="bottom" name="下班打卡" value="下班打卡(未开放)"
							style="color: rgba(189, 189, 189, 1);float:none">
					</div>

				</s:if> <br /></td>
		</tr>
	</table>
<%@include file="../footer.jsp"%> 
</body>
</html>
