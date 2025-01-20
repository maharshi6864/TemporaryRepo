import java.util.PriorityQueue;

public class PriorityQue {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(12);
    pq.add(11);
    pq.add(2);
    pq.add(90);
    pq.add(111);
    pq.add(900);

    System.out.println(pq);
    System.out.println(pq.peek());
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
  }
}
