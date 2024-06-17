
package Algoritmos.SortingMethods;


public class InsercionBinaria {
     
    public static void main(String[] args) {
    int[] myArray = {44,55,12,42,94,18,06,67}; 
    imprimir(BinaryInsertion(myArray));
    }
    
    public static int[] BinaryInsertion(int [] array){
        for (int i = 1; i < array.length-1; i++) {
            int x= array[i];
            int L= 0;
            int R =i;
            while(L<R){
                int m = (L+R) /2;
                if(array[m] <= x ){
                    L = m+1;
                }
                else{
                    R = m;
                }
            }
            for (int j = i; j > L; j--) {
                array[j] = array[j-1];
            }
            array[R] =x;
        }
        return array;
    }
    public static void imprimir(int[] array){
    for (int i = 0; i < array.length -1; i++) {
        System.out.println("Array posicion = " +i + " Valor = " + array[i]);
    }
   }
}
