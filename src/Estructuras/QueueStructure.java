
package Estructuras;

import java.util.LinkedList;
import java.util.Queue;


public class QueueStructure {
    
    /*
        Cola:
        Estructura de dato que sigue el tipo FIFO(First In, First Out).
        que almacena datos para despues ser procesados de manera lineal.
    
        add = encolar, offer()
        remove = desencolar, poll()
        
    */
    public static void main(String[] args) {
        
        //Inicializar una Cola 
        //Ya que una cola es una interface, no podemos instanciarla por lo que podemos usar poliformismo.
        Queue<String> queue = new LinkedList<String>();
        
        //Ya que nuestra cola hereda de la clase collection podemos ejecutar el metodod isEmpty
        System.out.println(queue.isEmpty());
        
        //El siguiente metodo nos devuelve un booleano si algun dato existe dentro de nuestra cola
        System.out.println(queue.contains("Harold"));
        
        //Agregar elementos a  nuestra cola
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        
        //Tambien podemos conocer su tamano gracias a la clase collection con .size()
        System.out.println(queue.size());
        
        
        imprimir(queue);
        
        //Obtendremos el elemento que este en el peek de nuestra cola.
        System.out.println(queue.peek());
        
        //Remover el elemento que este de principio de nuestra cola.
        queue.poll();
        
       /*
        USO DE LAS COLAS:
        1.Buffer de teclado(las letras que son presionadas en el ordern que fueron presionadas);
        2.Cola de impresion( imprimir trabajos que fueron completados en orden)
        3. se usa en LinkedList, PriorityQueues, Breadth-first search.
        */
    }
    
    
    public static void imprimir(Queue<String> queue){
        
        System.out.println("El contenido de su cola es: \n " + queue);
    }
}
