package zooAnimales;

public class Pez extends Animal {
	private static Pez[] listado;
	private static int salmones;
	private static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public static Pez[] getListado() {
		return listado;
	}

	public static void setListado(Pez[] listado) {
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
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
}
