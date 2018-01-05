<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>
	<form id="form1" name="form1" method="get" action="servlet/ThreeParams">
		<table width="343" border="1">
			<tr>
				<td width="92">param1</td>
				<td width="93"><input name="param1" type="text" id="param1" /></td>
			</tr>
			<tr>
				<td width="92">param2</td>
				<td width="93"><input name="param2" type="text" id="param1" /></td>
			</tr>
			<tr>
				<td width="92">param3</td>
				<td width="93"><input name="param3" type="text" id="param1" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><label><input name="param1" type="submit"
						value="提交" /></label></td>
			</tr>
		</table>
	</form>

</body>
</html>