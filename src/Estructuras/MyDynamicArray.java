
package Estructuras;

public class MyDynamicArray {
    int size;
    int capacity = 10;
    Object[] array;
    
    public MyDynamicArray(){
        this.array = new Object[capacity];
    }
    public MyDynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    
    public void add(Object d)
    {
        if(size <= capacity){
            grow();
        }
        this.array[size] = d;
        size++;
    }
    
    public void insert(int index, Object data){
        if (size>= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }
    
    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j +1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int)(capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }   
    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if(array[i] == data){
                return i;
               
            }
        }
      return -1; 
    }
    public void grow(){
        int newCapacity = (int) (capacity *2);
       Object[] newArray = new Object[newCapacity];
       
        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }
        this.capacity = newCapacity;
        this.array = newArray;
    }
    public void shrink(){
          int newCapacity = (int) (capacity /2);
       Object[] newArray = new Object[newCapacity];
       
        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }
        this.capacity = newCapacity;
        this.array = newArray;
    }
    
    public boolean isEmpty(){
        
        return this.size == 0;
    }
    
    public String toString(){
        String string = "";
        for (int i = 0; i < this.capacity; i++) {
            string += this.array[i] + ", ";
        }
        if(string !=""){
            string = "["+string.substring(0, string.length()-2)+"]";
        }else{
            string = "[EMPTY :)]";
        }
        return string;
    }
}