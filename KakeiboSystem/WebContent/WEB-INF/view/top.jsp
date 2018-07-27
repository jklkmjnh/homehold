
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

<form action ="KakeiboSystem/result" method ="get"></form>

日付：<input type="text" name ="yaerkey" width = "10px">年<input type="text" name ="monthkey">月<input type="text" name ="daykey">日<br>
項目：<input type="text" name ="buykey"><br>
収入：<input type="text" name ="incomkey">円<br>
支出：<input type="text" name ="spendingkey">円<br>

<input type = "submit" value="登録">

</body>
</html>