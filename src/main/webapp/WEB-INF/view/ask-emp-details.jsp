<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h1>ENTER YOUR DETAILS MR.</h1>
<br><br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department -> <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <input type="submit" value="OK">
</form:form>


</body>
</html>
