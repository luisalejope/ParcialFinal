<!DOCTYPE html>
<html lang="en">

    <head>
            <meta charset="UTF-8" />
            <!-- Compiled and minified CSS -->
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
            <!--Import Google Icon Font-->
            <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <!--Import Google Roboto Font-->
            <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
            <!--Import materialize.css-->
            <link type="text/css" rel="stylesheet" href="CSS/materialize.min.css" media="screen,projection" />
            <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
            <!--Import main.css-->
            <link type="text/css" rel="stylesheet" href="CSS/main.css">
            <!--Title-->
            <title>Pedir Cita</title>
    </head>

    <body>
        <!--Navbar-->
    <nav>
            <div class="nav-wrapper blue darken-2">
                <a href="HomePaciente.jsp" class="brand-logo right">Home Paciente</a>
                <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
                <ul class="left hide-on-med-and-down">
                    <li><a href="paciente?paciente=${usuario.login}">Pedir Cita</a></li>
                    <li><a href="badges.html">Ver Historial Médico</a></li>
                    <li><a href="historialcitaspa.html">Historial Citas</a></li>
                    <li><a href="VerCitasPaciente.html">Ver Citas</a></li>
                </ul>
            </div>
        </nav>
    
        <ul class="sidenav" id="mobile-demo">
            <li><a href="paciente?paciente=${usuario.login}">Pedir Cita</a></li>
            <li><a href="badges.html">Ver Historial Médico</a></li>
            <li><a href="historialcitaspa.html">Historial Citas</a></li>
            <li><a href="VerCitasPaciente.html">Ver Citas</a></li>
        </ul>
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
                            <br></br><input type="submit" class="btn btn-success" value="Buscar" style="background-color: #26a69a;" />
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
            <!--JavaScript at end of body for optimized loading-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    </body>

</html>