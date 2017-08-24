<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提出异动申请</title>
<s:head />
</head>
<body>
	<%@include file="../header.jsp"%>
	<%@include file="empheader.jsp"%>
	<div width="100%" align="center">
		<table class="tableView" align="center" style="background: none;">
			<tr>
				<td>
					<div align="center">
						<s:form action="processApp" cssClass="form_wrapper" cssStyle="width:100%">
							<tr bgcolor="#e1e1e1">
								<td colspan="2"><div class="mytitle">
										当前用户:
										<s:property value="#session.user" />
									</div></td>
							</tr>
							<tr bgcolor="#e1e1e1">
								<td colspan="2">请填写异动申请</td>
							</tr>
							<input type="hidden" name="attId" value="${param.attid }" />
							<s:select name="typeId" label="申请类别" labelposition="left"
								list="types" listKey="id" listValue="name" />
							<s:textarea name="reason" rows="5" cols="20" label="申请理由" />
							<tr>
								<td colspan="2"><s:submit cssClass="bottom" value="提交申请" heme="simple" /> </td>
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