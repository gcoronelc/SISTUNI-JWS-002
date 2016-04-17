<?php
    
    $tipo=0;
    $monto=0;
    $resultado=0;

    if (isset($_POST["tipo"]) && isset($_POST["monto"])){

            $tipo= $_POST["tipo"];
            $monto= $_POST["monto"];
                        
            $servicio = "http://localhost:8080/WSMonedas/ConvertirWS?WSDL"; 
            $parametros = array(); 
            $parametros["monto"] = $monto; 
           
            $soapClient = new SoapClient($servicio, $parametros); 

        switch ($tipo) {
            case '0':
                echo "Necesita escoger un tipo de conversion.";
                break;

            case '1':
                //echo 'escogiste soles a dolares '.$tipo;
                $resultado = $soapClient->sol_dolar($parametros); 
                echo "El equivalente es " . round($resultado->return,2)  . " Dolares";
                break;
            
            case '2':
                //echo 'escogiste dolares a soles '.$tipo;
                $resultado = $soapClient->dolar_sol($parametros); 
                echo "El equivalente es " . round($resultado->return,2)  . " Soles";
                break;

            case '3':
                //echo 'escogiste soles a euros '.$tipo;
                $resultado = $soapClient->sol_euro($parametros); 
                echo "El equivalente es " . round($resultado->return,2)  . " Euros";
                break;

            case '4':
                //echo 'escogiste euros a soles '.$tipo;
                $resultado = $soapClient->euro_sol($parametros); 
                echo "El equivalente es " . round($resultado->return,2)  . " Soles";
                break;

            case '5':
                //echo 'escogiste dolares a euros '.$tipo;
                $resultado = $soapClient->dolar_euro($parametros); 
                echo "El equivalente es " . round($resultado->return,2)  . " Euros";
                break;

            case '6':
                //echo 'escogiste euros a dolares '.$tipo;
                $resultado = $soapClient->euro_dolar($parametros); 
                echo "El equivalente es " . round($resultado->return,2)  . " Dolares";
                break;

            }



       }


 ?>