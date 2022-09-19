package ordem;
import java.util.Scanner;
public class Buscar {

	public static void main(String[] args) {
		int[] array = new int [5];
		
		array [0] = 5;
		array [1] = 7;
		array [2] = 1;
		array [3] = 9;
		array [4] = 4;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe um número e veja se esta no Array: ");
		
		int n = input.nextInt();
		int achou =0;
		
			for (int j =0; j<array.length;j++) {
				if(n == array[j]) {
					System.out.println("O número " + n + " esta na posição " + j + " do array!");
					achou++;
				}
			}
			if (achou==0) {
				System.out.println("O número " + n + " não esta no array.");
			}
	  }
  }