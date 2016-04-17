<!DOCTYPE html>
<?php
$desde = "DOLARES";
$hacia = "SOLES";
    
if ( isset($_GET['modo']) ) {
    $modo = $_GET['modo'];
    
    switch ($modo) {
        case 1:
            $desde = "DOLARES";
            $hacia = "EUROS";
            break;
        case 2:
            $desde = "DOLARES";
            $hacia = "SOLES";
            break;
        case 3:
            $desde = "EUROS";
            $hacia = "DOLARES";
            break;
        case 4:
            $desde = "EUROS";
            $hacia = "SOLES";
            break;
        case 5:
            $desde = "SOLES";
            $hacia = "DOLARES";
            break;
        case 6:
            $desde = "SOLES";
            $hacia = "EUROS";
            break;
    }
}else{
    // Fallback behaviour goes here
}

$num1 = "";
$num2 = "";

if(isset($_REQUEST['num1'])){
  
  $num1 = $_REQUEST['num1'];
  //$num2 = $_GET["num2"];
  
  $num2 = convertirMoneda($num1, $modo);
  
}
?>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <h1>CONVERTIR MONEDA</h1>
        
        <form>
          <input type="hidden" name="modo" value="<?php echo $modo ?>">
          <?php echo $desde ?>
          <input type="text" name="num1" value="<?php echo $num1 ?>"/>
          <input type="submit" value="A" />
          <input type="text" name="num2" value="<?php echo $num2 ?>" disabled/>
          <?php echo $hacia ?>
        </form>
        
        <br/>
        <a href="convierte.php">REGRESAR</a>
        
    </body>
</html>

<?php
function convertirMoneda($num, $modo){
  $servicio = "http://localhost:8080/WS_CVMONEDA/WSCVMONEDA?wsdl";
  $parametros = array(); 
  $parametros["arg0"] = $num;
  $soapClient = new SoapClient($servicio, $parametros);
  //$objeto = 0;
  
  switch ($modo) {
    case 1:
        $objeto = $soapClient->dollarToEuro($parametros);
        break;
    case 2:
        $objeto = $soapClient->dollarToSol($parametros);
        break;
    case 3:
        $objeto = $soapClient->euroToDollar($parametros);
        break;
    case 4:
        $objeto = $soapClient->euroToSol($parametros);
        break;
    case 5:
        $objeto = $soapClient->solToDollar($parametros);
        break;
    case 6:
        $objeto = $soapClient->solToEuro($parametros);
        break;
  }
    
  //print_r($objeto);
  
  return $objeto->return;
}
?>