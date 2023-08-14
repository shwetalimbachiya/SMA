<!DOCTYPE html>
<html>
<head>
    <title>Courses List</title>
</head>
<body>
    <h2>Courses List</h2>
    <table>
        <tr>
            <th>Course Name</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${courses}" var="course">
            <tr>
                <td>${course.courseName}</td>
                <td><a href="${contextPath}/courses/delete/${course.id}">❌</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
