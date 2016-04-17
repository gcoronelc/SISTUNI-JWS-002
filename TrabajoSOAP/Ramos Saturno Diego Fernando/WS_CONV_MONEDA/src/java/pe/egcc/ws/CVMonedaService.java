/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Diego
 */
@WebService(serviceName = "WSCVMONEDA")
public class CVMonedaService {
    private double d2s = 3.36325;  // 1 dolar en soles
    private double s2d = 0.297331; // 1 sol en dolares
    private double e2s = 3.81192;  // 1 euro en soles
    private double s2e = 0.262335; // 1 sol en euros
    private double e2d = 1.13352;  // 1 euro en dolares
    private double d2e = 0.882205; // 1 dolar en euros
    
    @WebMethod
    public double dollarToSol(double dollar) {
        return (dollar*d2s);
    }
    @WebMethod
    public double solToDollar(double sol) {
        return (sol*s2d);
    }
    
    @WebMethod
    public double euroToSol(double euro) {
        return (euro*e2s);
    }
    
    @WebMethod
    public double solToEuro(double sol) {
        return (sol*s2e);
    }
    
    @WebMethod
    public double euroToDollar(double euro) {
        return (euro*e2d);
    }
    
    @WebMethod
    public double dollarToEuro(double dollar) {
        return (dollar*d2e);
    }
}
