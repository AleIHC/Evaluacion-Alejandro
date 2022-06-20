<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Compra tu celular aquí</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="container">
                    <c:if test="${msgError!= null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <form:form action="/compracelular/celular" method="post" modelAttribute="celular">
                        <form:label path="marca" class="form-label">Marca:</form:label>
                        <form:input path="marca" class="form-control" />
                        <br>
                        <form:label path="modelo" class="form-label">Modelo:</form:label>
                        <form:input path="modelo" class="form-control" />
                        <br>
                        <form:label path="os" class="form-label">Sistema operativo:</form:label>
                        <form:input path="os" class="form-control" />
                        <br>
                        <form:label path="precio" class="form-label">Precio que ofreces:</form:label>
                        <form:input type="number" path="precio" class="form-control" />
                        <br>
                        <button type="submit" class="btn btn-outline-warning">Agregar al carrito</button>
                    </form:form>
                </div>
            </body>

            </html>