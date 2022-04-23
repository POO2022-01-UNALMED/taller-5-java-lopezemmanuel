package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static int cantidadMamiferos = 0;
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public static int getCantidadMamiferos() {
		return cantidadMamiferos;
	}

	public static void setCantidadMamiferos(int cantidadMamiferos) {
		Mamifero.cantidadMamiferos = cantidadMamiferos;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public static int getCaballos() {
		return caballos;
	}

	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}

	public static int getLeones() {
		return leones;
	}

	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Mamifero() {
		this("", 0, "", "", false, 0);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.cantidadMamiferos += 1;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero animal = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.listado.add(animal);
		Mamifero.caballos += 1;
		return animal;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero animal = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.listado.add(animal);
		Mamifero.leones += 1;
		return animal;
	}
	
	public int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
}
