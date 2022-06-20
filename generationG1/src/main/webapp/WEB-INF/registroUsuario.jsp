<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Registro</title>
    </head>

    <body>
        <div>
            <!-- pasar informacion desde la vista a una url(action)-->
            <!-- method "get" es por default, los parametros se ven en la ruta -->
            <!-- method "post", los parametros no se ven, van ocultos-->
            <form action="/registro/usuario" method="post">
                <label for="nombre">
                    Nombre:
                </label>
                <input type="text" id="nombre" name="nombre">
                <br>
                <label for="apellido">
                    Apellido:
                </label>
                <input type="text" id="apellido" name="apellido">
                <br>
                <label for="edad">
                    Edad:
                </label>
                <input type="number" id="edad" name="edad">
                <br>

                <input type="submit" value="Registrar">
                <input type="button" value="Enviar">
            </form>
        </div>
    </body>

    </html>