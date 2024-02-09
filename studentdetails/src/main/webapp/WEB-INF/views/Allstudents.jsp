<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Students List</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Optional: Add custom styles */
        body {
            padding: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="mt-4">Students List</h2><br>
        <form action="/addStudent" method="get">
                                    <input type="hidden" name="Add Student">
                                    <button type="submit" class="btn btn-primary">Add Student</button>
                                </form>
        <div class="table-responsive mt-4">
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>Name</th>
                        <th>Department</th>
                        <th>Age</th>
                        <th>Email</th>
                        <th>PhoneNumber</th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="student" items="${Allstudents}">
                        <tr>
               
                            <td>${student.name}</td>
                            <td>${student.department}</td>
                            <td>${student.age}</td>
                            <td>${student.email}</td>
                            <td>${student.phoneNumber}</td>
                            <td>
                                <form action="/updateStudent/${student.id}" method="get">
                                    <input type="hidden" name="id" value="${student.id}">
                                    <button type="submit" class="btn btn-primary">Update</button>
                                </form>
                            </td>
                            <td>
                                <form action="/deleteStudent/${student.id}" method="get">
                                    <input type="hidden" name="id" value="${student.id}">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
