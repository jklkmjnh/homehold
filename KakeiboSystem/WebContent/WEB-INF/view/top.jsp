
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
家計簿管理システム

<h2>（入力画面）</h2>

<form action ="/KakeiboSystem/TourokuGamen" method ="get">

今日の日付：<input type="text" name ="yaerkey" width = "10px">年<input type="text" name ="monthkey">月<input type="text" name ="daykey">日<br>
項目：		<input type="text" name ="buykey" width = "10px"><br>
収入：		<input type="text" name ="incomkey" width = "10px">円<br>
支出：		<input type="text" name ="spendingkey" width = "10px">円<br>

<input type = "submit" value="登録">
</form>

</body>
</html>