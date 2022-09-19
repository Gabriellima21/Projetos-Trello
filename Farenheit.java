package graus;

import java.util.Scanner; 

public class Farenheit {

	public static void main(String[] args) {
		
		int celsius;
		
		float fahrenheit;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe os graus em celsius : ");
		
		celsius = input.nextInt();

		fahrenheit = (float) ((celsius * 1.8) + 32);
		
		System.out.println("Em Fahrenheit é: " + fahrenheit);

	}

}
