	<?php
	//variable
	$hayResultado = FALSE;
	$num1 = 0;
	$num2 = 0;
	$suma = 0;
	//proceso
	if(isset($_POST["num1"])){
		//obtener los datos
		$num1 = $_POST["num1"];
		$num2 = $_POST["num2"];
		//acceso al WS
		//url del servicio
		$servicio = "http://localhost:8080/WSMate/MateService?WSDL";
		//parametros de la llamada
		$parametros = array();
		$parametros["arg0"] = $num1;
		$parametros["arg1"] = $num2;
		//creando el servicio
		$soapClient = new SoapClient($servicio, $parametros);
		//llamado al metodo sumar
		$result = $soapClient->sumar($parametros);
		//mostrando el resultado
		echo "Tipo: ". gettype($result) . "<br/>";
		print_r($result);
		echo "<br/>Suma: " . $result->return;
		echo "<hr/>";
	}
?>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<h1>SUMAR</h1>
	<form method="post" action="Sumar.php">
		<p>Número 1: <input type="text" name="num1"></input></p>
		<p>Número 2: <input type="text" name="num2"></input></p>
		<p><input type="submit" value="Procesar"></input></p>
	</form>

</body>
</html>