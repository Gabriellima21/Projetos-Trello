package numeracao;

import java.util.Scanner;

public class Distincao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int n = 0;
		
		System.out.println("Informe um número: ");
		
		n = input.nextInt();
		
		if (n % 2 == 0) {
			
			System.out.println("O número " + n + "é par.");
		}
		else {
			System.out.println("O número " + n + "é impar.");
		}
		
		
		
		
	}

}
