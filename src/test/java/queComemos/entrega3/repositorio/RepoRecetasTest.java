package queComemos.entrega3.repositorio;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import queComemos.entrega3.dominio.Dificultad;

public class RepoRecetasTest {
	RepoRecetas repoRecetas;
	
	@Before
	public void init() {
		repoRecetas = new RepoRecetas();
	}
	
	@Test
	public void testAllRecetas() {
		String allRecetas = repoRecetas.getRecetas(new BusquedaRecetas());
		System.out.println(allRecetas);
		Assert.assertNotEquals("", allRecetas);
	}

	@Test
	public void testRecetasDeEnsalada() {
		BusquedaRecetas busquedaRecetas = new BusquedaRecetas();
		busquedaRecetas.setNombre("ensalada");
		assertEquals(3, repoRecetas.filterRecetas(busquedaRecetas).size());
	}

	@Test
	public void testRecetasConSalmon() {
		BusquedaRecetas busquedaRecetas = new BusquedaRecetas();
		busquedaRecetas.agregarPalabraClave("salmon");
		assertEquals(2, repoRecetas.filterRecetas(busquedaRecetas).size());
	}

	@Test
	public void testRecetasDificiles() {
		BusquedaRecetas busquedaRecetas = new BusquedaRecetas();
		busquedaRecetas.setDificultad(Dificultad.DIFICIL);
		assertEquals(2, repoRecetas.filterRecetas(busquedaRecetas).size());
	}

	@Test
	public void testRecetasDeSalmonMedianas() {
		BusquedaRecetas busquedaRecetas = new BusquedaRecetas();
		busquedaRecetas.agregarPalabraClave("salmon");
		busquedaRecetas.setDificultad(Dificultad.MEDIANA);
		assertEquals(1, repoRecetas.filterRecetas(busquedaRecetas).size());
	}

}
