<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 11/12/2016
  Time: 06:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%@ taglib prefix="logic" uri="http://jakarta.apache.org/struts/tags-logic" %>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Soy RPN 17008</h1>
<label><bean:write name="formRpn17008" property="messageTest"/></label>

<!--Rpn-17008-->
<html:form action="/rpn-17008/extracto" styleId="formConsulta">
    <p>
        <html:radio property="proceso" value="consulta" onchange="this.form.submit()" styleId="consultaChek">
            <label>Consulta</label>
        </html:radio>
        <html:radio property="proceso" value="extracto" onchange="this.form.submit()" styleId="extractoChek">
            <label>Extracto</label>
        </html:radio>
    </p>
    <p>
        <label>Condigo Asesor</label>
        <html:text property="codigoAsesor"/>
    </p>
    <p>
        <label>Periodo:</label>
        <html:select property="temporada">
            <html:option value="Trimestre"/>
            <html:option value="Mensual"/>
        </html:select>
    </p>
    <p>
        <logic:equal property="extractoProceso" value="true" name="formRpn17008">
            <label>Mes:</label>'''
            <html:select property="mensual">
                <html:option value="Enero"/>
                <html:option value="Febrero"/>
                <html:option value="Marzo"/>
                <html:option value="Abril"/>
                <html:option value="Mayo"/>
                <html:option value="Junio"/>
                <html:option value="Julio"/>
                <html:option value="Agosto"/>
                <html:option value="Septiembre"/>
                <html:option value="Octubre"/>
                <html:option value="Noviembre"/>
                <html:option value="Diciembre"/>
            </html:select>
        </logic:equal>
    </p>
    <p>
    <logic:equal property="extractoProceso" value="true" name="formRpn17008">
        <p>
            <label>Asesor:</label>
            <html:radio property="puesto" value="Asesor"/>
            <label>Promotor:</label>
            <html:radio property="puesto" value="Promotor"/>
            <label>Ambos:</label>
            <html:radio property="puesto" value="Ambos"/>
        </p>
    </logic:equal>
    </p>

    <html:submit value="Send"/>
</html:form>
<label>Lista Uno</label>
<logic:iterate id="list" name="formRpn17008" property="list">
    <br>
    <bean:write name="list" property="messageTest"/>
</logic:iterate>
<br>
<label>Lista Dos</label>
<logic:iterate id="list2" name="listaAction">
    <br>
    <bean:write name="list2" property="messageTest"/>
</logic:iterate>
<br><br>
</body>
</html>
