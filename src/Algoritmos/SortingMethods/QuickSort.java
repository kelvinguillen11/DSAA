
package Algoritmos.SortingMethods;

public class QuickSort {
    /*
    QuickSort: es una funcion recursiva, utilizando el divide y venceras, tomando un elemento de la coleccion
    como pivote, por lo general este elmento es el ultimo de la coleccion, este elemento se utiliza para encontrar
    su posicion en el arreglo, ya que haciendo esto, se ordena de manera que  los elementos menores al pivote queden 
    a la izquierda, y los elementos mayores a la derecha.
    
    
    tiempo de ejecucion = Mejores casos O(n log(n))
                          Caso promedio O(n log(n))
                          Peor caso O(n^2) si ya esta ordenado.
    */
    public static void main(String[] args) {
        
        int array[] = {8,2,5,3,4,7,6,1,9,10,3};
        
        quickSort(array, 0, array.length -1);
        
        for(int i: array){
            System.out.print(i + " ");
        }
        
      
    }
    private static void quickSort( int [] array, int start, int end){
        
        if(end <=start) return; //caso baso 
        
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot -1);
        quickSort(array, pivot +1, end);
    }
    private static int partition( int [] array, int start, int end){
        
        int pivot=array[end];
        int i = start -1;
        for (int j = start; j <= end -1; j++) {
            if(array[j]< pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
           int temp = array[i];
           array[i] = array[end];
           array[end] = temp;
        return i;
    
    }
}
