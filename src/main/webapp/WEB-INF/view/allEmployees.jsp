<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>
<h2>inf for all employees</h2>
<br><br>
<security:authorize access="hasRole('HR')">
<input type="button" value="salary" onclick="window.location.href='hr_info'">
<br>
only for HR
</security:authorize>
<br><br>
<security:authorize access="hasRole('IT')">
<input type="button" value="performance" onclick="window.location.href='manager_info'">
<br>
only for managers
</security:authorize>
</body>
</html>
