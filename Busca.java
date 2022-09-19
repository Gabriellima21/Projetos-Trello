package busca;
import java .util.Scanner;
public class Busca {

	public static void main(String[] args) {
		int[] array = new int [5];
		
		array [0] = 1;
		array [1] = 4;
		array [2] = 5;
		array [3] = 7;
		array [4] = 9;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe um número e veja se esta no Array: ");
		
		int n = input.nextInt();
		
		int achou = 0;
		int inicio =0;
		int fim = array.length - 1;
		int meio;
		int posicao = 0;
		
		while (inicio <= fim) {
			meio = (int) (inicio + fim) /2; //achar a posição do meio do array 
			if (array[meio] == n) {        // posição do meio do array é igual a n ? 
				achou++;
			    posicao = meio;
				break;
			}else if (array[meio] < n) { 
				inicio = meio +1;        //se o numero que esta na posição [meio] for menor, o número inserido só pode estar dps dele, inicio começa uma posição dps do meio anterior
			}else {
				fim = meio - 1;
			}
		}
		
		if (achou !=0) {
			System.out.println("O número " + n + " esta no array");
		}else {
			System.out.println("O número " + n + " não esta no array");
		}
		
		}

	}

  
 