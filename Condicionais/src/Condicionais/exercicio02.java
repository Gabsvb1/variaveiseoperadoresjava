package Condicionais;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número");
		numero = leia.nextInt();
		String sinal ;
		
		if(numero < 0) {
//			System.out.println("O número é negativo ");
			sinal = "negativo!";
		} else {
//			System.out.println("o número é positivo");
			sinal = "positivo!";
		}
		 
		if(numero %2 == 0) {
			System.out.println("o número "+ numero +" é par e " + sinal );
						
		}else {
			System.out.println("o número " + numero +  " é impar e " + sinal);
		}
		
		
	
	
	}

}
