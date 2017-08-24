<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录系统</title>
<s:head />
</head>
<body>
	<%@include file="header.jsp"%>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/css/style.css" />
	<style type="text/css">
td {
	text-align: left;
}
</style>
	<table width="70%" align="center">
		<tr>
			<s:if test="actionMessages.size()>0">
				<div class="error">
					<s:actionmessage />
				</div>
			</s:if>
			<s:actionerror cssClass="error" />
			<div class="wrapper">
				<div class="content">
					<div id="form_wrapper" class="form_wrapper">

						<%-- <form class="login active" action="processLogin">
								<h3>登录</h3>
								<div>
									<label>用户名:</label> <input type="text" name="manager.name" />
									<span class="errorMessage">This is an error</span>
								</div>
								<div>
									<label>密码: </label> <input type="password" name="manager.pass" />
									<span class="errorMessage">This is an error</span>
								</div>
								<div>
									<label>验证码: <img name="d" src="authImg"></label> <input
										type="text" name="vercode" /> <span class="errorMessage">This
										is an error</span>
								</div>
								<div class="bottom">
									<input type="submit" value="Login"></input>
									<div class="clear"></div>
								</div>
							</form> --%>
						<s:form action="processLogin" cssClass="form_wrapper"
							theme="simple" name="form_login">
							<h3>登录</h3>
							<div>
								<label>用户名:</label>
								<s:textfield name="manager.name" label="用户名" />
								<s:fielderror fieldName="manager.name"
									cssStyle="list-style-type:none" />
							</div>
							<div>
								<label>密码: </label>
								<s:textfield name="manager.pass" label="密码" />
								<s:fielderror fieldName="manager.pass"
									cssStyle="list-style-type:none" />
							</div>
							<div>
								<label>验证码: <img name="d" src="authImg"></label>
								<s:textfield name="vercode" label="验证码" />
								<s:fielderror fieldName="vercode"
									cssStyle="list-style-type:none" />
							</div>
							<s:submit value="登录" cssStyle="margin-top:30px;"/>
							
						</s:form>
					</div>
				</div>
			</div>
			</td>
		</tr>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>
