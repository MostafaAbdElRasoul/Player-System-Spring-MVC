<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kora Players</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
</head>
<body>
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Name</th>
				<th scope="col">Number</th>
				<th scope="col">Phone</th>
				<th scope="col">Address</th>
				<th scope="col">Services</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="player" items="${players}">
				<tr>
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.number}</td>
					<td>${player.phone}</td>
					<td>${player.address}</td>
					<td>
						<c:url var="editPlayer" value="/kora/showPlayer">
							<c:param name="playerId" value="${player.id}"></c:param>
						</c:url>
							<c:url var="deletePlayer" value="/kora/deletePlayer">
							<c:param name="playerId" value="${player.id}"></c:param>
						</c:url>
						<a href="${editPlayer}" type="button" class="btn btn-primary">Edit</a>
						<a href="${deletePlayer}" type="button" class="btn btn-danger">Delete</a>
					</td>
				</tr>

			</c:forEach>

		</tbody>
	</table>
	<a href="add" type="submit" class="btn btn-primary">Add</a>
</body>
</html>