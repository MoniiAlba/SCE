/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstjson;

import org.json.JSONObject;

/**
 *
 * @author sdist
 */
public class TstMiClase {
    
    
    
    public static void main(String[] args) {
        MiClase miObj = new MiClase();
        
        miObj.setC1("Moni");
        miObj.setC2(2);
        System.out.println(miObj);
        
        System.out.println("-----------------------");
        JSONObject eljson = new JSONObject();
        System.out.println(eljson.toString());
        System.out.println("-----------------------");
    }
}
