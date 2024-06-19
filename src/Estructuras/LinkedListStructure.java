
package Estructuras;

import java.util.LinkedList;


public class LinkedListStructure {
    /*
        LISTAS ENLAZADAS:
        Guardan nodos y lo hacen en 2 partes, (dato + direccion)
        los nodos no estan en una localizacion consecutiva, por eso los elementos
        usan punteros para poder enlazarse.
    
        Listas individuales:
            nodo                    nodo            nodo
        [dato| direccion] -> [dato| direccion] -> [dato| direccion] 
        
        Listas Dobles:
                    nodo                              nodo
        [direccion| dato | direccion] <-> [direccion| dato | direccion]

    Ventajas:
        - Estructura de datos dinamica(Asigna la memoria necesaria mientras se ejecuta).
        - La insercion y eliminacion de los nodos es constante O(1).
        - Nula/ Baja memoria usada.
    
    Desventajas:
        - Mayor uso de memoria para almacenar(puntero adicional en el caso de las listas dobles).
        - No hay accesso aleatorio en los elementos( no hay indexacion [i]).
        - Accesso y busqueda de elementos consume mas tiempo . O(n).
    
    Usos?
    * Implementar pilas/colas (stacks/queues)
    * Navegacion GPS.
    * Playlist de musica.
    
    */
    public static void main(String[] args) {
    //Instancia de una lista enlazada.
    LinkedList<String> linkedList = new LinkedList<String>();
    
        /*   
    
    Podemos tratar a una lista enlazada como un stack(pila).
              linkedList.push("A");
              linkedList.push("B");
              linkedList.push("C");
              linkedList.push("D");
              linkedList.push("E");
              linkedList.pop();*/
/*
        Tambien podemos tratar a una lista enlazada como una Cola(queue).
        
              linkedList.offer("A");
              linkedList.offer("B");
              linkedList.offer("C");
              linkedList.offer("D");
              linkedList.offer("F");
   */

              linkedList.offer("A");
              linkedList.offer("B");
              linkedList.offer("C");
              linkedList.offer("D");
              linkedList.offer("F");
              
    //Agregaremos un nodo entre la letra D y F, para poder agregar la letra E.
    linkedList.add(4, "E");
    linkedList.remove("E");
    
    //Buscaremos el index de un elemento dentro de nuestra lista enlazada.
        System.out.println("Index: " + linkedList.indexOf("F"));
   
    //Tomaremos el primer nodo de nuestra lista enlazada.
        System.out.println("Nodo: " + linkedList.peekFirst());

        
    //Tomaremos el ultimo nodo de nuestra lista enlzasa.
        System.out.println("Nodo: " + linkedList.peekLast());
    
    //Agregar un elemento en la cabeza de nuestra lista.
        linkedList.addFirst("0");
       
    //Agregar un elemento en la cola de nuestra lista.
        linkedList.addLast("G");
        
    //Obtiene el primer elemento, pero tambien lo elimina de la lista enlazada.    
        String first = linkedList.removeFirst();
    
    //Obtiene el ultimo elemento, pero tambien lo elimina de la lista enlazada.
        String last = linkedList.removeLast();
        
        System.out.println("linkedList = " + linkedList);
    
    }
   
}
