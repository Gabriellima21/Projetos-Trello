import java.util.Scanner;
public class CaloriasFrutas {
	
	public static void main(String[] args) {
		//String[] frutas = {"banana", "maca", "uva", "pera"};
		
		String f;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite uma das Frutas: ");
		
		f = input.nextLine();
		f = f.toLowerCase();
		
		switch (f) { //dado a variavel f
		case "banana": System.out.println("A banana possui 100 calorias"); break; //caso o f seja banana 
		case "maçã": System.out.println("A maçã possui 50 calorias"); break;
		case "uva": System.out.println("A uva possui 80 calorias");break;
		case "pera": System.out.println("A pera possui 75 calorias");break;
		default: System.out.println("Fruta invalida, insira: banana, maçã, uva ou pera"); // caso nenhuma as condicionais a cima não sejam aceitas.
		}
	}
}
