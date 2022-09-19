package investimento;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Dinheiro {

	public static void main(String[] args) {
		
		float investidoMes;
		
		int m = 1000000;
		
		float juros;
		
		Scanner input = new Scanner (System.in);
				
		System.out.println("Informe o valor que gostaria de investir: ");
		
		investidoMes = input.nextFloat();
		
		System.out.println("Informe a quantidade de juros composto que pretende receber por mês: ");
		
		juros = input.nextFloat();
		
		float conversao = juros / 100;
		
		float rendimento = 0;
		
		float totalMes = 0;
		
		int contadorMes = 0; 
		

		
		for (int i = 0; totalMes < m; i++) {
			
			rendimento = totalMes * conversao;
			
			totalMes = totalMes + investidoMes + rendimento;
			
			contadorMes++;	
		}
		
		if (contadorMes % 12 == 0) {
			String valorFormatado = new DecimalFormat("#,##0.00").format(totalMes);

			int contadorAno = contadorMes / 12;
			
			System.out.println ("Você se tornara milionário(a) com " + valorFormatado + " em " + contadorAno + " ano" );
		}
		
		else if (contadorMes > 12) {
			String valorFormatado = new DecimalFormat("#,##0.00").format(totalMes);

			int contadorDias = contadorMes * 30;
			int contadorAno = contadorDias / 360;
			int restoAno = contadorDias % 360 ;
			int mes = restoAno / 30; 
			
			System.out.println ("Você se tornara milionário(a) com " +valorFormatado+ " em " +contadorAno+ " anos e " + mes + " meses");

		}
		
		else {
			String valorFormatado = new DecimalFormat("#,##0.00").format(totalMes);

			 System.out.println ("Você se tornara milionário(a) com " + valorFormatado + " em " + contadorMes + " meses");

		}
		
	}
}
		//DecimalFormat

		//int contadorAno = contadorMes / 12;
		//float restanteMeses = (contadorMes / 12) - contadorAno;
		//int quantidadeMeses = restanteMeses * 12;
