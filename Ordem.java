import java.util.Scanner;
public class Ordem {

	public static void main(String[] args) {
		int[] numeros = new int [5];
		
		Scanner input = new Scanner (System.in);
		
		for (int i=0; i<numeros.length;i++) {
			System.out.println("Informe um número: ");
			int n = input.nextInt();
			numeros[i] = n;
		}
		
		for (int i=0; i<numeros.length -1; i++) { //for que percorre ate a penultima posição do array
			for(int j=i +1; j<numeros.length;j++) { //for que compara a posição atual com a seguinte.
				if (numeros[i]>numeros[j]) {
					int troca = numeros [i]; //guardei o valor da posição a na variavel troca
					numeros[i] = numeros [j];
					numeros[j] = troca;
				}
			}//3,1,4,5,6
			 //1,3,4,5,6
		}
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}

	}

}  //algoritimo de ordenação
