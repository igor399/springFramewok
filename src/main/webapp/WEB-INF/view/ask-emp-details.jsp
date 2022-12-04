<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h1>ENTER YOUR DETAILS MR.</h1>
<br><br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department -> <form:select path="department">
    <form:options items="${employee.departments}"/>
    <form:errors path="department"/>
</form:select>

    <br><br>
    Chose your bike:
    <form:radiobuttons path="bikeBrand" items="${employee.bikeBrands}"/>
    <br><br>
    Lang's:
    <form:checkboxes path="languages" items="${employee.langs}"/>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
