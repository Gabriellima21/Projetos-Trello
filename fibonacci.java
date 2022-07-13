package sequencia;

import java.util.Scanner;


public class fibonacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int soma;
		int valorFinal;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		
		valorFinal = input.nextInt();
	
		
		for (int i=0; i<=valorFinal; i++) {
			System.out.println(n1);
			soma = n1;
			n1 = n1 + n2;
			n2 = soma;
		
		}
	
		input.close();
	
	
	
	}

}
