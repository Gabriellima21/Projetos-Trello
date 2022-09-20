import java.util.Scanner;
import java.util.Arrays;
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
		} //1,1,1,4,5    1,1,2,4,5
		  //1,1,4,5
	
		
		for (int i =0; i <tamanhoExibicao-1;i++) { //for para percorer o array.
			for (int j= i+1; j<tamanhoExibicao; j++) { //percorrer uma posição a mais no array.
				int removidos=0;
					if (array[i]==array[j]) { //compara e encontar elementos repetidos.. // else if
					for (int k=i;k<array.length-1;k++) {
						array[k] = array[k+1];
						} removidos++;
						  j --;
						} tamanhoExibicao = tamanhoExibicao - removidos;
		              //ir decrementando as posições caso haja números repeditos. 
					}
		}
				
		for (int i=0; i<tamanhoExibicao -1; i++) { //for que percorre ate a penultima posição do array
			for(int j=i +1; j<tamanhoExibicao;j++) { //for que compara a posição atual com a seguinte.
				if (array[i]>array[j]) {
					int troca = array [i]; //guardei o valor da posição a na variavel troca
					array[i] = array [j];
					array[j] = troca;
				}
			}
		}
		for (int i=0;i<tamanhoExibicao;i++) {
			System.out.println(array[i]);
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for (int i=0; i<n -1; i++) { //for que percorre ate a penultima posição do array
			for(int j=i +1; j<n;j++) { //for que compara a posição atual com a seguinte.
				int k = i + 1;
				int removidos = 0;
				if (array[i] == array[j]) {
					removidos++;
	            }else {
	            	array[k++] = array[j];
	            } n = n - removidos;
			} 
		}*/
		/*for (int i=0;i<=n;i++) {
			System.out.println(Arrays.sort[i]);*/


