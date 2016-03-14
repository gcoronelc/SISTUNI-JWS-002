package pe.egcc.service;

import java.util.List;
import pe.egcc.demows.ws.Libro;
import pe.egcc.demows.ws.LibrosWS;
import pe.egcc.demows.ws.LibrosWSService;

/**
 *
 * @author GustavoCoronel
 */
public class LibroService {

    public List<Libro> traerLibros(){
        // Inicializando la fabrica de proxies 
        LibrosWSService factory = new LibrosWSService(); 
        // Obtener un proxy 
        LibrosWS librosWS = factory.getLibrosWSPort(); 
        // Ejecutar el método remoto 
        List<Libro> lista = librosWS.traerLibros();
        return lista;
    }
    
    public int sumar(int n1, int n2){
        // Inicializando la fabrica de proxies 
        LibrosWSService factory = new LibrosWSService(); 
        // Obtener un proxy 
        LibrosWS librosWS = factory.getLibrosWSPort(); 
        // Operar
        int suma = librosWS.sumar(n1, n2);
        return suma;
    }
    
}
