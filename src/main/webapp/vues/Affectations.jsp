<%@ page language="java" contentType="text/html; charset= ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des affectations</title>
<c:set var="cxt" value="${pageContext.request.contextPath }"/>
</head>


<body>
<h1>Département GCR</h1>
<h3>Liste des affectations</h3>
<table border="1">
<c:forEach items="${liste_affectation }" var="t">
<tr>
<th>Matiere</th>
<th>Enseignant</th>
<th>Heure Affectation</th>
</tr>
<tr>
<td>${t.mat }</td>
<td>${t.ens }</td>
<td>${t.NBheure }
</tr>
</c:forEach>
</table>


</body>
</html>