public class Teste{
	
	public static void main(String[] args){
		int[] v1;
		int[] v2;

		int n = 4;

		v1 = new int[n];

		// Coloca valores em v1
		for(int i = 0; i < n; i++){
			v1[i] = i;
		}

		// Printa os valores de v1
		for(int i = 0; i < n; i++){
			System.out.println(v1[i]);
		}
	}
}