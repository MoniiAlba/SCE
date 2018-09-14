package example.hello;

    import java.rmi.registry.LocateRegistry;
    import java.rmi.registry.Registry;

    public class Client {

        private Client() {}

        public static void main(String[] args) {
            long i;
			double dt = 0.0;
			double std = 0.0;
			double std2 = 0.0;
			double prom_dt = 0.0;
			double std_dt = 0.0;
			long N = 10000;
			long t0, t1;
			long lngCuantosMilisFaltan = 1000;
			
			int a = 5;
			int b = 2;
			
            String response;
			int respSuma;
            String host = (args.length < 1) ? null : args[0];
            try 
            {
                Registry registry = LocateRegistry.getRegistry(host);
                Hola stub = (Hola) registry.lookup("Hola");
				//tarda x segs en iniciar
				//Thread.currentThread().sleep(lngCuantosMilisFaltan);
                for(i=0;i<N;i++)
                {
				  //tarda x segs entre cada respuesta
				  Thread.currentThread().sleep(lngCuantosMilisFaltan);
				  t0 = System.nanoTime();
                  response = stub.sayHello();
				  respSuma = stub.suma(a,b);
				  t1 = System.nanoTime();
				  b = respSuma;
				  dt = (double) (t1-t0);
				  std += dt;
				  std2 += dt*dt; 
                  //if(i%100==0)System.out.println(i+1 + " response: " + response);
				  System.out.println(i+1 + " response: " + response);
				  System.out.println("Suma de " + a + " y " + b + ": " + respSuma +".");
                }
				prom_dt = std/N;
				std_dt = Math.sqrt((std2 - N * prom_dt * prom_dt)/(N-1));
				
				prom_dt *= 1e-9;
				std_dt *= 1e-9;
				System.out.println("================================");
				System.out.println("Para "+ N + " solicitudes de servicio");
				System.out.println("Promedio de tiempo de ciclo: "+prom_dt+" segs");
				System.out.println("Desv std tiempo de ciclo: "+std_dt+" segs");
				System.out.println("================================");
            } 
            catch (Exception e) 
            {
                System.err.println("Client exception: " + e.toString());
                e.printStackTrace();
            }
        }
    }

