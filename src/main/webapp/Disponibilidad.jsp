<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Medico</title>
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
                <li class="nav-item">
                    <a href="index.html">Home Medico</a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Opiones<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li class="nav-item active">
                            <a href="RegistroPaciente.html">Agregar disponibilidad</a>
                        </li>
                        <li role="separator" class="divider"></li>
                        <li class="nav-item">
                            <a href="RegistroMedico.html">Ver Citas</a>
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
                    Disponibilidad:
                </h1>
                <div id="formUsuario">
                    <h3>Agregue sus dias de trabajo</h3>
                    <form action = "Registroe" method="post">
                        <input type="checkbox" value=""> Lunes
                        <input type="checkbox" value=""> Martes
                        <input type="checkbox" value=""> Miercoles
                        <input type="checkbox" value=""> Jueves
                        <input type="checkbox" value=""> Viernes
                        <input type="checkbox" value=""> Sabado
                        <input type="checkbox" value=""> Domingo
                    </form>
                    <h3>Agregue sus horas por dia</h3>
                    <form action="agendar" method="GET">
                        <input type="text" class="campos" name="fecha" placeholder="DD:MM:AA" required="required"
                            maxlength="20" />
                        <a>Franja1</a>
                        <br>
                        <input type="text" class="campos" name="horaI" placeholder="HH:MM" required="required"
                            maxlength="20" />
                        <input type="text" class="campos" name="horaF" placeholder="HH:MM" required="required"
                            maxlength="20" />
                        <br>
                        <a>Franja1</a>
                        <br>
                        <input type="text" class="campos" name="horaI2" placeholder="HH:MM" required="required"
                            maxlength="20" />
                        <input type="text" class="campos" name="horaF2" placeholder="HH:MM" required="required"
                            maxlength="20" />
                        <br>
                        <input type="submit" class="btn btn-success" value="Registrar" />
                        <br>
                        <br>
                        <br>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>