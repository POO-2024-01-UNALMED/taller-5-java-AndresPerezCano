package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public Anfibio() {}
	
	public int cantidadAnfibios() {
		int cantidadAn = 0;
		for (int i = 0 ; i < listado.size(); i++) {
			cantidadAn++;
		}
		return cantidadAn;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
	    setHabitat("selva");
	    colorPiel = "rojo";
	    venenoso = true;
		listado.add(new Anfibio(nombre,edad,getHabitat(),genero,colorPiel,venenoso));	
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
	    setHabitat("selva");
	    colorPiel = "negro y amarillo";
	    venenoso = false;
		listado.add(new Anfibio(nombre,edad,getHabitat(),genero,colorPiel,venenoso));	
		salamandras++;
	}
	
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public boolean getVenenoso() {
		return this.venenoso;
	}



}
