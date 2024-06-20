
package Algoritmos.SearchMethods;

/*
    Busqueda lineal: itera una coleccion, un dato cada vez.
    
            complejidad de ejecucion: O(n).
    
    Desventajas:
       - Es lento en grandes colecciones de datos.

    Ventajas:
       - Es rapido para buscar en una pequena y mediana coleccion de datos.
       - No se necesita ordernar.
       - Uso para estructura de datos que no tengan un acceso aleatorio (Linked list);
*/
public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {9,1,8,2,7,3,6,4,5};
        
        int index = linearSearch(array, 7);
        System.out.println("index = " + index);
    }
   
    public static int linearSearch(int [] array, int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    
   
    /*
    El proposito de este metodo es mostrar como funciona una busqueda lineal con un centinela,
    el proposito del centinela es reducir las comparaciones(busquedas) dentro de la coleccion, pero
    en sistemas mas modernos, este metodo puede consumir un poco mas de tiempo.
    */
    public static int linearSearchWithSentinel(int[] array, int data)
    {
       int n = array.length;
       int [] my_array = new int[n +1];
       System.arraycopy(array, 0, my_array, 0, n);
       my_array[n] = data; 
       int i = 0;
       while(my_array[i] != data ){
           i++;
       } 
             return(i <(n))? i : -1;
    }
}
