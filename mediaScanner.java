package media;

import java.util.Scanner;
public class mediaScanner {

	public static void main(String[] args) {
	float n1,n2,n3;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe sua primeira nota: ");
	n1 = input.nextFloat();
	
	System.out.println("Informe sua segunda nota: ");
	n2 = input.nextFloat();
	
	System.out.println("Informe sua terceira nota: ");
	n3 = input.nextFloat();
	
	float media = (n1+n2+n3)/3;
	
	System.out.println("A sua média foi de: " +media);
	}

}
