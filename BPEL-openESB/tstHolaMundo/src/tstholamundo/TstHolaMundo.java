/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstholamundo;

import javax.xml.ws.Holder;

/**
 *
 * @author sdist
 */
public class TstHolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.xml.ws.Holder<java.lang.String> p = new javax.xml.ws.Holder<java.lang.String>();
        holamundoca.HolaMundoCAService1 service = new holamundoca.HolaMundoCAService1();
        holamundoca.HolaMundoWSDLPortType port = service.getCasaPort1();
        for(int i = 1; i < 100; i++){
            p.value = ""+i;
        port.holaMundoWSDLOperation(p);
        System.out.println("Resultado: " + p.value);
        }
        
    }

    private static void holaMundoWSDLOperation(javax.xml.ws.Holder<java.lang.String> part1) {
        holamundoca.HolaMundoCAService1 service = new holamundoca.HolaMundoCAService1();
        holamundoca.HolaMundoWSDLPortType port = service.getCasaPort1();
        port.holaMundoWSDLOperation(part1);
    }
    
}
