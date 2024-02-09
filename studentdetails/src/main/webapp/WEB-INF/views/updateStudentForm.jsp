<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Student</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2 class="mt-4">Update Student</h2>
        <form:form action="/updatedStudent/${student.id}" method="post" modelAttribute="student" class="mt-4">
            <form:hidden id="id" name="id" path="id" value="${student.id}" />
            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label">Name :</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" name="name" value="${student.name}">
                </div>
            </div>
            <div class="form-group row">
                <label for="dept" class="col-sm-2 col-form-label">Department :</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="department" name="department" value="${student.department}">
                </div>
            </div>
            <div class="form-group row">
                <label for="age" class="col-sm-2 col-form-label">Age :</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="age" name="age" value="${student.age}">
                </div>
            </div>
            <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email :</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="email" name="email" value="${student.email}">
                </div>
            </div>
            <div class="form-group row">
                <label for="phonenumber" class="col-sm-2 col-form-label">PhoneNumber:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${student.phoneNumber}">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10 offset-sm-2">
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </div>
        </form:form>
    </div>
</body>
</html>
