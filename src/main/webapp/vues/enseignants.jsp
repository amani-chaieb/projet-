<%@ page language="java" contentType="text/html; charset= ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des enseignants</title>
<c:set var="cxt" value="${pageContext.request.contextPath }"/>
</head>


<body>
<h1>Département GCR</h1>
<h3>Liste des enseignants</h3>
<table border="1">
<tr>
<th>ID</th>
<th>Prénom</th>
<th>Nom</th>
<th>Charge</th>
</tr>
<c:forEach items="${list_enseignants}" var="s">

<tr>
<td>${s.id}</td>
<td>${s.nom }</td>
<td>${s.prenom }</td>
<td>${s.charge }</td>
</tr>

</c:forEach>
</table>


</body>
</html>