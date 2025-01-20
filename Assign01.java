public class Assign01 {

  public static void main(String[] args) {
    int number = 2;
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }

    if (count == 2) {
      if (number % 2 != 0) {
        System.out.println("Number is prime number and is also odd number.");
      } else {
        System.out.println("Number is prime number.");
      }
    } else {
      System.out.println("Number is not prime number.");
    }
  }
}