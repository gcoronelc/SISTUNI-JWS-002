<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <?php
    
    // Recurso
    $service_url = 'http://localhost:8083/demo-rest-01/rest/wsmensaje';
    $headers = array('Accept: application/json');

    $curl = curl_init();
    echo 'EGCC 0<br/>';
    
    if( $curl === false ){
      die('error al inicializar el objeto, url incorrecta.');
    } 
    
    curl_setopt($curl, CURLOPT_URL, $service_url);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
    echo 'EGCC 1<br/>';
    // Obtener el recurso
    $curl_response = curl_exec($curl);
    if ($curl_response === false) {
      $info = curl_getinfo($curl);
      curl_close($curl);
      die('error occured during curl exec. Additioanl info: ' . var_export($info));
    }
    curl_close($curl);
    echo $curl_response . '<br/>';
    $decoded = json_decode($curl_response);
    echo 'response ok!<br/>';
    echo($decoded->texto . '<br/>');
    var_export($decoded->texto);
    ?>
  </body>
</html>
