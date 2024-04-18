package ejemploInterfacesVeterinaria;

import java.time.LocalDate;
import java.util.List;

public interface Vacuna {
	String getNombre();
	LocalDate getFechaAplicacion();
	LocalDate getFechaProximaDosis();
	String getFabricante();
	int getNumeroDosis();
	List<String> getContraindicaciones();
	boolean isRefuerzo();
}


