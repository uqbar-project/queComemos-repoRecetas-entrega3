package queComemos.entrega3.repositorio;

import java.util.ArrayList;
import java.util.List;

import queComemos.entrega3.dominio.Dificultad;
import queComemos.entrega3.dominio.Receta;

public class BusquedaRecetas {

	String nombre = null;
	Dificultad dificultad = null;
	List<String> palabrasClave = new ArrayList<String>();

	/******************************************
	 * GETTERS Y SETTERS
	 ******************************************
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	/******************************************
	 * METODOS DE NEGOCIO
	 ******************************************
	 */
	public void agregarPalabraClave(String palabra) {
		palabrasClave.add(palabra);
	}

	public boolean matchea(Receta receta) {
		return this.coincideNombre(receta.getNombre()) && this.coincideDificultad(receta.getDificultadReceta())
				&& this.coincidenPalabrasClave(receta.getIngredientes());
	}

	private boolean coincideNombre(String nombreReceta) {
		return nombre == null || nombreReceta.contains(nombre);
	}

	private boolean coincidenPalabrasClave(List<String> ingredientes) {
		return palabrasClave.isEmpty() || palabrasClave.stream().anyMatch(palabra -> ingredientes.contains(palabra));
	}

	private boolean coincideDificultad(Dificultad dificultadReceta) {
		return dificultad == null || dificultadReceta.equals(dificultad);
	}

}
