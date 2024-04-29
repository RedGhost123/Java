package Priority_Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Find_LArgest {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        int k = 3;
        ls.add(3);
        ls.add(7);
        ls.add(2);
        ls.add(9);
        ls.add(5);
        List<Integer> arr = new ArrayList<>(ls);
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr.get(k - 1));

        // Bettter Approach

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.size(); i++) {
            if (pq.size() == k) {
                if (pq.peek() < arr.get(i)) {
                    pq.poll();
                    pq.add(arr.get(i));
                }else {
                    continue;
                }
            }
            pq.add(arr.get(i));
        }
        System.out.println(pq.peek());
    }
}
