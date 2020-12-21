import java.util.*;
import java.io.*;
public class Tester {
  public static void main(String[] argss) {
    int size = Integer.valueOf(argss[0]);
    String test = argss[1];
    for (int j = 0; j < 1; j++) {
      int[] data = new int[size];
      for (int i = 0; i < size; i++) {
        data[i] = (int)(Math.random()*1000);
      }
      int[] sorted = Arrays.copyOf(data, size);
      Arrays.sort(sorted);
      int[] reverse = Arrays.copyOf(sorted, size);
      for (int i = 0; i < size; i++) {
        reverse[i] = sorted[size-1-i];
      }
      int[] ans = Arrays.copyOf(sorted, size);
      if (test.equals("bubble")) {
        Sorts.bubbleSort(data); Sorts.bubbleSort(sorted); Sorts.bubbleSort(reverse);
      } else if (test.equals("selection")) {
        Sorts.selectionSort(data); Sorts.selectionSort(sorted); Sorts.selectionSort(reverse);
      } else if (test.equals("insertion")) {
        Sorts.insertionSort(data); Sorts.insertionSort(sorted); Sorts.insertionSort(reverse);
      }
      if (Arrays.equals(data, ans) && Arrays.equals(sorted, ans) && Arrays.equals(reverse, ans)) {
        System.out.println("good job!");
      } else {
        System.out.println("HA nope");
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(reverse));
      }
    }
  }
}
