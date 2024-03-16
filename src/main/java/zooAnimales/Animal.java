package zooAnimales;

import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
    private Zona zona;
    
    public Animal( String nombre, int edad, String habitat, String genero){
    	totalAnimales++;
    	this.nombre = nombre;
    	this.edad = edad;
    	this.habitat = habitat;
    	this.genero = genero;
    	
    }
    
    public Animal() {
    	totalAnimales++;
    }

    
    public String movimiento() {
    	return "desplazarse";
    }
    public static String totalPorTipo() {
    	Mamifero mamifero = new Mamifero();
    	Ave ave = new Ave();
    	Reptil reptil = new Reptil();
    	Pez pez = new Pez();
    	Anfibio anfibio = new Anfibio();
    	return "Mamiferos: " + mamifero.cantidadMamiferos() + "\n" +
    			"Aves: " + ave.cantidadAves() + "\n" +
    			"Reptiles: " + reptil.cantidadReptiles() + "\n" +
    			"Peces: " + pez.cantidadPeces() + "\n" +
    			"Anfibios: " + anfibio.cantidadAnfibios();
    }
    
    public String toString() {
         String info = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero;
         if (zona != null) {
        	 info += ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre();
         }
         return info;
    }
    public int getTotalAnimales() {
    	return this.totalAnimales;
    }
    public void setTotalAnimales(int totalAnimales) {
    	this.totalAnimales = totalAnimales;
    }
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public int getEdad() {
    	return this.edad;
    }
    public void setEdad(int edad) {
    	this.edad = edad;
    }
    public String getHabitat() {
    	return this.habitat;
    }
    public void setHabitat(String habitat) {
    	this.habitat = habitat;
    }
    public String getGenero() {
    	return this.genero;
    }
    public void setGenero(String genero) {
    	this.genero = genero;
    }
    public Zona getZona() {
    	return this.zona;
    }
    public void setZona(Zona zona) {
    	this.zona = zona;
    }
    

}
