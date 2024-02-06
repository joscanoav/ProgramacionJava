package EstudioMatrices;

public class ArraysUnidimensionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] matriz_aletorios = new int [150];
		for (int i=0; i<matriz_aletorios.length;i++) {
			matriz_aletorios[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for (int numeros : matriz_aletorios) {
			System.out.print(numeros + " ");
		}
	
	}
}
