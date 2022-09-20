import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ordem {

	public static void main(String[] args) {
		List <Integer> sequencia = new ArrayList<>();
		
		Scanner input = new Scanner (System.in);
		
		for(int i=0; i<5;i++) {
			System.out.println("Informe um número: ");
			 sequencia.add(input.nextInt());
	    }
		System.out.println(sequencia);
    }
}


/*sequencia.add(4);
sequencia.add(9);
sequencia.add(1);
sequencia.add(1);
sequencia.add(8);

System.out.println(sequencia);*/

/*Scanner input = new Scanner (System.in);

for(int i=0; i<=5;i++) {
	System.out.println("Informe um número: ");
	int n = input.nextInt();
	sequencia.add(i) += n;
}*/