/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Datasoft
 */
public class DemoLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creamos a las personas
        Persona p1 = new Persona("edgardo", "vasquez", "99219760", "Lo ovalle", 27, "24856258", "Desarrollador");
        Persona p2 = new Persona("carolina", "prado", "78982455", "Coronel", 27, "9852165", "QA");
        Persona p3 = new Persona("isabel", "fajardo", "12356876", "arauco", 30, "7521145", "DevOps");
        Persona p4 = new Persona("alberto", "valenzuela", "98767854", "4 alamos", 50, "3654215", "Redes");
        Persona p5 = new Persona("carlos", "lopez", "34378654", "carmen", 32, "1254325", "Analista");
        Persona p6 = new Persona("raul", "altamirano", "65423456", "alameda", 20, "2153258", "Soporte");
        Persona p7 = new Persona("juan", "nuñez", "23231445", "Padre mariano", 35, "3685423", "tecnico");
        Persona p8 = new Persona("edgardo", "berrios", "23231445", "Padre mariano", 35, "3685423", "tecnico");
        //Creamos una lista para almacenar a las personas creadas
        ArrayList<Persona> l = new ArrayList<Persona>();
        //Guardamos a las personas en una lista
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        l.add(p6);
        l.add(p7);
        l.add(p8);

        //*************************************************************************
        //*********************Se inician busquedas Lambda*************************
        //*************************************************************************
        //.Filter, se fitran por un dato en particular
        //.collect(Collectors.toList()), convierte el retorno de "filter" en una coleccion, para poder ser usada posteriormente
        List<Persona> collect1 = l.stream().filter(p -> p.getNombre().equals("edgardo")).collect(Collectors.toList());
        System.out.println("Multiples personas de una coleccion, esta es la primera: " + collect1.get(0).getApellido());

        System.out.println("Listamos todos los de la coleccion anterior: ");
        //Recorremos la coleccion y ejecutamos una accion parada elemento recorrido
        collect1.forEach(p -> System.out.println(" - Nombre: " + p.getNombre() + " Apellido: " + p.getApellido()));

        System.out.println("=============================================================");

        //.filter, filtra a una persona por su edad
        //Retorna la primera coincidencia.
        //.orElse, indica que debe traer a un objeto "Persona", y si no encuentra, retornara null, si no se coloca, retornara un objeto
        //"Optional<Persona>" y para obtener su valor se puede usar ".get()" sobre el retorno.
        Persona persUnica = l.stream().filter(p -> p.getEdad() == 50).findFirst().orElse(null);
        System.out.println("Persona Unica: " + persUnica.getApellido());

        System.out.println("=============================================================");

        //findFirst, Buscamos a la primera persona de la lista
        Optional<Persona> findFirst = l.stream().findFirst();
        System.out.println("Buscamos a la primera persona de la lista he indicamos su existencia y su nombre:");
        System.out.println("Existe? " + findFirst.isPresent() + "Su nombre es: " + findFirst.get().getNombre());

        System.out.println("=============================================================");

        //.peek, se almacena una acccion en la primera coincidencia que encuentre.
        //.findAny, obtiene el primer elemento de la lista
        //.get, ejecuta la accion almacenada
        System.out.println("Muestra la primera coincidencia y ejecuta una accion con '.get()'");        
        l.stream().filter(p -> p.getEdad() == 27).peek(p -> System.out.println("Vive en: " + p.getDomicilio())).findAny().get();

        System.out.println("=============================================================");

        //Cuenta la cantidad de elementos con la condicion entregada
        String findByNombre = "raul";
        long count = l.stream().filter(p -> p.getNombre().equals(findByNombre) && p.getApellido().equals("altamirano")).count();
        System.out.println("Hay " + count + " coincidencia con el nombre: " + findByNombre);

    }
}
