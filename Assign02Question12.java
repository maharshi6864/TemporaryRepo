import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Assign02Question12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> listll = new ArrayList<>();
    listll.add(112);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("Enter elements : ");
    for (int i = 0; i < 5; i++) {
      list.add(sc.nextInt());
    }
    System.out.println(list);
    // list.remove(2);
    // System.out.println(list);
    // list.set(3, 9990);
    list.sort(Collections.reverseOrder());
    System.out.println(list);
    // System.out.println(list.get(0));
  }
}
