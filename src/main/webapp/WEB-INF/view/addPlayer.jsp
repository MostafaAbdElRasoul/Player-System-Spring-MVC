<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Player</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/styles.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
</head>
<body>
	<fo:form action="savePlayer" modelAttribute="player" method="POST">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="name">Name</label>
				<fo:input path="name" class="form-control" id="name" placeholder="Name" />
			</div>
			<div class="form-group col-md-6">
				<label for="number">Number</label>
				<fo:input path="number" class="form-control" id="number"
					placeholder="Number" />
			</div>
		</div>
		<div class="form-group">
			<label for="phone">Phone</label>
			<fo:input path="phone" class="form-control" id="phone" placeholder="phone" />
		</div>
		<div class="form-group">
			<label for="address">Address</label>
			<fo:input path="address" class="form-control" id="address"
				placeholder="address" />
		</div>

		<button type="submit" class="btn btn-primary">Add</button>
	</fo:form>

</body>
</html>