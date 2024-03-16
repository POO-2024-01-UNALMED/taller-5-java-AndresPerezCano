package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public Ave() {}
	
	public int cantidadAves() {
		int cantidadAv = 0;
		for (Ave ave : listado) {
			if (ave != null) {
			cantidadAv++;}
		}
		return cantidadAv;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
	    setHabitat("montanas");
	    colorPlumas = "cafe glorioso";
		listado.add(new Ave(nombre,edad,getHabitat(),genero,colorPlumas));	
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
	    setHabitat("montanas");
	    colorPlumas = "blanco y amarillo";
		listado.add(new Ave(nombre,edad,getHabitat(),genero,colorPlumas));	
		aguilas++;
	}
	
	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}
	public ArrayList<Ave> getListado() {
		return listado;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	

}
