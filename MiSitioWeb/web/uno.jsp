<%-- 
    Document   : uno
    Created on : 28/09/2018, 11:59:59 AM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

<%
  String strA, strB;
  int a,b,c;
  strA = request.getParameter("opA");
  strB = request.getParameter("opB");
  a =Integer.parseInt(strA);
  b = Integer.parseInt(strB);
  c = a+b;
  response.getWriter().print("<h1>Suma de "+a+" y "+b+" es: "+c+"</h1>");
%>
