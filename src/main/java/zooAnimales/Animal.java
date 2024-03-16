package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
    private ArrayList<Zona> zona;
    
    public Animal( String nombre, int edad, String habitat, String genero){
    	totalAnimales++;
    	this.nombre = nombre;
    	this.edad = edad;
    	this.habitat = habitat;
    	this.genero = genero;
    	
    }
    
    public Animal() {}

    
    public String movimiento() {
    	return "desplazarse";
    }
    
    public String totalPorTipo() {
    	return "Mamiferos: " + cantidadMamiferos() + "\n" +
    			"Aves: " + cantidadAves() + "\n" +
    			"Reptiles: " + cantidadReptiles() + "\n" +
    			"Peces: " + cantidadPeces() + "\n" +
    			"Anfibios: " + cantidadAnfibios();
    }
    
    public String toString() {
         nomb = Zona.getZoo();
    	return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + "y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona + ", en el " + Zona.getZoo().nombre;
    }
    
    public String getHabitat() {
    	return this.habitat;
    }
    public void setHabitat(String habitat) {
    	this.habitat = habitat;
    }
    

}
