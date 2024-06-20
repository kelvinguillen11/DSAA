
package Algoritmos.SortingMethods;

public class SelectionSort {
    /*
        Selection Sort:
        El algoritmo de seleccion, toma un valor minimo  durante cadda iteracion. y en el final de cada
        una de estas, cambia las variables,
    
    
            Complejidad de ejecucion : O(n^2)
            
             Para conjuntos de datos pequnenos: BIEN.
             Para conjuntos de datos medianos y grandes: INEFICIENTE.
    */
    
    public static void main(String[] args) {
        int[] array = {8,7,9,2,3,1,5,4,6};
        selectionSort(array);
        for(int i: array){
            System.out.print(i + " ");
        }
    }
     
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length -1 ; i++) {
            int min = i;
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min =j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
