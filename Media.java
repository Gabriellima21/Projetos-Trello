package calcularMedia;

public class Media {

	public static void main(String[] args) {
		
		float notas[] = {8,9};
		
		float soma = 0;
		for (int i = 0; i<notas.length; i++) {
			soma = soma + notas [i];
		}
		float mediaFinal = soma / notas.length;
	
		System.out.println("A média é de: "+ mediaFinal);
	}

}
