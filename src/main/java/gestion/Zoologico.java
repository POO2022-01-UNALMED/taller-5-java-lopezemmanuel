package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
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

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	public Zoologico() {
		this("", "");
	}

	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public int cantidadTotalAnimales() {
		int suma = 0;
		
		for(int i = 0; i < this.zonas.size(); i++) {
			suma += this.zonas.get(i).cantidadAnimales();
		}
		
		return suma;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
}
