package queComemos.entrega3.dominio;

import java.util.ArrayList;
import java.util.List;

public class Receta {

	String nombre;
	List<String> ingredientes = new ArrayList<String>();
	int tiempoPreparacion;
	int totalCalorias;
	Dificultad dificultadReceta = Dificultad.FACIL;
	String autor = null; 
	int anioReceta = 2015;

	/****************************************
	 * GETTERS Y SETTERS
	 ****************************************/	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	public int getTotalCalorias() {
		return totalCalorias;
	}
	public void setTotalCalorias(int totalCalorias) {
		this.totalCalorias = totalCalorias;
	}
	public Dificultad getDificultadReceta() {
		return dificultadReceta;
	}
	public void setDificultadReceta(Dificultad dificultadReceta) {
		this.dificultadReceta = dificultadReceta;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioReceta() {
		return anioReceta;
	}
	public void setAnioReceta(int anioReceta) {
		this.anioReceta = anioReceta;
	}
	
	/****************************************
	 * METODOS DE NEGOCIO
	 ****************************************/
	public void agregarIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
	}
	
	public boolean tieneIngredientes() {
		return !ingredientes.isEmpty();
	}

}
