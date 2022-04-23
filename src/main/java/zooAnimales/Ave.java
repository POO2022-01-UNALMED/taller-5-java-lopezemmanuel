package zooAnimales;

public class Ave extends Animal {
	private static Ave[] listado;
	private static int halcones;
	private static int aguilas;
	private String colorPlumas;
	
	public static Ave[] getListado() {
		return listado;
	}

	public static void setListado(Ave[] listado) {
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
}