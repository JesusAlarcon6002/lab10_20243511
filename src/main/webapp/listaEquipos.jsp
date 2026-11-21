<%@ page import="dtos.ListadoDto" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: labtel
  Date: 20/11/2026
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<ListadoDto> listadoDtos = (ArrayList<ListadoDto>) request.getAttribute("lista");
%>
<html>
<head>
    <title>Lista de Equipos</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>hostname</th>
            <th>tipo</th>
            <th>ip</th>
            <th>estado</th>
            <th>Nombre de la sede</th>
            <th>ciudad</th>
            <th>Meses</th>
        </tr>
        <% for (ListadoDto lista : listadoDtos){%>
        <th><%=lista.getIdEquipo()%></th>
        <th><%=lista.getHostname()%></th>
        <th><%=lista.getTipo()%></th>
        <th><%=lista.getIpGestion()%></th>
        <th><%=lista.getEstado()%></th>
        <th><%=lista.getSedeNombre()%></th>
        <th><%=lista.getCiudad()%></th>
        <th><%=lista.getMesesOperativos()%></th>
        <%}%>
    </table>
</body>
</html>
