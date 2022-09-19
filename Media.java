package Media1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		int n1;
		
		float n2;
				
		float soma = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja inserir: ");
		
		n1 = input.nextInt();
		
		for (int i = 0; i<n1;i++) {
			
			System.out.println("Informe suas notas: ");
			
			n2 = input.nextFloat();
		
				  soma+=n2;		
				  
				  //soma = soma + n2;
		}
		
		float totalSoma = soma;
		
		float media = totalSoma/n1;
		
		System.out.printf("A sua média é de %.2f" + media);

	}
}
		
		
