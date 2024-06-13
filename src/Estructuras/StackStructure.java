package Estructuras;


import java.util.Stack;


/*
 Pilas = Stack.
Estructura de tipo LIFO.
*/
public class StackStructure {
    public static void main(String[] args) {
        
        //Sintaxis para crear un stack, indicando el tipo de datos a guardar, puede ser de tipo generico u object
        Stack<String> miFirstStack = new Stack<String>();
            
        /*
        stack.empty()
        se utiliza para saber si la pila esta vacia, devuelve un booleano;
        */
           
        //Ingresando datos a la pila
        miFirstStack.push("Minecraft");
        miFirstStack.push("DOOM");
        miFirstStack.push("Super Mario");
        miFirstStack.push("kirby");
        
        System.out.println(miFirstStack.empty());
        
        //el siguiente codigo imprime los datos que se encuentre dentro del stack
        imprimir(miFirstStack);
        
        
        /*
        Eliminaremos ahora el elemento que este arriba de toda la pila, que este sera kirBy por lo que 
        ya no se encontrara en nuestra estructura
        */
        miFirstStack.pop();
        
        imprimir(miFirstStack);
        
        //Ahora de manera secuencial en el tope de nuestra pila se encuentra el dato anterior al eliminado.
        //el metodo pop devuelve el objeto(dato), por lo cual podemos interactuar con el.
        String miGame = miFirstStack.pop();
        System.out.println("miGame = " + miGame);
        imprimir(miFirstStack);

        /*
        Ahora bien esta no es la mejor forma de devolver un valor, a no ser que ya no lo querramos en nuestra
        estructura, veremos el codigo adecuado para ello.
        */
        
        miFirstStack.push(miGame);
        String newgame = miFirstStack.peek();
        System.out.println("newgame = " + newgame);
        imprimir(miFirstStack);

         /*
        Ahora veremos el metodo para poder buscar un elemento en nuestra pila.
        NOTA:
        Es un caso interesante ya que el metodo devolvera el indice donde se encuentra el dato, pero contrario
        a un arreglo, la pila empieza en el indice 1, y el ultimo elemennto en entrar sera el primero
        y asi sucesivamente, cumpliendo con el tipo de estructura LIFO.
        */
        
         //Obtenemos el elemento que esta en la cima o en el "peek"
         String search = miFirstStack.peek();
        
         //Iprimiremos el indice del dato que hemos recuperado con peek.
         //el argumento que acepta el metodo search, es del tipo de dato que guarda.
         System.out.println("Posicion de " + search + " es: " + miFirstStack.search(search));
         
         //El metodo get, recorrera la pila como un array, el indice 0 sera el primer elemento ingresado.
         System.out.println("Usando el metodo get  = " + miFirstStack.get(0));
         

        //Si buscamos  un dato que no se encuentre en nuestra pila, el metodo devolvera -1.
         System.out.println("Elemento Fallout76  en la posicion:  " + miFirstStack.search("Fallout76"));
         
         
         
         /*
         USOS DE LAS PILAS:
         
         1.deshacer/rehacer en editores de texto.
         2.movernos hacia delante o atras en historial del navegador.
         3.Algoritmos de backtracking (maze, file directories)
         4. funciones de llamada( call stack)
         */
    }
    
    public static void imprimir(Stack<String> stack){
        System.out.println("Contenido de mi stack: \n " + stack);
    }
}
