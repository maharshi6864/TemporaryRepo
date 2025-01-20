import java.util.Scanner;

public class Assign02Question4 {
  public static void main(String[] args) {

    int[] arr = { 56, 34, 45, 67, 34, 23, 56, 78, 90 };
    System.out.println("Diplaying Unsorted array !!");
    for (int i = 1; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // Sorting the array in decending order.
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Diplaying sorted array !!");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

  }
}
