package Vector;

import java.util.Arrays;
 
class ArrayListCustom<E> {
    
  private static final int INITIAL_CAPACITY = 10;
  private Object elementData[]={};
  private int size = 0;
 
  public ArrayListCustom() {
    elementData = new Object[INITIAL_CAPACITY];
 }
 
  public void add(E e) {
    if (size == elementData.length) {
      ensureCapacity(); 
    try {
           Thread.sleep(1000);
    } catch (InterruptedException ex) {
           ex.printStackTrace();
    }
 
    
    elementData[size++] = e;
  }
  }
 
  @SuppressWarnings("unchecked")
  public E get(int index) {
   
    if ( index <0 || index>= size) {  
      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
    }
    return (E) elementData[index]; 
  }
 
 
 
  private void ensureCapacity() {
    int newIncreasedCapacity = elementData.length * 2;
    elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
  }
 
 
}
 
public class ArrayListCustomExample {
     
    public static void main(String... a) throws InterruptedException {
           final ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
 
           new Thread() {
                  public void run() {
                        list.add(54);
                  }
           }.start();
           Thread.sleep(10);
           new Thread() {
                  public void run() {
                        System.out.println("\nelement at index " + 0 + " = "
                                             + list.get(0));
                  }
           }.start();
 
    }
     
}