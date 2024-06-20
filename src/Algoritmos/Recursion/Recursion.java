

package Algoritmos.Recursion;


public class Recursion {
   
    /*
        Recursividad:
        La recursividad es cuando un metodo se llama a si mismo.
    
    
        Ventajas:
        - Facil de leer/escribir.
        - Facil de debbugear.
    
        Desventajas:
        - A veces es muy lento.
        - Aumento del uso de memoria.
        
    */
    public static void main(String[] args) {
        
        walk(5);
    }
    
    public static void walk(int steps){
        if(steps<1)return;
        System.out.println("Tu tomaste el paso n : " + steps);
        walk(steps -1);
        
    }
}
