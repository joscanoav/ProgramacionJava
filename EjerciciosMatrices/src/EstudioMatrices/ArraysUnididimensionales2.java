package EstudioMatrices;

import javax.swing.*;

public class ArraysUnididimensionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises = new String[4];
		
		/*
		paises[0] = "Espa�a";
		paises[1] = "Mexico";
		paises[2] = "Colombia";
		paises[3] = "Per�";
		paises[4] = "Chile";*/
		
		for(int i=0; i<4;i++) {
			paises[i]=JOptionPane.showInputDialog("Ingrese el pais" + (i+1));
		}
		
		/*String[] paises= {"Espa�a", "Peru", "Uk"};*/
		
		/*for(int i=0; i<paises.length;i++) {
			System.out.println("Pais " +  (i+1) + " " + paises[i]);
		}*/
		
		for (String elemento:paises) {
			System.out.println(" Pais " + elemento);
		}


	}

}
