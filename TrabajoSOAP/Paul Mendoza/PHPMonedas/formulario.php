<?php 
require ("conversion.php");
 ?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Tipos de cambio</title>
</head>
<body>
		<h1>Conversion de Monedas (PHP)</h1>
	<form action="formulario.php" method="POST">

		<label for="tipo">Elegir Conversion</label>
		<select name="tipo" id="tipo">
			<option value="0">-Seleccionar-</option>
			<option value="1">Soles a Dolares</option>
			<option value="2">Dolares a Soles</option>
			<option value="3">Soles a Euros</option>
			<option value="4">Euros a Soles</option>
			<option value="5">Dolares a Euros</option>
			<option value="6">Euros a Dolares</option>
		</select>

		<br>
		<br>

		<label for="monto">Elegir el Monto</label>
		<input type="text" name="monto" id="monto">

		<br>
		<br>

		<input type="submit" value="Calcular">
	</form>	


</body>
</html>