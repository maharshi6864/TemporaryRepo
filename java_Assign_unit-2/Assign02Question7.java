import java.util.Scanner;

public class Assign02Question7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numberOfMarks;
    System.out.println("Enter number of marks : ");
    numberOfMarks = sc.nextInt();
    int[] marks = new int[numberOfMarks];

    System.out.println("Enter marks : ");
    for (int i = 0; i < marks.length; i++) {
      marks[i] = sc.nextInt();
    }

    System.out.println("Displaying marks : ");
    for (int i : marks) {
      System.out.println(i);
    }
  }
}
