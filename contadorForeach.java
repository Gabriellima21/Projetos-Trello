package contador;

public class contadorForeach {

	public static void main(String[] args) {
		int valores[] = new int [100];
		
		int soma = 0; 
		
		for (int i = 99; i>=0; i--) {
			valores[i] = soma + 1;
			soma+=1;
		}
		for (int valor : valores) {
		System.out.println(valor);
		}
	}
}
