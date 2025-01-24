import java.util.Scanner;

public class Assign02Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of Elements : ");
    int numberOfElements = sc.nextInt();

    int[] arr = new int[numberOfElements];

    for (int i = 0; i < numberOfElements; i++) {
      System.out.println("Enter element for index " + i + " : ");
      arr[i] = sc.nextInt();
    }

    int min = arr[0];
    for (int i = 1; i < numberOfElements; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }

    System.out.println("Smallest Element is : " + min);
  }
}
