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
	   * Devuelve verdadero si el n�mero que se pasa como par�metro es primo y falso
	   * en caso contrario.
	   * <p>
	   * Un n�mero es primo cuando es divisible �nicamente entre el mismo y entre 1.
	   *
	   * @param x n�mero del que se quiere saber si es primo
	   * @return  verdadero si el n�mero que se pasa como par�metro es primo y falso
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