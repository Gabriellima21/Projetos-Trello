import java.util.Scanner;
public class caloriasFrutas {

	public static void main(String[] args) { 
		
		String[] frutas = {"banana","maça", "uva","pera"};
		
		String f;
		
		System.out.println("Futas: banana, maçã, uva e pera.");
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a fruta que queira saber as calorias: ");
		
		f = input.nextLine();
		f = f.toLowerCase();
		 
		
		if (f.equals(frutas[0])) { //equals
			System.out.println("A banana possui 100 calorias");
		}
		else if (f.equals(frutas[1])) {
			System.out.println("A maçã possui 50 calorias");
		}
		else if (f.equals(frutas[2])) {
			System.out.println("A uva possui 80 calorias");
		}
	    else if (f.equals(frutas[3])) {
			System.out.println("A pera possui 75 calorias");
	}	else {
			System.out.println("Insira uma das frutas informadas.");
		}
	}

}
