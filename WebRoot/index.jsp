<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<form action="${pageContext.request.contextPath}/User/login.do"
			method="post">
			用户名:<input type="text" name="username"> 密码:<input
				type="password" name="password"> 城市:<input type="text"
				name="name"> 手机号:<input type="text" name="telephone">
			ID:<input type="text" name="likecount"> <input type="submit"
				value="提交">
		</form>
	</table>
	<hr>
	<form action="${pageContext.request.contextPath}/Shop/addShop.do"
		method="post" enctype="multipart/form-data">
		商品名称:<input type="text" name="shopname"> 简介:<input type="text"
			name="description"> 分类:<input type="text" name="category">
		价格:<input type="text" name="price"> 旧的价格:<input type="text"
			name="oldprice"> 用户Id:<input type="text" name="username">
		图片:<input type="file" name="file"> <input type="submit"
			value="提交">
	</form>
	<hr>
	<form action="${pageContext.request.contextPath}/User/upload.do"
		method="post" enctype="multipart/form-data">

		用户名称:<input type="text" name="username"> 图片:<input type="file"
			name="file"> <input type="submit" value="提交">
	</form>

	<hr>
	<form action="${pageContext.request.contextPath}/User/updateUser.do"
		method="post">
		用户姓名:<input type="text" name="username"> 用户ID:<input
			type="text" name="id"> 用户密码:<input type="password"
			name="password"> <input type="submit" value="提交">
	</form>
	<hr>
	<form
		action="${pageContext.request.contextPath}/UserLike/isLove.do" method="post">
		商品ID:<input type="text" name="shopid"> 
		用户姓名:<input type="text" name="username">
		<input type="submit" value="提交">
	</form>
	</span>
</body>
</html>