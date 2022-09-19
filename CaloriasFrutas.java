import java.util.HashMap;
import java.util.Scanner;
public class CaloriasFrutas {

	public static void main(String[] args) {
		
	HashMap <String,String> frutas = new HashMap <String,String>(); //valor e chave
	
	//inserir elementos .put
		frutas.put("banana","A banana possui 100 calorias");
		frutas.put("maçã","A maçã possui 50 calorias");
		frutas.put("uva","A uva possui 80 calorias");
		frutas.put("pera","A pera possui 75 calorias");
		frutas.put( "erro","Insira uma das frutas informadas.");
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite a fruta que queira saber as calorias: \n Banana \n Maçã \n Uva \n Pera");
	
	String opcao = input.next();
	opcao = opcao.toLowerCase();
	
	System.out.println(frutas.getOrDefault(opcao,"Insira uma das frutas informadas."));
	
	
	
	 }

}
