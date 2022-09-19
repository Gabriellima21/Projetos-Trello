package caloriasFrutas;
import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;

public class CaloriasFrutas {

	public static void main(String[] args) {
		
		List <String> frutas = new ArrayList <> ();
		
		frutas.add("banana");
		frutas.add("maçã");
		frutas.add("uva");
		frutas.add("pera");
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira a fruta que queira saber as calorias: ");
		
		String f = input.next();
		
		f.toLowerCase();
		
		if (f.equals(frutas.get(0))) { //equals
			System.out.println("A banana possui 100 calorias");
		}
		else if (f.equals(frutas.get(1))) {
			System.out.println("A maçã possui 50 calorias");
		}
		else if (f.equals(frutas.get(2))) {
			System.out.println("A uva possui 80 calorias");
		}
	    else if (f.equals(frutas.get(3))) {
			System.out.println("A pera possui 75 calorias");
	    } else {
			System.out.println("Insira uma das frutas informadas.");
		}
		
	} // fazer sem os if //hashmap

}
