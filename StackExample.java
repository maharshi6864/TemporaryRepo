import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    Stack<Integer> sc = new Stack<>();

    sc.push(12);//5
    sc.push(11);//4
    sc.push(111);//3
    sc.push(1211);//2
    sc.push(1234);//1
    System.out.println(sc);
    // System.out.println(sc.pop());
    // System.out.println(sc);
    // System.out.println(sc.peek());
    // System.out.println(sc);
    System.out.println(sc.search(12));
    System.out.println(sc.search(11));
  }
}
