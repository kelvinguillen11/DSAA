
package Algoritmos.Ejercicios;

import java.util.*;
import java.math.*;
public class TwoSums {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        int[] resultado = twoSum(array, target);
        if (resultado != null) {
            System.out.println("el resultado es :" + "["+resultado[0] + "," + resultado[1]+"]");
        } else {
            System.out.println("No se encontraron dos números que sumen " + target);
        }
    }
    
    public static int[] twoSum(int[] array, int target){
    Hashtable<Integer, Integer> table = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            int x = target - array[i];
            if(table.containsKey(x)) return new int[] {table.get(x),i};
            table.put(array[i], i);
        }
            return null;
    }
       
}
    

