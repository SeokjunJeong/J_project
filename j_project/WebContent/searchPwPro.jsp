<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${result == 0}">
		<script type="text/javascript">
			alert("이메일로 인증번호를 보냈습니다.");
			location.href = "searchPwForm.jsp";
		</script>
	</c:if>
	<c:if test="${result == 1}">
		<script type="text/javascript">
			alert("아이디가 다릅니다. 다시 작성해주세요");
			location.href = "searchPwForm.jsp";
		</script>
	</c:if>
	<c:if test="${result == 2}">
		<script type="text/javascript">
			alert("e-mail이 다릅니다. 다시 작성해주세요");
			location.href = "searchPwForm.jsp";
		</script>
	</c:if>
</body>
</html>