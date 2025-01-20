import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Assign02Question16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> listll = new ArrayList<>();
    listll.add(112);
    listll.add(113);
    listll.add(114);
    listll.add(115);
    listll.add(116);
    listll.add(117);
    System.out.println("ArrayList");
    System.out.println(listll);
    LinkedList<Integer> list = new LinkedList<>();
    System.out.println("Linked List");
    list.add(1);
    list.add(2);
    list.add(113);
    list.add(4);
    list.addAll(listll);
    System.out.println(list);
    list.addFirst(9990);
    System.out.println(list);
    System.out.println(list.lastIndexOf(113));

  }
}
