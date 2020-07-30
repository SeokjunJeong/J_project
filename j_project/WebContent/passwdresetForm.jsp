<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="searchPwPro.do" method="post">
<div class="a">
	<table class="table">
		<th colspan="2">비 밀 번 호 찾 기</th>
		<tr><td></td></tr>
		<tr>
			<td>ID</td>
			<td><input type="text" id="id" name="id" placeholder="내용을 입력해주세요" required="required"></td>
		</tr>
		<tr>
			<td>E-MAIL</td>
			<td><input type="text" id="email" name="email" placeholder="내용을 입력해주세요" required="required"></td>
		</tr>
		<td colspan="2"><input type="submit" value="비밀번호 찾기"></td>
	</table>
</div>
</form>
</body>
</html>