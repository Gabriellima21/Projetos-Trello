
public class NumeroImpar {

	public static void main(String[] args) {
		int[] impar = new int [100];
		
		int soma = 0;
		
		for (int i =0; i<100; i++) {
			impar[i] = soma + 1;
			soma+=1;
		}
		for (int impares : impar) {
			if (impares % 2 !=0) {
		
			System.out.println(impares);
		}
		}
	}
}
