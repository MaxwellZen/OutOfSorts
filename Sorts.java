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
        if (data[i]>data[i+1]) {
          sorted = false;
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
    }
  }

  public static void selectionSort(int[] data) {
    for (int i = 0; i < data.length-1; i++) {
      int mindex = i;
      for (int j = i+1; j < data.length; j++) {
        if (data[j]<data[mindex]) mindex=j;
      }
      int temp = data[mindex];
      data[mindex] = data[i];
      data[i] = temp;
    }
  }

  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      if (data[i]<data[i-1]) {
        int temp = data[i];
        boolean found = false;
        for (int j = i-1; j >= 0; j--) {
          if (temp >= data[j]) {
            data[j+1] = temp;
            found = true;
            break;
          } else {
            data[j+1] = data[j];
          }
        }
        if (!found) data[0]=temp;
      }
    }
  }
}
