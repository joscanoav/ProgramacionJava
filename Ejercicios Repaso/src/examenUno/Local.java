package examenUno;
import java.util.ArrayList;

class Local {
private int aforoMaximo;
private ArrayList<Integer> listaIDs;

public Local(int aforoMaximo) {
    this.aforoMaximo = aforoMaximo;
    this.listaIDs = new ArrayList<>();
}

public boolean entrar(int id) {
    if (listaIDs.size() < aforoMaximo && !listaIDs.contains(id)) {
        listaIDs.add(id);
        System.out.println("Persona con ID " + id + " ha entrado.");
        return true;
    } else {
        System.out.println("El aforo está completo o la persona ya está dentro.");
        return false;
    }
}

public void salir(int id) {
    if (listaIDs.contains(id)) {
        listaIDs.remove(Integer.valueOf(id));
        System.out.println("Persona con ID " + id + " ha salido.");
    } else {
        System.out.println("La persona con ID " + id + " no estaba dentro del local.");
    }
}

public void mostrarAforo() {
    System.out.println("Aforo actual: " + listaIDs.size() + "/" + aforoMaximo);
    System.out.println("Lista de IDs: " + listaIDs);
}
}