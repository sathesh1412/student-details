<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     <style>
     .custom-background {
        background-color: #f0f0f0; /* Your custom background color */
        padding: 20px;  
        border-radius: 10px;
        
    }
     
     h3.custom-h1 {
        color: #ffffff; /* Text color */
        background-color: #333333; /* Background color */
        padding: 10px; /* Optional: Add padding for better visual appearance */
        border-radius: 5px; /* Optional: Add border radius for rounded corners */
    }
  </style>
</head>
<body class="bg-light">
    <div class="container-fluid custom-background">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h3 class="custom-h1 text-center">Add Student</h3>
                        <form:form method="post" action="/savedStudents">
                          
                            <div class="form-group">
                                <label for="name">Name</label>
                                <input type="text" class="form-control" name="name" id="name" path="name" />
                            </div>
                            <div class="form-group">
                                <label for="department">Department</label>
                                <input type="text" class="form-control" name="department" id="department" path="department" />
                            </div>
                             <div class="form-group">
                                <label for="age">Age</label>
                                <input type="text" class="form-control" name="age" id="age" path="age" />
                            </div>
                             <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" name="email" id="email" path="email" />
                            </div>
                             <div class="form-group">
                                <label for="phoneNumber">PhoneNumber</label>
                                <input type="text" class="form-control" name="phoneNumber" id="phoneNumber" path="phoneNumber" />
                            </div>
                            <button class="btn btn-primary btn-block" type="submit">Click</button>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
