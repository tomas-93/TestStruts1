<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 11/12/2016
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        function submitX(form, url)
        {
            form.action = url;
            form.submit();
        }
    </script>
</head>
<body>
<a href="/ejemplo1.do">Ejemplo 1</a>
<a href="/ejemplo2.do">Ejemplo 2</a>
<a href="/ejemplo3.do">Ejemplo 3</a>
<a href="/rpn-17008/extracto.do">Ejemplo de Formulario</a>

<form method="post">
    <button onclick="submitX(this.form, '/ejemplo1.do')">Ejemplo1</button>
    <button onclick="submitX(this.form, '/ejemplo2.do')">Ejemplo2</button>
</form>

</body>
</html>
