<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">ADD PRODUCT</h1>

				<form action="save" method="post">
				
				<div class="form-group">
					<lable for="name">Product Name</lable>
					<input type="text" class="form-control" id="name" name="name"
						placeholder="Enter product name"></input>
				</div>


				<div class="form-group">
					<lable for="description">Product Description</lable>
					<textarea rows="5" class="form-control" id="desc"
						name="description" placeholder="Enter product Description"></textarea>

				</div>

				<div class="form-group">
					<lable for="price">Product Price</lable>
					<input type="text" class="form-control" id="name" name="price"
						placeholder="Enter product price"></input>
				</div>


				<div class="container text-center">
					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Add</button>
				</div>


				</form>


			</div>
		</div>
	</div>





</body>
</html>