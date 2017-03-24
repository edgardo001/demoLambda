# demoLambda Java 1.8
* **Ejemplos**

```java
ArrayList<Persona> l = new ArrayList<Persona>();

List<Persona> collect1 = l.stream().filter(p -> p.getNombre().equals("edgardo")).collect(Collectors.toList());

collect1.forEach(p -> System.out.println(" - Nombre: " + p.getNombre() + " Apellido: " + p.getApellido()));

Persona persUnica = l.stream().filter(p -> p.getEdad() == 50).findFirst().orElse(null);

Optional<Persona> findFirst = l.stream().findFirst();

l.stream().filter(p -> p.getEdad() == 27).peek(p -> System.out.println("Vive en: " + p.getDomicilio())).findAny().get();

long count = l.stream().filter(p -> p.getNombre().equals(findByNombre) && p.getApellido().equals("altamirano")).count();
```

* Codigo Principal:
https://github.com/edgardo001/demoLambda/blob/master/src/demolambda/DemoLambda.java