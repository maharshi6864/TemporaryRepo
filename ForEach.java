import java.util.ArrayList;

public class ForEach {
  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println(arr);

    arr.add(56);
    arr.add(67);
    arr.add(1);
    arr.add(22);
    arr.add(33);
    arr.add(1);

    System.out.println(arr);
    // arr.sort(null);
    // System.out.println(arr);
    // arr.sort(Collections.reverseOrder());
    // System.out.println(arr);
    System.out.println(arr.indexOf(1));
    System.out.println(arr.lastIndexOf(1));
  }
}
