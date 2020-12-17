import java.util.*;
import java.io.*;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    int iteration = 0;
    while (! sorted) {
      sorted = true;
      iteration += 1;
      for (int i = 0; i < data.length - iteration; i++) {
        // for (int j = 0; j < data.length; j++) {
        //   System.out.print(data[j] + " ");
        // }
        System.out.println(Arrays.toString(data));
        if (data[i]>data[i+1]) {
          sorted = false;
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
      System.out.println();
    }
  }
}
