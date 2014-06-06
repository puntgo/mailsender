<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<style type="text/css">
@import url("<%=request.getContextPath() %>/style/css/bootstrap.css");
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

<form action="<%=request.getContextPath() %>/MailController" method="get" >
<input type="text" name='from' class='form-control' placeholder='From' style="width: 200px;height: 30px"><br>
<input type="password" name='password' class='form-control' placeholder='Password' style="width: 200px;height: 30px"><br>
<input type="text" name='to' class='form-control' placeholder='To' style="width: 200px;height: 30px"><br>
<textarea rows="5" cols="100" name='message'></textarea><br>
<input type="submit" name="submit" value="Submit" class="btn btn-default">
</form>

</body>
</html>