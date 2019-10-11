<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Paciente</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="Css/background.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>

    <body>
        <nav class="navbar navbar-default fixed-top">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <div class="navbar-header">

                    <a class="navbar-brand" href="index.html">Eps chingona</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="nav-item active">
                        <a href="HomePaciente.html">Home Paciente</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">Opiones<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <a href="PedirCita.html">Pedir cita</a>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li class="nav-item">
                                <a href="VerCitasPaciente.html">Ver Citas</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h1 style="color: black;">
                        Registro Medico:
                    </h1>
                    <div id="formUsuario">
                        <h3>Ingrese la fecha para ver disponibilidad</h3>
                        <form action="Registroe" method="post">
                            <input type="text" class="campos" name="fecha" placeholder="fecha" value="${fecha}" required="required"
                                   maxlength="7" />
                            <input type="text" class="campos" name="hora" placeholder="hora" value="${hora}" required="required"
                                   maxlength="7" />
                            <br>
                            <br></br><input type="submit" class="btn btn-success" value="Buscar" />
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="list-group">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-12 text-center" >
                                    <h1 class="mt-5">Medicos</h1>
                                </div>
                                <div class="col-lg-12 text-center">
                                    <c:forEach items="${lista}" var="medico" varStatus="status">
                                        <div id="formUsuario">
                                            <p><c:out value="${medico.nombres}"/></p>  
                                        </div>
                                        <br>
                                        <div>
                                            <form action="reservar" method="GET">
                                                <input type="hidden" name="paciente" value="${paciente}">
                                                <input type="hidden" name="reserva" value="${medico.login}">
                                                <input type="hidden" name="fecha" value="${fecha}">
                                                <input type="hidden" name="horas" value="${hora}">
                                                <button type="submit">Agendar</button>
                                            </form>
                                        </div>
                                    </c:forEach>

                                </div>
                            </div>
                        </div>
                    </div>                
                </div>
            </div>
        </div>
    </body>

</html>