/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.services;

/**
 *
 * @author Diego
 */
public class ConvertidorMoneda {

    public double dollarToEuro(double dollar) {
        pe.egcc.wsclient.WSCVMONEDA service = new pe.egcc.wsclient.WSCVMONEDA();
        pe.egcc.wsclient.CVMonedaService port = service.getCVMonedaServicePort();
        return port.dollarToEuro(dollar);
    }

    public double dollarToSol(double dollar) {
        pe.egcc.wsclient.WSCVMONEDA service = new pe.egcc.wsclient.WSCVMONEDA();
        pe.egcc.wsclient.CVMonedaService port = service.getCVMonedaServicePort();
        return port.dollarToSol(dollar);
    }

    public double euroToDollar(double euro) {
        pe.egcc.wsclient.WSCVMONEDA service = new pe.egcc.wsclient.WSCVMONEDA();
        pe.egcc.wsclient.CVMonedaService port = service.getCVMonedaServicePort();
        return port.euroToDollar(euro);
    }

    public double euroToSol(double euro) {
        pe.egcc.wsclient.WSCVMONEDA service = new pe.egcc.wsclient.WSCVMONEDA();
        pe.egcc.wsclient.CVMonedaService port = service.getCVMonedaServicePort();
        return port.euroToSol(euro);
    }

    public double solToDollar(double sol) {
        pe.egcc.wsclient.WSCVMONEDA service = new pe.egcc.wsclient.WSCVMONEDA();
        pe.egcc.wsclient.CVMonedaService port = service.getCVMonedaServicePort();
        return port.solToDollar(sol);
    }

    public double solToEuro(double sol) {
        pe.egcc.wsclient.WSCVMONEDA service = new pe.egcc.wsclient.WSCVMONEDA();
        pe.egcc.wsclient.CVMonedaService port = service.getCVMonedaServicePort();
        return port.solToEuro(sol);
    }
    
}
