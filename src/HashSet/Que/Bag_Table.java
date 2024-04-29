package HashSet.Que;

import java.util.HashSet;

public class Bag_Table {
static int bt(int[] bag){
    HashSet<Integer> table = new HashSet<>();
    int max = 0;
    for (int i = 0; i< bag.length;i++){
        if (table.contains(bag[i])){
            table.remove(bag[i]);
        }else {
            table.add(bag[i]);
            max = Math.max(max, table.size());
        }
    }
    return max;
}
    public static void main(String[] args) {
        int [] bag = {1,2,3,4,4,2,1,4,};
        System.out.println(bt(bag));
    }
}
