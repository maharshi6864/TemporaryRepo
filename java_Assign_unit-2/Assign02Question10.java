public class Assign02Question10 {
  public static void main(String[] args) {
    add(12, 23, 3, 6, 56, 6, 78, 89, 13);
    add(1, 2, 3);
  }

  static void add(int... arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    System.out.println("Sum of all the elements is : " + sum);
  }
}
