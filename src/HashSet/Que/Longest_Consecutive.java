package HashSet.Que;

import java.util.HashSet;

public class Longest_Consecutive {
   public int lc(int [] nums){
       HashSet<Integer> st = new HashSet<>();
       for (int num: nums) {
           st.add(num);
       }
       int maxlength = 0;
       for (int num: st) {
           if (!st.contains(num-1)){
              int currentsequence = num;
              int currentlength = 1;
              while (st.contains(currentsequence+1)){
                  currentsequence++;
                  currentlength++;
              }
               maxlength = Math.max(maxlength, currentlength);
           }
       }
       return maxlength;
   }
}
