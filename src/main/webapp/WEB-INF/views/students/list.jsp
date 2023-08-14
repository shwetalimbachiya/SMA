<!DOCTYPE html>
<html>
<head>
    <title>Students List</title>
</head>
<body>
    <h2>Students List</h2>
    <table>
        <tr>
            <th>Name & Family Name</th>
            <th>DOB</th>
            <th>Email</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.firstName} ${student.familyName}</td>
                <td>${student.dateOfBirth}</td>
                <td>${student.emailAddress}</td>
                <td><a href="${contextPath}/students/delete/${student.id}">❌</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
