public class GenDeltaT{
	public static void main(String[] args) {
            double Lambda = 5.0;
	    System.out.println("HOLA :D");
	    double dt = 0.0;
	    double std = 0.0;
	    long N = 10000;
		double prom_dt = 0.0;
		
	    for(long k = 0; k < N; k++){
		dt = -1.0/Lambda*(Math.log(Math.random()));
		std += dt;
	
	    	System.out.println(k + " deltaT: " + dt);
	    }
		prom_dt = std/N;
	    System.out.println("Promedio de deltaT: " + prom_dt); 	
	}
}