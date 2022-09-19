import java.util.Scanner;
public class CaloriasFrutas {

	public static void main(String[] args) {
		String[] frutas = {"banana", "maçã", "uva", "pera"};
				
				String p;
				
				Scanner input = new Scanner (System.in);
				
				System.out.println("Informe uma fruta: ");
				
				String f = input.nextLine();
				f = f.toLowerCase();
				
				
			p =(f.equals(frutas[0])) ? "A banana possui 100 calorias" : (f.equals(frutas[1])) ? "A maçã possui 50 calorias" :
			(f.equals(frutas[2])) ? "A uva possui 80 calorias" : (f.equals(frutas[3])) ? "A pera possui 75 calorias" : "Insira uma das frutas informadas.";
			
			System.out.println(p);
					
			}
	}
