/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepciones;

/**
 *
 * @author sdist
 */
public class BusinessException extends Exception{
    
    long Num_Codigo = 0;
    
    BusinessException(long unNum_Codigo){
        this.Num_Codigo = unNum_Codigo;
    }
    
    public String toString(){
        return new String(new StringBuffer("Excepcion de negocio: ").append(this.Num_Codigo));
    }
}
