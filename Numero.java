import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		int nMaximo = input.nextInt();
		
		for (int j=1;j<=nMaximo;j++) { 
			for (int k=1;k<=nMaximo;k++) {
				for(int a=1;a<=nMaximo;a++) {
					//1+1+1+nmax, 1+1+2+nmaximo
					if(j+k+a+nMaximo==21){
						System.out.println("Sequencia:" + j+k+a+nMaximo);
					}
				}
			}
		}
							
	}
}

		

/*for () {

}


int soma =0;
for(int i=0; i<4;i++) {
	for(int j=0; j<=nMaximo;j++) { 
			if(j<=nMaximo) {
				j +=1;
				j nMaximo
			}
		}
	}*/

//String numero = Integer.toString(nMaximo); //passo um int para uma variavel string 

//char[] charArray = numero.toCharArray(); //um array char, em cada posição um digito do numero informado

//for (int i=0; i<charArray.length;i++) {
	//if(){
		
	//}	