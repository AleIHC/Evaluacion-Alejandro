<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

            <html>

            <head>
                <meta charset="UTF-8">
                <title>Carrito de compras</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="contaier">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">*</th>
                                <th scope="col">Marca</th>
                                <th scope="col">Modelo</th>
                                <th scope="col">Sistema operativo</th>
                                <th scope="col">Precio que deseas ofrecer</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="celular" items="${celularesDelCarrito}">
                                <tr>
                                    <th scope="row">${celular.id}</th>
                                    <td>${celular.marca}</td>
                                    <td>${celular.modelo}</td>
                                    <td>${celular.os}</td>
                                    <td>${celular.precio}</td>
                                    <td><a class="btn btn-warning" href="" role="button">Eliminar</a></td>
                                    <td><a class="btn btn-danger" href="" role="button">Editar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

            </body>

            </html>