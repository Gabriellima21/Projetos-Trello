package menu;
import java.util.ArrayList;  
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class MenuConsole {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		List <Float> notasCadastradas = new ArrayList <>();
		
		int opcao =0;
		int quantidade =0;
		float soma =0;
		
		String menu = "1 - Cadastrar uma nota" + "\n2- Listar notas cadastradas"
				+ "\n3 - Ver a média das notas" + "\n4 - Ver a maior nota digitada" + 
				"\n5 - Ver a menor nota digitada" + "\n6 - Ver a lista de notas ordenadas" + 
				"\n7 - Sair" + "\nDigite:";
		
		while (opcao !=7) {
			System.out.println(menu);
			opcao = input.nextInt();
			if (opcao == 1) {
				System.out.println("Quantas notas deseja cadastrar ?");
				quantidade = input.nextInt();
				for (int i=0; i<quantidade;i++) {
					System.out.println("Cadastre suas notas: ");
					notasCadastradas.add(input.nextFloat());
					
			   }
		   }  else if (opcao == 2) {
			   System.out.println("Notas: "+ notasCadastradas);
			} else if (opcao == 3) {
				for (Float notas : notasCadastradas) {
					soma+=notas;
			   }
				float totalSoma = soma;
				float media = totalSoma/quantidade;
				System.out.println("A sua média é de: " +media);
			} else if (opcao == 4) {
				float maiorNumero = notasCadastradas.get(0); 
				for (int i=1; i<notasCadastradas.size();i++) {
						if(notasCadastradas.get(i) > maiorNumero) {
							 maiorNumero = notasCadastradas.get(i);
					   }
			   } System.out.println("O maior número é o: " + maiorNumero);
			} else if (opcao == 5) {
				float menorNumero = notasCadastradas.get(0);
				for (int i=1; i<notasCadastradas.size();i++) {
					if(notasCadastradas.get(i) < menorNumero) {
						 menorNumero = notasCadastradas.get(i);
					}
		    } System.out.println("O menor número é o: " + menorNumero);
	      } else if (opcao == 6) {
	    	  Collections.sort(notasCadastradas);
	    	  System.out.println(notasCadastradas);
	      }else {
	    	  System.out.println("Opção inválida, favor digitar uma opção válida" );
	      }
       }
	}
}