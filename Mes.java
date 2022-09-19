package investido;

public class Mes {

	public static void main(String[] args) {
		
		float valorMes = 18;
		int totalAno = 12;
		int valorAno = (int) valorMes / totalAno;
		float restoMes = (valorMes/totalAno) - valorAno;
		int totalMes = (int) (restoMes * totalAno);
		
		System.out.println(totalMes);
		
		valorMes = restoMes;
		
		valorMes = 10.5f;
		System.out.println(restoMes);
		
		int[] a1 = {1,2,3};
		int[] a2 = a1;
		a2[1] = 20;
		System.out.println(a1[1]); 
		
		String s1 = "1";
		String s2 = s1;
		s2 = "2";
		System.out.println(s1);
		
		
		}

}
//cast = transformar de um tipo para o outro;