import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinariaRecursiva {
	public static void main(String[] args) {
		int [] array = {3,9,6,1,10};
		Arrays.sort(array); // ordenar array
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		
		int numero = input.nextInt();
		
		// criar obj BuscaBinariaRecursiva b = new BuscaBinariaRecursiva();
		// invocar b.teste();
		
		int resultado = buscaBinariaRecursiva (array,numero);
		if(resultado<0) {
			System.out.println("Número não encontrado no array");
		}else {
			System.out.println("O número " +numero+ " foi encontrado no array, na posição " + resultado);
		}
	}
	
	/*public int teste () {
		return 0;
	}*/
	
	public static int buscaBinariaRecursiva(int[] array, int numero){
		return buscaRecursiva(array, numero, 0, array.length-1 ); //começa em 0 e vai ate a penultima posição
	}
	// faz o papel de busca, como se fosse o um laço
	public static int buscaRecursiva(int[] array, int numero, int menor, int maior){
		int media = (menor + maior) /2;
		
		if (menor > maior) {
			return -1;
		}
		
		if (array[media] == numero) {
			return media;
		}
		
		if (array [media] < numero) {
			return buscaRecursiva (array,numero,media+1,maior);
		}
		
		else  {
			return buscaRecursiva (array,numero,menor,media-1);
		}
	}
}
