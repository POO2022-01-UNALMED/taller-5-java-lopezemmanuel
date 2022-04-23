package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public static int getSalmones() {
		return salmones;
	}

	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}

	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public Pez() {
		this("", 0, "", "", "", 0);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez animal = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.salmones += 1;
		return animal;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez animal = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.bacalaos += 1;
		return animal;
	}
	
	public int cantidadPeces() {
		return Pez.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
}
