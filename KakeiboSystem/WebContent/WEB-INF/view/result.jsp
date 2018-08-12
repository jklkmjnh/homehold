<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Dto" %>

<%@ page import="java.util.ArrayList"%>
<%@
ArrayList list = (ArrayList) application.getAttribute("scope1");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>リザルト画面</title>
</head>
<body>



<%request.setCharacterEncoding("UTF-8");


Dto result = (Dto)request.getAttribute("Dto");
%>
<p>登録結果</p>

<table>

<tr>
<th>tosi</th>
<th>tuki</th>
<th>hi</th>
<th>youkenn</th>
<th>kane1</th>
<th>kane2</th>

</tr>

<c:forEach var ="dto" items = "${dto}">

<tr>

<td>${dto.tosi}</td>

</tr>

</c:forEach>

</table>



</body>
</html>