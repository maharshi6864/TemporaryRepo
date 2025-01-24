import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Integer> sc = new Stack<>();

    sc.push(12);// 5
    sc.push(11);// 4
    sc.push(111);// 3

    System.out.println(sc);
    System.out.println(sc.contains(13));
    System.out.println(sc);

  }
}
