package HashMap;
import java.util.HashMap;
import java.util.Map;

public class Find_frequent_question {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] arr = {2, 2, 3, 4, 5, 6, 2, 3, 4, 5, 2, 3, 4, 5, 6, 2, 3, 4, 4};
        for (int el: arr) {
            if (!mp.containsKey(el)){
                mp.put(el,1);
            }else {
                mp.put(el,mp.get(el)+1);
            }
        }
        System.out.println(mp.entrySet());
        int maxfreq = -1;
        int anskey = 0;
        for (Map.Entry<Integer,Integer> e:mp.entrySet()
             ) {
            if (e.getValue()> maxfreq){
            maxfreq = e.getValue();
            anskey = e.getKey();
              }
        }
        System.out.printf("[ %d has maximum frquency and it accurs %d times ]\n",anskey,maxfreq);
    }

}
