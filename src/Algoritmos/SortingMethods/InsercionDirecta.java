
package Algoritmos.SortingMethods;

/*
Este método es muy utilizado por los jugadores de cartas. Los elementos (tarjetas) se dividen conceptualmente en un destino.
secuencia a1... ai-1 y una secuencia fuente ai... an. En cada paso, comenzando con i = 2 e incrementando i en
unidad, el i-ésimo elemento de la secuencia de origen se selecciona y se transfiere a la secuencia de destino mediante
introduciéndolo en el lugar apropiado.
*/
public class InsercionDirecta {
    
    public static void main(String[] args) {
    //declaracion de nuestro array.
    int[] myArray = {44,55,12,42,94,18,06,67};    
    imprimir(Straigh(myArray));
    }
public static int[] Straigh(int[] array){
for(int i= 1; i < array.length; i++){
    int x = array[i];
    int j = i -1;
    while((j>=0) && (x < array[j])){
        array[j+1] = array[j];
        j--;
    }
    array[j +1]= x;
}
return array;
}

public static void imprimir(int[] array){
    for (int i = 0; i < array.length -1; i++) {
        System.out.println("Array posicion = " +i + " Valor = " + array[i]);
    }
}
}


