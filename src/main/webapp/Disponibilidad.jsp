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
        <title>Disponibilidad</title>
</head>

<body>
    <!--Navbar-->
    <nav>
            <div class="nav-wrapper blue darken-2">
                <a href="#!" class="brand-logo right">Home Médico</a>
                <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
                <ul class="left hide-on-med-and-down">
                    <li><a href="sass.html">Historial Consultas</a></li>
                    <li><a href="historialcitasme.html">Historial Citas</a></li>
                    <li><a href="badges.html">Historial Clínico</a></li>
                    <li><a href="medico?medico=${usuario.login}">Agregar Disponibilidad</a></li>
                    <li><a href="historiaclinica.html">Historia Clínica</a></li>
    
                </ul>
            </div>
        </nav>
    
        <ul class="sidenav" id="mobile-demo">
            <li><a href="sass.html">Historial Consultas</a></li>
            <li><a href="historialcitasme.html">Historial Citas</a></li>
            <li><a href="badges.html">Historial Clínico</a></li>
            <li><a href="medico?medico=${usuario.login}">Agregar Disponibilidad</a></li>
            <li><a href="historiaclinica.html">Historia Clínica</a></li>
        </ul>
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h1 style="color: black;">
                    Disponibilidad:
                </h1>
                <div id="formUsuario">
                    
                    <h3>Agregue sus horas por franja</h3>
                    <form action="agendar" method="GET">
                        <input type="hidden" name="medico" value="${medico}"/>
                        <input type="text" class="campos" name="fecha" placeholder="DD:MM:AA" required="required"
                            maxlength="20" />
                        <br>
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