<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Ale was here</title>
        </head>

        <body>

        </body>
        <h1>Hola
            <c:out value="${apellidos}"></c:out>
        </h1>
        <p>
            <c:out value="${edad}"></c:out>
        </p>
        <p>
            <c:out value="${usuario.getNombre()} ${usuario.getApellido()}"></c:out>
        </p>

        </html>