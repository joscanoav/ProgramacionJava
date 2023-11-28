package examenUno;

public class MainLocal {

	public static void main(String[] args) {
        Local miLocal = new Local(5);

        miLocal.entrar(1);
        miLocal.entrar(2);
        miLocal.entrar(3);
        miLocal.mostrarAforo();

        miLocal.salir(2);
        miLocal.mostrarAforo();

        miLocal.entrar(4);
        miLocal.mostrarAforo();

        miLocal.entrar(5);
        miLocal.mostrarAforo();

        miLocal.entrar(1);  // Intentar ingresar una persona con el mismo ID
        miLocal.mostrarAforo();
    }
}