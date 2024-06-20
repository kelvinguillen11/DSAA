
package Algoritmos.SearchMethods;
/*
        Busqueda por interpolacion:
        Este algoritmo implementa una mejora sobre el algoritmo de busqueda binaria, su  mejor uso es para
        datos ordenados, utilizando un sondeo de donde esta el valor, si este sondeo es incorrecto,
        el area de busqueda se reduce, y un nuevo sondeo es calculado.

        complejidad promedio: 0(log(log(n)))
        Peor caso: O(n)
        
*/

public class InterpolationSearch {
    public static void main(String[] args) {
        int [] array = {1,2,4,6,8,16,32,64,128, 256, 512, 1024};

        int index =  interpolationSearch(array, 256);
        System.out.println("index = " + index);
    }
    
    
    public static int interpolationSearch( int [] array, int value){
        int high = array.length -1;
        int low = 0;
        
        while(value >= array[low] && value <= array[high] && low <=high){
            //Formula para calcular las sondas.
            int probe = low + (high - low) * (value - array[low])/ 
                    (array[high] - array[low]);
            System.out.println("sonda = " + probe);
        
            if(array[probe] == value) return probe;
            else if( array[probe]< value) low = probe +1;
            else high = probe - 1;
        }
        return -1;
    }
}
