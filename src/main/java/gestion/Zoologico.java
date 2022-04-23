package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Zona[] getZonas() {
		return zonas;
	}

	public void setZonas(Zona[] zonas) {
		this.zonas = zonas;
	}

	public Zoologico() {
		this("", "", new Zona[] {});
	}

	public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
}
