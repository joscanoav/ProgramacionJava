package EstudioMatrices;

public class ArrayUnidimensional1 {

	public static void main(String[] args) {
		/*
		int [] mi_matriz = new int [5];	
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;*/
		
		
		
		int [] mi_matriz= {5,38,-15,92,71,99,30,78,11,23};
		
		/* Se usa el length para conocer la ultima posicion*/
		for(int i=0; i<mi_matriz.length;i++) {
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
		}
		
	}

}
