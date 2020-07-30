<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
resetPwForm.jsp 왔다
${dbid}
"${dbid}"
"${m_id}"
${m_id}
<form action="resetPwPro.do" method="post">
<div class="a">
	<table class="table">
		<th colspan="2">비 밀 번 호 변 경</th>
		<tr><td><input type="hidden" id="id" name="id" value = "${m_id}"></td></tr>
		<tr>
			<td>새 비밀번호</td>
			<td><input type="password" id="newpass" name="newpass" placeholder="내용을 입력해주세요" required="required"></td>
		</tr>
		<td colspan="2"><input type="submit" value="비밀번호 변경"></td>
	</table>
</div>
</form>
</body>
</html>