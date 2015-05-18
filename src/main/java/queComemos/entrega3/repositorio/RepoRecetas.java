package queComemos.entrega3.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import queComemos.entrega3.creacionales.RecetaBuilder;
import queComemos.entrega3.dominio.Receta;

import com.google.gson.Gson;

public class RepoRecetas {

	List<Receta> recetas;

	public RepoRecetas() {
		recetas = new ArrayList<Receta>();
		this.crearRepoRecetas();
	}

	public void crearRepoRecetas() {
		recetas.add(new RecetaBuilder("ensalada caesar").agregar("lechuga").agregar("croutons").agregar("parmesano")
				.tiempoPreparacion(15).inventadaPor("Cesar Po").build());
		recetas.add(new RecetaBuilder("ensalada lechuga agridulce").agregar("lechuga").agregar("manzana").agregar("parmesano").agregar("nueces")
				.tiempoPreparacion(20).mediana().inventadaPor("Claire Underwood").build());
		recetas.add(new RecetaBuilder("salmon a la plancha").agregar("salmon").agregar("limon")
				.tiempoPreparacion(30).inventadaPor("Claire Underwood").build());
		recetas.add(new RecetaBuilder("gambas al ajillo").agregar("berberechos").agregar("ajo").agregar("mejillones").agregar("tomate").agregar("langostinos")
				.tiempoPreparacion(30).dificil().inventadaPor("Claire Underwood").build());	
		recetas.add(new RecetaBuilder("pure mixto").agregar("papa").agregar("zanahoria").agregar("calabaza").agregar("aceite")
				.tiempoPreparacion(25).mediana().inventadaPor("Yannick Benneteau").build());	
		recetas.add(new RecetaBuilder("churrasco a la sal").agregar("bife angosto").agregar("tomillo").agregar("sal gruesa")
				.tiempoPreparacion(20).inventadaPor("Biff Angoust").build());	
		recetas.add(new RecetaBuilder("ensalada capresse").agregar("tomate").agregar("albahaca").agregar("mozzarella")
				.tiempoPreparacion(10).inventadaPor("Biff Angoust").build());
		
		recetas.add(new RecetaBuilder("canelones de ricota y verdura").agregar("tapa de panqueque").agregar("ricota").agregar("acelga").agregar("pure de tomate")
				.tiempoPreparacion(40).dificil().inventadaPor("Francis Underwood").build());	
		recetas.add(new RecetaBuilder("sushi").agregar("arroz yamani").agregar("alga").agregar("palta").agregar("salmon")
				.tiempoPreparacion(30).mediana().inventadaPor("Doug Stamper").build());	
		recetas.add(new RecetaBuilder("pollo al whisky").agregar("whisky").agregar("pollo").agregar("bourbon").agregar("ginebra")
				.tiempoPreparacion(50).inventadaPor("Doug Stamper").build());	
		recetas.add(new RecetaBuilder("flan casero").agregar("huevos").agregar("leche").agregar("azucar")
				.tiempoPreparacion(30).mediana().inventadaPor("Zoe Barnes").build());	
		recetas.add(new RecetaBuilder("cassatta").agregar("helado de americana").agregar("helado de chocolate").agregar("helado de frutilla")
				.tiempoPreparacion(10).inventadaPor("Zoe Barnes").build());	
	}

	public String getRecetas(BusquedaRecetas busquedaRecetas) {
		List<Receta> result = recetas.stream().filter( receta -> busquedaRecetas.matchea(receta) ).collect(Collectors.toList());
		String resultJSon = new Gson().toJson(result);
		return resultJSon;
	};
	
	public List<Receta> filterRecetas(BusquedaRecetas busquedaRecetas) {
		return recetas.stream().filter( receta -> busquedaRecetas.matchea(receta) ).collect(Collectors.toList());
	};

}
