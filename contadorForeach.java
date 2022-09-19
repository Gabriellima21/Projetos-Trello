
public class contadorForeach {

	public static void main(String[] args) {
	
		int valores[] = new int[100];
		
		for (int i =0; i<valores.length; i++) {
		
			valores[i] = i + 1; //numeros na posição i recebe +1
		}
		
		for (int valor : valores) { //valor esta recebendo as 100 posições do array valores.
			
			System.out.println(valor);

		}
		
	} 

} 
