package scanner;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		int n1, n2; //crio as variaveis
		
		Scanner input = new Scanner(System.in); //crio o objeto (new) scanner input interação com o usuário.
		
		System.out.println("Digite o priemeiro número: ");
		n1 = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		
		if (n1> n2) {
			System.out.println("O número "+n1 +"é maior que o número "+ n2);
		}
		else if (n1 == n2) {
			System.out.println("Os números são iguais");
		}
		else {
			System.out.println("O número "+ n2 +"é maior que o número "+n1);
		}
	}

}
