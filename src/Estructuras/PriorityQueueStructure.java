
package Estructuras;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueStructure {
    
    /*
        Colas de prioridad:
        Estructura de datos que almacena datos y los ordena segun su prioridad,
        por este mismo principio las priority Queues no siguen el tipo FIFO.
        Siempren procesaran  primero, el dato con mayour prioridad.     
    */
    public static void main(String[] args) {
        //instancia de una  cola normal.
        //Queue<Double> queue = new LinkedList<>();
        
        //Instancia de una cola especial
        //En su constructor hemos pasado un parametro para modificar el comportamiento de la prioridad de la cola
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        //Agregamos elementos a la cola.
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("A");
        queue.offer("Z");
        
        //bucle para procesar la cola
        /*Cuando se use la cola especial los datos ya no se procesaran normalmente si no por una prioridad.
          siendo esta prioridad por defecto de manera ascendente*/
        while(!queue.isEmpty()){
            
            System.out.println("Dato: " + queue.poll());
        }
        
        
    }
}
