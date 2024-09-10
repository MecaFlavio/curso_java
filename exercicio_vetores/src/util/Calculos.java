package util;

import entities.Pessoas;

public class Calculos {
	
	private Pessoas [] vectDados;

	public Calculos(Pessoas[] vectDados) {
		this.vectDados = vectDados;
	}
	
	public double minAltura() {
		
		double min = vectDados[0].getAltura();
		for(int i = 0; i < vectDados.length; i++) {
			if(vectDados[i].getAltura() < min) {
				min = vectDados[i].getAltura();
			}
		}
		return min;
	}
	
	public double maxAltura() {
		double max = vectDados[0].getAltura();
		for(int i = 0; i < vectDados.length; i++) {
			if(vectDados[i].getAltura() > max) {
				max = vectDados[i].getAltura();
			}
		}
		return max;	
	}
	
	public double mediaMulher() {
		
		int cont = 0;
		double soma = 0;
		double media = 0;
		for(int i = 0; i < vectDados.length; i++) {
			if(vectDados[i].getGenero() == 'f') {
				cont++; 
				soma += vectDados[i].getAltura(); 
			}
		}
		media = soma / cont;
		return media;
	}
	
	public int numHomens() {
		
		int cont = 0;
		for(int i = 0; i < vectDados.length; i++) {
			if(vectDados[i].getGenero() == 'm') {
				cont++;  
			}
		}
		return cont;
	}
	
	
	
}
