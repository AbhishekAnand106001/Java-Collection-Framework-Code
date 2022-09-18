import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(90);
        pq.offer(20);
        pq.offer(10);
        pq.offer(50);
        System.out.println(pq);
        
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        
        
        PriorityQueue<Integer> npq = new PriorityQueue<>(Comparator.reverseOrder());
        npq.offer(85);
        npq.offer(15);
        npq.offer(95);
        npq.offer(45);
        System.out.println(npq);
        
        System.out.println(npq.poll());
        System.out.println(npq.peek());
    }
}
      