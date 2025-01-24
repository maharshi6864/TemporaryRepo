import java.util.Scanner;

public class Assign02Question9 {

  public static void main(String[] args) {

    int[] arr = { 56, 34, 45, 67, 34, 23, 56, 78, 90 };
    Scanner sc = new Scanner(System.in);

    System.out.println("Diplaying array !!");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("Enter element you want to search : ");
    int searchElement = sc.nextInt();
    search(arr, searchElement);
  }

  static void search(int[] arr, int searchElement) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (searchElement == arr[i]) {
        index = i;
        break;
      }
    }

    if (index != -1) {
      System.out.println("Element found on index " + index + " .");
    } else {
      System.out.println("Element not found.");
    }
  }
}
