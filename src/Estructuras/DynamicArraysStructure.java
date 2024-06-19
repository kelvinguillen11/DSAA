

package Estructuras;

import java.util.ArrayList;


public class DynamicArraysStructure {
    /*
            Arreglo dinamico:
            Estructura de datos con capacidad redimensionable, esto nos ayuda a que en tiempo de ejecucion
            pueda crecer su tamanio(size),
            
            Para esta estructura se ha creado un ejmplo basico de un arreglo dinamico donde se puede ver el 
            funcionamiento de estos arreglos, como agregan elementos, como insertan en determinados puntos 
            informacion, como aumentan su capacidad dependiendo de cuantos elementos ingresemos.
    
             nombre de la clase: MyDynamicArray.java 
    */
    public static void main(String[] args) {
        //Instancia de un arreglo dinamico.
       // ArrayList<String> arrrayList = new ArrayList<String>();
        
        //Instancia de nuestor propio arreglo dinamico.
        MyDynamicArray dynamicArray = new MyDynamicArray(5);
        
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        
        //Usando nuestro propio metodo para insertar un dato en una cierta posicion.
        dynamicArray.insert(1, "2");
        System.out.println("dynamicArray = " + dynamicArray);
        System.out.println("size " + dynamicArray.size);
        System.out.println("capcity " + dynamicArray.capacity);
        
        dynamicArray.delete("2");
        System.out.println("dynamicArray = " + dynamicArray);
        
        System.out.println("index " + dynamicArray.search("C"));
        
        

    }
}
