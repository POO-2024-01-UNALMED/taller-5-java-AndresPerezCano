package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = new ArrayList<Zona>();
				
	}
	
	public Zoologico() {
		this.zonas = new ArrayList<Zona>(); 	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		
	}
    
	public int cantidadTotalAnimales() {
		int cantidadTotal = 0;
		for(Zona zona : zonas) {
			cantidadTotal += zona.cantidadAnimales();
		}
		return cantidadTotal;	
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setZona(ArrayList<Zona>zonas) {
		this.zonas = zonas;
	}
	public ArrayList<Zona> getZona(){
		return this.zonas;
	}
	
}
