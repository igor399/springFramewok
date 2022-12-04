<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear noob, go uot from this page</h2>
<br><br><br>
<%--Your name: ${param.employeeName}--%>
Name: ${employee.name}
<br><br><br>
Surname: ${employee.surname}
<br><br><br>
Salary: ${employee.salary}
<br><br><br>
Department: ${employee.department}
<br><br><br>
Bike: ${employee.bikeBrand}
<br><br><br>
Lang's:<ul><c:forEach var="lang" items="${employee.languages}">
        <li>
                ${lang}
        </li>
    </c:forEach>
</ul>
</body>
</html>
