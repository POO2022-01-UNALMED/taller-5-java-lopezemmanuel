package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}

	public Zona() {
		this("", new Zoologico(), new Animal[] {});
	}

	public Zona(String nombre, Zoologico zoo, Animal[] animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}

	/*
	 * public String getNombre() {return this.nombre;} public Zoologico getZoo()
	 * {return this.zoo;} public Animal[] getAnimales() {return this.animales;}
	 * 
	 * public void setNombre(String nombre) {this.nombre = nombre;} public void
	 * setUbicacion(Zoologico zoo) {this.ubicacion = ubicacion;} public void
	 * setZonas(Animal[] animales) {this.zonas = zonas;}
	 */
}
