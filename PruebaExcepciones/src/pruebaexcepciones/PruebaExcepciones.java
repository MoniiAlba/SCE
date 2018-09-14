/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdist
 */
public class PruebaExcepciones {
    
    public static void calcula() throws BusinessException{
        double a, b,c;
        
        a = 1.0e50;
        b = 0.0F;
        
        c = a/b;
        
        if(Double.isInfinite(c) || Double.isNaN(c)){
            System.out.println("Resultado incorrecto ...");
            throw new BusinessException(2000);
        }else
            System.out.println("El resultado = "+c);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            calcula();
        } catch (BusinessException ex) {
            Logger.getLogger(PruebaExcepciones.class.getName()).log(Level.SEVERE, "Ocurrio un error en el calculo", ex);
        }
    }
    
}
