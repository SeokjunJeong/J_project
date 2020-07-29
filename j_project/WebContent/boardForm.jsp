<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
<link rel="stylesheet" href="CSS/style.css" type="text/css">
</head>
<body>
<div id="div">
	<table class="bd" border="2">
		<colgroup>
			<col width="50" />
			<col width="50" />
			<col width="500" />
			<col width="100" />
			<col width="100" />
			<col width="100" />
			<col width="100" />
		</colgroup>
		<thead>
				<tr>
					<th>번 호</th>
					<th>구 분</th>
					<th>제 목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조 회</th>
					<th>추 천</th>
				</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>공지사항</td>
				<td>운영자</td>
				<td>2020-07-28</td>
				<td>20</td>
				<td>10</td>		
		</tbody>
		<tfoot>
				<tr>
					<td align= "center" colspan="7">1</td>
				</tr>
		</tfoot>
			
					
			
	</table>
	<br>
	
	<select name="search" id="search">
		<option value="제목">제목</option>
		<option value="제목+내용">제목+내용</option>
		<option value="작성자">작성자</option>
	</select>
	<input type="text" name="sc" id="sc"><input type="button" name="chk" id="chk" value="검색">
	<input  type="button" id="a" value="글쓰기" onclick=""/>
</div>
	
</body>
</html>