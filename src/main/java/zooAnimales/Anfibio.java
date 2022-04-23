package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public Anfibio() {
		this("", 0, "", "", "", false);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio animal = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas += 1;
		return animal;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio animal = new Anfibio(nombre, edad, "selva", genero, "negro", true);
		Anfibio.salamandras += 1;
		return animal;
	}
	
	public int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
}
