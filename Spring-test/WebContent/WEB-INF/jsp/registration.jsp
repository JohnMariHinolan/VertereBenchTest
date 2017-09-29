<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

		<form:form id="registrationForm" modelAttribute="studentForm" action="registrationProcess" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="simpleUsernamePassword.username">Username: </form:label>
                        </td>
                        <td>
                            <form:input path="simpleUsernamePassword.username" name="simpleUsernamePassword.username" id="simpleUsernamePassword.username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="simpleUsernamePassword.password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="simpleUsernamePassword.password" name="simpleUsernamePassword.password" id="simpleUsernamePassword.password" />
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            <form:label path="simpleUsernamePassword.confirmPassword">Confirm Password:</form:label>
                        </td>
                        <td>
                            <form:password path="simpleUsernamePassword.confirmPassword" name="simpleUsernamePassword.confirmPassword" id="simpleUsernamePassword.confirmPassword" />
                        </td>
                    </tr>
                    
                     <tr>
                        <td>
                            <form:label path="lastName">Last Name:</form:label>
                        </td>
                        <td>
                            <form:input path="lastName" name="lastName" id="lastName" />
                        </td>
                    </tr>
                    
                     <tr>
                        <td>
                            <form:label path="firstName">First Name:</form:label>
                        </td>
                        <td>
                            <form:input path="firstName" name="firstName" id="firstName" />
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            <form:label path="middleName">Middle Name:</form:label>
                        </td>
                        <td>
                            <form:input path="middleName" name="middleName" id="middleName" />
                        </td>
                    </tr>
                    <tr>
       						 <td>About you :</td>
        						<td><form:textarea path="aboutYou" /></td>
   					 </tr>
                    
                    <tr>
                        <td>
                            <label>Secret Key:</label>
                        </td>
                        <td>
                            <input  name="secretKey" id="secretKey" />
                        </td>
                    </tr>
                    
                    
                   
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="registerProcess" >Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                     <tr>
                        <td></td>
                        <td><a>${message}</a>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="">Home</a>
                        </td>
                    </tr>
                    
                    
                    
                </table>
            </form:form>
<p>${studentForm.lastName}</p>
</body>
</html>