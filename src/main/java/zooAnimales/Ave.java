package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public Ave() {
		this("", 0, "", "", "");
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public static void crearHalcon(String nombre, int edad, String genero) {
		Ave.listado.add(new Ave(nombre, edad, "montanas", genero, "cafe glorioso"));
		Ave.halcones += 1;
	}
	
	public static void crearAguila(String nombre, int edad, String genero) {
		Ave.listado.add(new Ave(nombre, edad, "montanas", genero, "blanco"));
		Ave.aguilas += 1;
	}
	
	public int cantidadAves() {
		return Ave.listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
}
