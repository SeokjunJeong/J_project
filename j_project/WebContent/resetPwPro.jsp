<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${chkpass != newpass  }">
			<script type="text/javascript">
				alert("비밀번호를 확인하세요")
				history.back();
			</script>
		</c:when>
		<c:when test="${result > 0 }">
			<script type="text/javascript">
				alert("수정 완료 ! ");
				location.href = "main.jsp";
			</script>
		</c:when>
		<c:when test="${ result == 0 }">
			<script type="text/javascript">
				alert("실패");
				history.back();
			</script>
		</c:when>
		<c:when test="${ result == -1 }">
			<script type="text/javascript">
				alert("비밀번호 확인");
				history.back();
			</script>
		</c:when>
	</c:choose>
</body>
</html>