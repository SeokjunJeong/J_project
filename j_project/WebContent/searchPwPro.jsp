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
    searchPwPro.jsp 왔다
	<c:if test="${result > 0}">
		<script type="text/javascript">
			alert("확인 되었습니다. 새 비밀번호로 변경해주세요");
			location.href = "resetPwForm.do?m_id=${m_id}";
		</script>
	</c:if>
	<c:if test="${result == 0}">
		<script type="text/javascript">
			alert("아이디 이메일 정보가 다릅니다. 다시 작성해주세요");
			location.href = "searchPwForm.do";
		</script>
	</c:if>
</body>
</html>