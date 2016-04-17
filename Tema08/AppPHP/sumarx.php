<?php
// Variables
$hayResultado = FALSE;
$num1 = 0;
$num2 = 0;
$suma = 0;
// Proceso
if (isset($_POST["num1"])) {
  echo("<hr/>");
  // Obtener los datos
  $num1 = $_POST["num1"];
  $num2 = $_POST["num2"];
   echo("A");
  // Acceso al WS
  // url del servicio 
  $servicio = "http://localhost:8080/WSMate/MateService?wsdl"; 
  //parametros de la llamada 
  $parametros = array(); 
  $parametros["arg0"] = $num1; 
  $parametros["arg1"] = $num2; 
   echo("B");
  // Creando el servicio 
  $soapClient = new SoapClient($servicio, $parametros); 
  echo("C");
  // llamado al método sumar 
  $result = $soapClient->sumar($parametros); 
  echo("D");
  // Mostrando el resultado 
  echo "Tipo: " . getType($result) . "<br/>"; 
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
    <form method="post" action="sumarx.php">
      <p>Número 1: <input type="text" name="num1"/></p>
      <p>Número 2: <input type="text" name="num2"/></p>
      <p><input type="submit" value="Procesar" /></p>
    </form>
    
    <?php if( $hayResultado ){ ?>
    <h1>RESULTADO</h1>
    <p>Suma: <?php echo $suma; ?></p>
    <?php } ?>
  </body>
</html>
