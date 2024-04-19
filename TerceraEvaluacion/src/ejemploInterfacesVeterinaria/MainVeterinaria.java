package ejemploInterfacesVeterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainVeterinaria {

    public static void main(String[] args) {
        // Crear algunas mascotas
        Perro snoopy = new Perro("Snoopy", "Beagle", 5, LocalDate.of(2018, 10, 2));

        // Agregar algunas vacunas a cada mascota
        snoopy.agregarVacuna("Rabia", LocalDate.of(2023, 3, 15), "Biocan", 1, new ArrayList<>(), false);
        snoopy.agregarVacuna("Moquillo", LocalDate.of(2023, 3, 15), "Biocan", 1, new ArrayList<>(), false);
        snoopy.agregarVacuna("Antiparasitaria", LocalDate.of(2023, 7, 10), "Ceva", 1, List.of("Parásitos intestinales"), false);


        // Mostrar información de cada mascota
        snoopy.mostrarInformacion();
        snoopy.mostrarInformacionEspecifica();
        System.out.println();

    }
}