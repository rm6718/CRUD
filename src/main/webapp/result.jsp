<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 9/26/16
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Result</title>
</head>

<body>

<p>
    Yay Food!
</p>


<%
    Enumeration e = request.getParameterNames();
    while(e.hasMoreElements()){
        String key = e.nextElement().toString();
%>
    <%=key%> : <%=request.getParameter(key)%> <br>
<%
    }
%>

</body>

</html>