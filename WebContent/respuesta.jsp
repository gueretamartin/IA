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
      </div>
      <div class="row">
		<div class="col-md-2 block text-center"></div>
		<div class="col-md-8 block text-center"> <% if(respuesta==true){ %>
		<p id="especial" class="texto"><strong>HAY</strong> RUTA DESDE LA <em><%= ciudado.toUpperCase()%></em> A LA <em><%= ciudadd.toUpperCase()%></em></p>
			<% ;} else{ %>
			<p id="especial2" class="texto"><strong>NO HAY</strong> RUTA DESDE LA  <em><%= ciudado.toUpperCase()%></em>  A LA <em><%= ciudadd.toUpperCase()%></em> </p>
			<% ;}%>
			</div>
			<div class="col-md-2 block text-center"></div>	   
	  </div> 
	  <br>
	<p align="center"><a href="index.jsp">Volver a preguntar por una ruta</a></p>	
	

</body>
</html>