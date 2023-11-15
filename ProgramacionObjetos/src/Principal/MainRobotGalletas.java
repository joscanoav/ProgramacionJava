package Principal;
import Objetos.RobotGalletas;
public class MainRobotGalletas {

	public static void main(String[] args) {
		
		RobotGalletas galletas = new RobotGalletas(50,2.5);
		
		galletas.incrementarGalletasCrudas(30);
		galletas.hornearGalletas(20);
		galletas.envasarGalletas(15);
		galletas.venderGalletas(10);
		
		galletas.mostrarEstado();
		
	}

}
