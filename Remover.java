package remover;
import java.util.Set; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Remover {

	public static void main(String[] args) {

		Set<Integer> sequenciaSet = new HashSet<>();
		
		Scanner input = new Scanner (System.in);
		
		
		for (int i=0; i<5;i++) {
			System.out.println("Insira 5 números: ");
			sequenciaSet.add(input.nextInt());
		}
		List<Integer> lista = new ArrayList<>(sequenciaSet);
		
		Collections.sort(lista); 
		
		System.out.println(lista);
	}
}
	

 //adcionar direto no Hashset !!!
