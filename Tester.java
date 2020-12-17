import java.util.*;
import java.io.*;
public class Tester {
  public static void main(String[] argss) {
    int[] data = {6, 5, 4, 3, 2, 1};
    Sorts.selectionSort(data);
    System.out.println(Arrays.toString(data));
  }
}
