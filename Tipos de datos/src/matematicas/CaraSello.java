package matematicas;

import java.util.Random;

public class CaraSello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				Random randGem = new Random();
				int resultado = randGem.nextInt(2);
				System.out.println("Se lanza la moneda ....");
				if (resultado == 0){
					System.out.println("Cara");
				}else {
					System.out.println("Sello");
				}
				
			}

	}

