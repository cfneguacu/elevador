package elevador;

import java.util.Scanner;

public class Elevador {
	
	public static void main(String[] args) {
		
		int numPessoas =  0;
		System.out.println("O elevador tem capacidade maxima para 14 pessoas");
		Entra(numPessoas);
		
	}
	
	public static void Entra(int numPessoas) {
		
		Scanner entrada = new Scanner(System.in);
		int temp = numPessoas;
		int capElevador = 14;
		System.out.print("Entre no Elevador --> ");
		numPessoas =  entrada.nextInt()+temp ;
		
		if(numPessoas<capElevador){
			
				System.out.println("Entrou "+numPessoas+" no elevador, falta "+(capElevador-numPessoas)+" para capacidade maxima");
				Entra(numPessoas);	
				
		}else if(numPessoas==capElevador){
			
				System.out.println("Entrou "+numPessoas+" no elevador,  o elevador ja atingiu sua capacidade maxima");
		
		}else {
			
				System.out.println("a quantidade de pessoas é maior que a capacidade");
			
		}
		
				
	}
	
	
	
		
	
}


