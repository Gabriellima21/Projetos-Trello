package viagem;

import java.util.Scanner;

public class Custo {

	public static void main(String[] args) {
		
		int l = 0;
		
		float g = 0;
		
		int km = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe quantos litros por quilômetros o seu carro percorre: ");
		
		l = input.nextInt();
		
		System.out.println("Informe o valor da gasolina: ");
		
		g = input.nextFloat();
		
		System.out.println("Informe quantos quilômetros terá sua viagem: ");
		
		km = input.nextInt();
		
		float gastoKm = g / l;
		
		float gastoViagem = gastoKm * km;
		
		System.out.println("A sua viagem terá um gasto de: " + gastoViagem);
		
		//formatação numero.
		
		
		
		
		
		
		
	}

}
