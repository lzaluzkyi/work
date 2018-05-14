<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
<script src="qb/js/qb.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/bootstrap.min.css">.
<link rel="stylesheet" href="/css/chosen.min.css">
<script src="/js/jquery-3.1.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/chosen.jquery.min.js"></script>
<title>Apartments</title>
</head>
<body>
<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<form:form class="form-horizontal" modelAttribute="photo" action="/photo" method="POST" enctype="multipart/form-data">
						<div class="form-group">
					
						<div class="form-group">
							<label for="file" class="control-label col-sm-2">Select img:</label>
							<div class="col-sm-10">
								<input name="file" id="file" type="file">
						<div class="form-group">
							<div class="col-sm-10 col-sm-offset-2">
								<button class="btn btn-success" type="submit">Create</button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
			<div class="row">
			<div class="col-sm-12">
				<table class="table table-bordered">
					<tr>
					</tr>
					<c:forEach var="photo" items="${photos}">
						<tr>
							<td><img width="100%" alt="Photo image" src=/images/${photo.photoUrl}></td>
							
						</tr>
					</c:forEach>
				</table>
				
			</div>
		</div>
	<a class="quickbox" href="C:/images/a.jpg" title="Описание фотографии">
  <img src="/images/a.jpg" alt="sss">
</a>
		
										<td><img width="100%" alt="Photo image" src="/images/da5265ab-7817-4363-b96e-84b4390df88f.jpg"></td>
			
						</body>
</html>


