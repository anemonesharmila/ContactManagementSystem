<%-- 
    Document   : sendEmail
    Created on : Apr 28, 2016, 12:13:20 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form-contact" action="" method="post">
            <div>
                <label>First Name:</label>
                <input type="text" name="firstName" required="required" />
            </div>
            <div>
                <label>Last Name:</label>
                <input type="text" name="lastName" required="required" />
            </div>
            <div>
                <label>Address:</label>
                <input type="text" name="address" required="required" placeholder="Enter the first name"/>
            </div>
            <div>
                <label>Email:</label>
                <input type="text" name="email" required="required" placeholder="Enter the last name" />
            </div>
            <div>
                <label>Phone number:</label>
                <input type="text" name="phoneNumber" required="required" placeholder="Enter the phone number" />
            </div>
            <div>
                <label>Subject:</label>
                <input type="text" name="subject" required="required" placeholder="Enter the subject"/>
            </div>
            <div>
                <label>Message:</label>
                <textarea type="text" name="message" required="required" placeholder="enter the message"></textarea>
            </div>
            <button name="submit" type="submit">send</button>
        </form>
    </body>
</html>
