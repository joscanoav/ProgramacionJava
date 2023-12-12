package ModeloC;

import java.util.Scanner;

public class ModeloCTelefono {

	public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String telefono1;
        String telefono2;

        System.out.println("Ingrese numero el primer telefono en el siguiente formato: +34 xxx-xx-xx-xx");
        telefono1 = teclado.nextLine();
		if ( telefono1 == "") {
			System.out.println("Error : Numero vacio");
		} while (telefono1 == "");
		
        System.out.println("Ingrese numero el primer telefono en el siguiente formato: +34 xxx-xx-xx-xx ");
        telefono2 = teclado.nextLine();
		if ( telefono2 == "") {
			System.out.println("Error : Numero vacio");
		} while (telefono1 == "");
        	
		if (telefono1.compareTo(telefono2)== 0) {		
		System.out.println("Los telefonos son iguales");
        }else {
        	System.out.println("Telefonos diferentes");
        }
        
	}

}
