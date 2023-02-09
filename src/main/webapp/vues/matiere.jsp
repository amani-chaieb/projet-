<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des matieres</title>
<c:set var="cxt" value="${pageContext.request.contextPath }"/>
</head>
<body>
<h1>Département GCR</h1>
<h3>Liste des matiéres</h3>
<table border="1">
<tr>
<th>ID</th>
<th>Titre</th>
<th>Niveau</th>
<th>Nbre_Heure</th>
</tr>
<c:forEach items="${ liste_matiere}" var="s">

<tr>
<td>${s.id}</td>
<td>${s.titre }</td>
<td>${s.niveau }</td>
<td>${s.NbHeure }</td>
</tr>
</c:forEach>
</table>
</body>
</html>