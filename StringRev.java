public class StringRev {
  public static void main(String[] args) {
    String str = "Hello world";

    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }

    System.out.println();

    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
    }

    System.out.println();
  }
}
