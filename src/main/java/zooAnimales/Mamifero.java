package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private ArrayList<Mamifero> listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero() {}
	
	public int cantidadMamiferos() {
		int cantidadMa = 0;
		for (int i = 0 ; i < listado.size(); i++) {
			cantidadMa++;
		}
		return cantidadMa;
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
	    setHabitat("pradera");
	    pelaje = true;
	    patas = 4;
		listado.add(new Mamifero(nombre,edad,getHabitat(),genero,pelaje,patas));	
		caballos++;
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
	    setHabitat("selva");
	    pelaje = true;
	    patas = 4;
		listado.add(new Mamifero(nombre,edad,getHabitat(),genero,pelaje,patas));	
		leones++;
	}
	
	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}
	public ArrayList<Mamifero> getListado() {
		return listado;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean getPelaje() {
		return this.pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas() {
		return this.patas;
	}
}
