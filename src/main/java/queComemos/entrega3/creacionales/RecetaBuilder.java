package queComemos.entrega3.creacionales;

import queComemos.entrega3.dominio.Dificultad;
import queComemos.entrega3.dominio.Receta;
import queComemos.entrega3.excepciones.BusinessException;

public class RecetaBuilder {

	private Receta receta;

	public RecetaBuilder(String nombre) {
		receta = new Receta();
		receta.setNombre(nombre);
	}
	
	public RecetaBuilder inventadaPor(String autor) {
		receta.setAutor(autor);
		return this;
	}
	
	public RecetaBuilder agregar(String ingrediente) {
		receta.agregarIngrediente(ingrediente);
		return this;
	}

	public RecetaBuilder tiempoPreparacion(int tiempoPreparacion) {
		receta.setTotalCalorias(tiempoPreparacion);
		return this;
	}

	public RecetaBuilder dificil() {
		receta.setDificultadReceta(Dificultad.DIFICIL);
		return this;
	}

	public RecetaBuilder mediana() {
		receta.setDificultadReceta(Dificultad.MEDIANA);
		return this;
	}

	public RecetaBuilder totalCalorias(int totalCalorias) {
		receta.setTotalCalorias(totalCalorias);
		return this;
	}

	public Receta build() {
		if (!receta.tieneIngredientes()) {
			throw new BusinessException("Receta sin ingredientes");
		}
		return receta;
	}
	
}
