package ejemploInterfacesVeterinaria;

import java.time.LocalDate;

class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, String raza, int edad, LocalDate fechaNacimiento) {
        super(nombre, "Perro", edad, fechaNacimiento);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void mostrarInformacionEspecifica() {
        System.out.println("Raza: " + raza);
        mostrarVacunasAntiparasitarias();
    }

    public void mostrarVacunasAntiparasitarias() {
        for (Vacuna vacuna : this.getVacunas()) {
            if (vacuna.getContraindicaciones().contains("Parásitos")) {
                System.out.println(" - " + vacuna.getNombre());
            }
        }
    }
}
