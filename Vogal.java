package string;

import java.util.Scanner;

public class Vogal {

	public static void main(String[] args) {
		
		 String p;
		 
		int contadorVogal = 0;
		
		int contadorA = 0;
		
		//String vogais [] = {"a","A","e","E","i","I","o","O","u","U"};
		
		//String vogais = new String(); 
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe uma palavra: ");
		
		p = input.nextLine();
		
		p = p.toLowerCase();
				
		for (int i = 0; i < p.length(); i++) {
			 
			char c = p.charAt(i); //caracteres
			
			if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {   //numeração das vogais na tabela ASCII 
				contadorVogal++;
            }
			
			
			
		}
		System.out.println("Na palavra "+ p +" temos: "+ contadorVogal + " vogais"); 
	} 

}
		
		//cast - transformar char em string java.
		//String s =Character.toString(c);