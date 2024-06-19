
package Algoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVsArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        long inicio;
        long finalt;
        long tiempo;
        
        for (int i = 0; i < 100000; i++) {
           linkedList.add(i);
           arrayList.add(i);
        }
        // **LinkedList**
        inicio = System.nanoTime();
        
       // linkedList.get(0);
       // linkedList.get(99999);
       // linkedList.remove(0);
       // linkedList.remove(50000);
          linkedList.remove(99999);

       finalt = System.nanoTime();
        
      
        tiempo = finalt - inicio;
    
        System.out.println("LinkedList:\t" + tiempo + " ns");
    
        //**ArrayList**
         inicio = System.nanoTime();
        
       // arrayList.get(0);
       // arrayList.get(99999);
       //arrayList.remove(0);
       //arrayList.remove(50000);
       arrayList.remove(99999);
        finalt = System.nanoTime();
        
      
        tiempo = finalt - inicio;
    
        System.out.println("ArrayList:\t" + tiempo + " ms");
    }
}
