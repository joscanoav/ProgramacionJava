package matematicas;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		System.out.println("Lanzando el dado...");
		int resultado = random.nextInt(1,7);
		System.out.println("El resultado del lanzamiento del dado es: " + resultado);
	}

}
