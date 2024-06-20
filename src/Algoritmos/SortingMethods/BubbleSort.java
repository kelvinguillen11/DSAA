
package Algoritmos.SortingMethods;


public class BubbleSort {
    /*
        Bubble sort (Ordenamiento por el metodo de burbuja):
        Este algoritmo ordena un conjunto de datos, comparando cada dato, y moviendo su posicion.
    
        Complejidad de ejecucion: O(n^2)
        
        Ventajas:
            - Efectivo en cantidades de datos pequenas.
    
        Desventajas:
            - Ineficiente en cantidades medias y grandes( hay mejores soluciones).
    */
    
    public static void main(String[] args) {
         int [] array = {9,1,8,2,7,3,6,4,5};
    
          bubbleSort(array);
          
          for(int i : array){
              System.out.print(i +" ");
          }
    }
    
    public static void bubbleSort(int [] array){
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }


}
