<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>all employees</h2>

<table>
    <tr>
        <th>name</th>
        <th>surname</th>
        <th>department</th>
        <th>salary</th>
        <th>operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">


        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="update"
                       onclick="window.location.href='${updateButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br><br>
<input type="button" value="add"
       onclick="window.location.href='addNewEmployee'">

</body>
</html>
