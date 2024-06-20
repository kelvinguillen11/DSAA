
package Algoritmos.SearchMethods;

/*
    Busqueda Binaria:
    Algoritmo  de busqueda eficiente para grandes cantidades de datos, pero estos tienen que estar previamente
    ordenados.

    Complejidad del algoritmo: O(log n)
    
    Ventajas:
        - Busqueda sumamente escencial para grandes cantidades de datos.
    
    Desventajas:
        - Si los datos no estan previamente ordenados, no podra ejecutarse este algoritmo, sera muy ineficiente.

*/
public class BinarySearch {
    public static void main(String[] args) {
        int [] array = new int[1000000];
        int target = 300;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        
        int index = binarySearch(array,target);
        System.out.println("index = " + index);
    }
    
    public static int binarySearch( int[] array, int target){
        int L = 0;
        int R = array.length - 1;
        int M=0;
        while(L<=R){
            
            M= L + (R - L)/2;
            int value = array[M];
            //este codigo solo es para fines educativos, para que quede evidencia 
            System.out.println("value = " + value);
            
            
            if(array[M] < target)L = M+1;     
            else if (array[M] > target)R= M -1;
            else return M; //si se ejecuta este codigo, es porque el dato fue encontrado.
        }
        return -1;
      
    }
}
