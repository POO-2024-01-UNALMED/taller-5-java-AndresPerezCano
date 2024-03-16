package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public Pez() {}
	
	public int cantidadPeces() {
		int cantidadPe = 0;
		for (Pez pez : listado) {
			if (pez != null) {
			cantidadPe++;}
		}
		return cantidadPe;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
	    setHabitat("oceano");
	    colorEscamas = "rojo";
	    cantidadAletas = 6;
		listado.add(new Pez(nombre,edad,getHabitat(),genero,colorEscamas,cantidadAletas));	
		salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
	    setHabitat("oceano");
	    colorEscamas = "gris";
	    cantidadAletas = 6;
		listado.add(new Pez(nombre,edad,getHabitat(),genero,colorEscamas,cantidadAletas));	
		bacalaos++;
	}
	
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public int getLargoCola() {
		return this.cantidadAletas;
	}



}
