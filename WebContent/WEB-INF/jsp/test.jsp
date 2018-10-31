<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello, World!</title>
</head>
<body>
    <%= new java.util.Date() %>
	<form method="POST" action="./">
		●この本はおもしろいですか？　
		<div style="border-top-width: 10px;padding-bottom: 10px;">
			姓<input type="text" name="name1" value="" />
		</div>
 		<div style="border-top-width: 10px;padding-bottom: 10px;">
			名<input type="text" name="name2" value="" />
		</div>
		<input type="submit" value="登録" />
	</form>

</body>
</html>