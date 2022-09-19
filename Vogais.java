package stringArray;

import java.util.Scanner;

public class Vogais {

	public static void main(String[] args) {
		
		 String p;
		 
		int contadorVogal = 0;
		
		String [] javaCharArray = {"a","e","i","o","u"};
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe uma palavra: ");
		
		p = input.nextLine();
						
		for (int i=0; i < p.length(); i++) {
			
			String charToString = String.valueOf(p.charAt(i));
			
				for(int j =0; j < javaCharArray.length; j++) {
				
				if (javaCharArray[j].equalsIgnoreCase(charToString)) {
	
					contadorVogal++;
					
					break;
				}
			}
			
        }
			
		System.out.println("Na palavra "+ p +" temos: "+ contadorVogal + " vogais"); 
		}
}