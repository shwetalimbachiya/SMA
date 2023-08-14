<!DOCTYPE html>
<html>
<head>
    <title>Results List</title>
</head>
<body>
    <h2>Results List</h2>
    <table>
        <tr>
            <th>Course</th>
            <th>Student</th>
            <th>Score</th>
        </tr>
        <c:forEach items="${results}" var="result">
            <tr>
                <td>${result.course.courseName}</td>
                <td>${result.student.firstName} ${result.student.familyName}</td>
                <td>${result.score}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
