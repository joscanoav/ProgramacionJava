import java.util.Scanner;

public class Ej1_ComprovadorCodigos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        System.out.println("Por fabor, ingrese su codigo: ");
	
	int barra = 0;
    int gion = 0;
    int longitud = 0;

    String codigo = teclado.next();
                System.out.println("La cantidad de caracteres que tiene su codigo es: "+ codigo.length());
        
    for (int i=0; i < codigo.length(); i++){
        

        if(codigo.charAt(i) == '/'){
            barra ++;
        }

        if(codigo.charAt(i) == '-'){
            gion ++;
        }

    }

    if(barra == 1 && gion == 1 && codigo.length() == 9){
        System.out.println("Su codigo es correcto");
    }else{
        System.out.println("Su codigo esta mal");
    }
		
	teclado.close();
	} 
}
