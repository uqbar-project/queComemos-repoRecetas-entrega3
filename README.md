# queComemos-repoRecetas-entrega3
Componente que debe integrarse con la entrega 3 para hacer busquedas de recetas

## Observaciones
Está desarrollado en **Java 8**, de manera que 
- para los grupos que utilizan Java 8 obviamente se integra sin mayores dificultades
- para los grupos que utilizan XTend, Scala o Groovy es transparente, siempre y cuando tengan instalada y activa la JDK 1.8
- los grupos que estén trabajando en Java 1.7 ó versiones anteriores deberían a) instalar una JDK 1.8 y compilar de aquí en más con 1.8 aunque utilicen construcciones de 1.7, b) bajarse el componente y hacer el downgrade manualmente a 1.7. Recomendamos la primera opción.

## Uso
La dependencia a agregar debe ser:

```xml
<dependency>
  <groupId>org.uqbar-project</groupId>
	<artifactId>queComemos-repoRecetas-entrega3</artifactId>
	<version>0.0.2</version>
</dependency>
```

Este componente está deployado en Maven Central por lo que no es necesario hacer ningún cambio en el archivo settings.xml de tu máquina.
