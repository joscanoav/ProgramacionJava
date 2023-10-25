package matematicas;

import java.util.Random;
import java.util.Scanner;

public class JuegoCanicas2Vers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int canicasUsuario = 10;
		int canicasMaquina =10;
	
	while (canicasUsuario > 0 && canicasMaquina >0) {
		System.out.println("Tienes" +canicasUsuario + " canicas" );
		System.out.println("La maquina Tiene" +canicasMaquina + " canicas" );
	
		System.out.println("Elige PAR (P) o IMPAR (I): ");
		String eleccionUsuario = entrada.next();
		String eleccionMaquina = random.nextBoolean()? "P" : "I";
		
		System.out.println("Tu eleccion: " +(eleccionUsuario.equals("P")? "PAR":"IMPAR"));
		System.out.println("Eleccion de la maquina: "+ (eleccionMaquina.equals("P")? "PAR":"IMPAR"));
		
		int sumaTotal = canicasUsuario + canicasMaquina;
		boolean esPAR = sumaTotal % 2 == 0;
		
		if	((eleccionUsuario.equals("P") && esPAR) || (eleccionUsuario.equals("I") && !esPAR)){
			System.out.println("¡Ganaste! Robas " + canicasMaquina + " canicas de la Maquina.");
			canicasUsuario += canicasMaquina;
			canicasMaquina  = 0;
		} else {
			System.out.println("La maquina gana y roba " + canicasUsuario + " canicas de ti");
			canicasMaquina += canicasUsuario;
			canicasUsuario = 0;
		}
		
	}
	
	if (canicasUsuario ==0) {
		System.out.println("La maquina gano. Te quedaste sin canicas.");
	}else {
		System.out.println("¡Ganaste! La maquina se quedo sin canicas.");
	}
		
		
	}

}
