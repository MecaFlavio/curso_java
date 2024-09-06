package util;

public class Dollar {
	
	public static final double dollar = 3.10;
	
	public static double conversor (double valor) {
		double taxa, montante; 
		
		taxa = valor * 0.06;
		montante = (valor * dollar) + (taxa * dollar);
		
		return montante;
				
	}
}