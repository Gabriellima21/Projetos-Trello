import java.util.Scanner;
import java.util.Arrays;

public class OrdemArray {

	public static void main(String[] args) {
		
		int n[] = {2,4,9,1,12}; 
		
		Arrays.sort(n);
		
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		
	} // ordenar array sem classe java

}

/*Scanner input = new Scanner (System.in);

System.out.println("Quantos numeros deseja inserir? ");

int a = input.nextInt();

for (int i=0;i<a;i++) { 	// para se ter inserir a quantidade de números informada
	
System.out.println("Informe os numeros: ");

int b = input.nextInt(); //armazena tds inseridas durante o loop.
n+=b;
}

/*for (int i =0; i<n.length;i++) {
	
	n = b; */