/* Los animales tienen un nombre de especie, un clima, un hábitat y un tipo de alimentación (hervívoro, carnívoro u omnívoro).

Hay animales invertebrados y vertebrados.

Los invertebrados pueden ser insectos (que tienen un número de alas, antenas y patas) y moluscos (puede tener o no caparazón).

Los vertebrados pueden ser mamíferos o aves. Los mamíferos tienen un número de extremidades y si son vivíparos/ovíparos. Las aves pueden volar o no.

--------
Animal:
- especie
- clima
- hábitat
- alimentación

---------

Invertebrado (Animal):

---------

Vertebrado (Animal):

---------

Insectos (Invertebrado):
- alas
- antenas
- patas

---------

Moluscos (Invertebrado):
- caparazon

---------

Mamíferos (Vertebrado):
- extremidades
- viviparo

---------

Aves (Vertebrado):
- voladora*/

package Animales;
public class Animal {
	private String especie;
	private String clima;
	private String habitat;
	private String alimentacion;
	
	
	public Animal(String especie, String clima, String habitat, String alimentacion) {
		this.especie = especie;
		this.clima = clima;
		this.habitat = habitat;
		this.alimentacion = alimentacion;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getClima() {
		return clima;
	}


	public void setClima(String clima) {
		this.clima = clima;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getAlimentacion() {
		return alimentacion;
	}


	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
}
