import java.util.Scanner;

public class Ordem {

	public static void main(String[] args) {
		int array[] = new int [5];
		//int n = array.length;
		Scanner input = new Scanner (System.in);
		int tamanhoExibicao = array.length;
		
		for (int i =0; i<array.length;i++) {
		System.out.println("Informe um numero:");
		int numero = input.nextInt();
		array[i] = numero;
		} //1,1,2,5,6
		  //1,2,5,6
		
		for (int i =0; i <array.length;i++) { //for para percorer o array.
			for (int j= i+1; j<array.length; j++) { //percorrer uma posição a mais no array.
				if (array[i]==array[j]) { //compara e encontar elementos repetidos..
					for (int k=i; k<array.length-1;k++) { //a variavel k irá percorrer o array, caso ache o número igual, ele o armazenará
						array[k] = array [k+1]; //guarda o valor, k pega o número q esta na proxima posição se for igual e guarda nele  "Substituindo" vai armazenar o número q estiver repitido.
					}
					tamanhoExibicao --; //ir decrementando as posições caso haja números repeditos. 
				}
			}
		}
					
		for (int i=0;i<=tamanhoExibicao;i++) {
			System.out.println(array[i]);
		}
	}
}
