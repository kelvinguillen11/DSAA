/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/*
El siguiente fragmento de codigo muestra la complejidad en el tiempo de ejecucion de un algoritmo
tomando como base el problema, de la suma de todos los numeros naturales hasta n.
 */


public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
        long term = 9999999999L;
        System.out.println(demo.findSumF(term));
        System.out.println("tiempo que toma el algoritmo:" + (System.currentTimeMillis() - now) + " milisengudos");
        
//System.out.println(demo.findSumF(6));
    }

    public  long findSum(long n)
    {
        return n * ((n+1) /2);
        
    }

    public  long findSumF(long n){
        long sum = 0;
        for(long i = 0; i <=n;i++){
            sum += i;
        }
        return sum;
    }
}


