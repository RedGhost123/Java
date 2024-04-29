package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gredy_Que1 {
    public static class items{
        int weight;
        int price;

        public String toString(){
            return price+" "+weight;
        }
    }
    public static class ItemComparator implements Comparator<items> {
        // override
        public int compare(items i1, items i2) {
            int itemsvalue_1 = i1.price / i1.weight;
            int itemsvalue_2 = i2.weight / i2.weight;

            if (itemsvalue_1 < itemsvalue_2) {
                return -1;
            } else if (itemsvalue_2<itemsvalue_1) {
                return 1;
            }else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> weight = new ArrayList<>();
        List<Integer> price = new ArrayList<>();
        List<items> itemlist = new ArrayList<>();

        price.add(60);
        price.add(100);
        price.add(150);
        price.add(120);
        weight.add(10);
        weight.add(20);
        weight.add(50);
        weight.add(15);
        for (int i = 0; i < price.size();i++){
            items item = new items();
            item.price = price.get(i);
            item.weight = weight.get(i);
            itemlist.add(item);
        }
        itemlist.sort(new ItemComparator());
        System.out.println(itemlist);
        int W = 30;
        int profit = 0;
        for (int i = 0; i< itemlist.size() && W >0;i++){
            items item = itemlist.get(i);
            if (item.weight <= W){
                profit += item.price;
                W -= item.weight;
            }else {
                profit += item.weight/item.price * W;
                W = 0;
            }
        }
        System.out.println(profit);
    }
}
///////////////=================---------------RECHECK
