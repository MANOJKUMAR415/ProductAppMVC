<html>
<head>

<%@include file="./Base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>

	<div class="container mt-3">

		<div class="row">
			<div class="col-md-12">

				<h1 class="text-center mb-3">List Of Products</h1>


				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">S.NO</th>
							<th scope="col">Product Name</th>
							<th scope="col">DESCIPTION</th>
							<th scope="col">PRICE</th>
							<th scope="col">ACTION</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${product }" var="p">
						<tr>
							<th scope="row">${p.id}</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td>${p.price }</td>
							<td><a href="delete/${p.id }"><i class="fas fa-trash text-danger "></i></a> &nbsp
							<a href="update/${p.id }"><i class="fas fa-pen-nib text-primary "></i></a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<div class="container text-center">
				
				<a href="${pageContext.request.contextPath }/showAddProductForm" class="btn btn-outline-success">ADD Product</a>
				
				</div>
			</div>


		</div>


	</div>



</body>
</html>
