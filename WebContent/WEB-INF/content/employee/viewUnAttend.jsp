
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看自己的非正常出勤</title>
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="empheader.jsp"%>
	<style type="text/css">
.unAttend {
	max-width: 600px;
	width: 100%;
	align-content: center;
	background: #cccccc;
}
</style>
	<div align="center" width="100%">
		<table class="unAttend" align="center">
			<tr bgcolor="#e1e1e1">
				<td colspan="4"><div class="mytitle">
						当前用户：
						<s:property value="#session.user" />
					</div></td>
			</tr>
			<tr bgcolor="#e1e1e1">
				<td colspan="4">您只能查看最近三天的非正常打卡，如有异议，请立即向经理申请</td>
			</tr>
			<tr class="pt11" height="45">
				<td width="29%"><b>打卡日期</b></td>
				<td width="20%"><b>异动名称</b></td>
				<td width="26%"><b>打卡时间</b></td>
				<td width="25%">&nbsp;</td>
			</tr>
			<s:iterator value="unAttend" status="index">
				<s:if test="#index.odd == true">
					<tr style="background-color: #dddddd" class="pt11" height="32">
				</s:if>
				<s:else>
					<tr class="pt11" height="32">
				</s:else>
				<td><s:property value="dutyDay" /></td>
				<td><s:property value="unType" /></td>
				<td><s:property value="time" /></td>
				<td><a href='appChange.action?attid=<s:property value="id"/>'>申请改变</a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>