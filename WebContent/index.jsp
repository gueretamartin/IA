<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ciudades</title>
	<link href="css/bootstrap.css" rel="stylesheet">
	<style type="text/css">
	.texto{
	font-size:30px;
	}
	.cabecera{
	margin: 0 auto;
	}
	#especial em {
	font-weight: bold;
	color: red;}
	#especial2 em {
	color: red;
	font-weight: bold;}
	#especial2 strong {
	color: green;
	font-weight: bold;}
	#especial strong {
	color: green;
	font-weight: bold;}
	
	</style>
</head>

<body>
	  <% Boolean respuesta = 
  (Boolean)request.getAttribute("respuesta"); 
  String ciudado = (String)request.getAttribute("ciudado");
   String ciudadd = (String)request.getAttribute("ciudadd");%>
	<div class="container">
	<div class="row" style="padding:20px;">
	<div class="cabecera block text-center"><h1 style="color:#8dc665;">TRABAJO PRÁCTICO INTELIGENCIA ARTIFICIAL</h1>
	<img src="img/mapa.gif"  alt="Mapa de ciudades" border="0" >
	</div>
	</div>
	<div class="col-md-4 block text-center"></div>
	<div class="col-md-4 block text-center">
    <form action="Buscador" role="form" method="Post">
    <div class="form-group">
      <label for="sel1" style="font-size: 20px; color:rgb(71, 160, 189);">Seleccione Ciudad de Origen:</label>
      <select class="form-control" id="sel1" name="sel1">
        <option>Ciudad 1</option>
        <option>Ciudad 2</option>
        <option>Ciudad 3</option>
        <option>Ciudad 4</option>
        <option>Ciudad 5</option>
        <option>Ciudad 6</option>
      </select>
     </div>
      <div class="form-group">
      <label for="sel1" style="font-size: 20px; color:rgb(71, 160, 189);">Seleccione Ciudad de Destino:</label>
      <select class="form-control" id="sel2" name="sel2" >
        <option>Ciudad 1</option>
        <option>Ciudad 2</option>
        <option>Ciudad 3</option>
        <option>Ciudad 4</option>
        <option>Ciudad 5</option>
        <option>Ciudad 6</option>
      </select>
      <br>
      <button class="btn btn-success" type="submit" value="ENVIAR">Comprobar Ruta</button>
     </div>
     </form>  
     </div>
     <div class="col-md-4 block text-center"></div>
      </div>
   
	
	

</body>
</html>