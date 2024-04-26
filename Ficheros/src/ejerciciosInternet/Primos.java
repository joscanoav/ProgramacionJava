package ejerciciosInternet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Primos {
	
	 public static void main(String[] args) {
		    try {
		      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

		      for (int i = 1; i < 501; i++) {
		        if (esPrimo(i)) {
		          bw.write(String.valueOf(i) + "\n");
		        }
		      }
		      bw.close();

		    } catch (IOException ioe) {
		        System.out.println("Error de escritura.");
		    }
		  }


	  /**
	   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
	   * en caso contrario.
	   * <p>
	   * Un número es primo cuando es divisible únicamente entre el mismo y entre 1.
	   *
	   * @param x número del que se quiere saber si es primo
	   * @return  verdadero si el número que se pasa como parámetro es primo y falso
	   *          en caso contrario
	   */
	  public static boolean esPrimo(int x) {
	    for (int i = 2; i < x; i++) {
	      if ((x % i) == 0) {
	        return false;
	      }
	    }
	    return true;
	  }
	}