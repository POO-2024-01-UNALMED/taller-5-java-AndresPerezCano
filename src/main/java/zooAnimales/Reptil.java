package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public Reptil() {}
	
	public int cantidadReptiles() {
		int cantidadRe = 0;
		for (Reptil reptil : listado) {
			if (reptil != null) {
			cantidadRe++;}
		}
		return cantidadRe;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
	    setHabitat("humedal");
	    colorEscamas = "verde";
	    largoCola = 3;
		listado.add(new Reptil(nombre,edad,getHabitat(),genero,colorEscamas,largoCola));	
		iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
	    setHabitat("jungla");
	    colorEscamas = "blanco";
	    largoCola = 1;
		listado.add(new Reptil(nombre,edad,getHabitat(),genero,colorEscamas,largoCola));	
		serpientes++;
	}
	
	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}
	public ArrayList<Reptil> getListado() {
		return listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public int getLargoCola() {
		return this.largoCola;
	}

}
