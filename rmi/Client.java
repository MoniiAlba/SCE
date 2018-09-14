/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//================================================================
// Código del Cliente:
//================================================================
package example.hello;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client 
{
    //private Client() {}
    public static void main(String[] args) 
    {
       long lngQuienSoy=1;
       long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
       long lngCuantosMilisFaltan =100;
       
       String host = (args.length < 1) ? null 
               response = stub.sayHello();
               t1 = System.currentTimeMillis();
               dt = t1 - t0;
               sumDeltaT  += dt;
               sumDeltaT2 += dt * dt;
               if( i == 0 )
               {
                   dtMin = dt;
                   dtMax = dt;
               }
               else
               {
                   if( dt < dtMin ) dtMin = dt;
                   if( dt > dtMax ) dtMax = dt;
               }
               System.out.println("Clte " + lngQuienSoy + ": " + response);
             }
             //servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
          } 
          catch (Exception e)
          {
              System.err.println("Client exception: " + e.toString());
               e.printStackTrace();
           }
    }
}
//================================================================

