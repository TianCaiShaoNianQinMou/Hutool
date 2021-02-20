<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>

	<head>
		<meta charset="utf-8">
		<title>登陆</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="./css/login.css"/>
		<script src="js/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			.regist{
				text-align: center;
				color: #000000;
				margin-top: 1.875rem;
			}
		</style>
	</head>

	<body>
		<script src="js/mui.js"></script>
		<script type="text/javascript">
			mui.init()
		</script>
		<form  id="login" method="post">
			<div  id="user">

				<input type="text" placeholder="请输入用户名" value="" id="user_name"  name="user_uname" >
			</div>
			<div id="password">
				
				<input type="password"id="userpass" value="" name="user_password" placeholder="请输入密码" >
			</div>
			<div>
				<input type="submit" id="login_submit" name="" value="登 陆"/>
			</div>
		</form>
		
		<script type="text/javascript">
			$(function(){
				$("#login").submit(function(){
					//alert($(this).serialize())
					console.log($(this).serialize());
					$.post("http://localhost:8089/Hutool/user.do?method=login",$(this).serialize(),function(data){
						if(data.flag==true){
							window.location = "erweima.jsp";
						}else{
							alert(data.errmsg);
						}
					})
					return false;
				})
			})
		</script>
	</body>

</html>
