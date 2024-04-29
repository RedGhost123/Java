package HashMap;

import java.util.HashMap;
import java.util.Map;

public class BasicHAsh {
    public static void main(String[] args) {
         HashMap<String,Integer> hs = new HashMap<>();

        // adding key and value
        hs.put("Akash",25);
        hs.put("Aman",23);
        hs.put("Anand",32);
        hs.put("Ambar",45);
        System.out.println(hs.get("Anand"));

        // Updating value
        hs.put("Anand",26);
        System.out.println(hs.get("Anand"));
        System.out.println(hs.size());

        // Removing key
        hs.remove("Anand");
        System.out.println(hs.remove("Ambar"));
        System.out.println(hs.get("Ambar"));
        System.out.println(hs.get("Anand"));

        // checking were key is present or not
        System.out.println(hs.containsValue("Anand"));
        System.out.println(hs.containsKey("Akash"));
        hs.remove("Akash");
        System.out.println(hs.get("Akash"));

        // Adding a new Entry if key doesn't exist
        hs.putIfAbsent("Akash",23);
        hs.putIfAbsent("Anand",27);
        System.out.println(hs.get("Akash"));
        System.out.println(hs.get("Anand"));

        // Getting all the keys
        System.out.println(hs.keySet());

        // Getting all the values
        System.out.println(hs.values());

        // Getting all the key&Values
        System.out.println(hs.entrySet());

        // traversing all the hashmap througe keyset --1
        for (String key: hs.keySet()) {
            System.out.printf("Age of %s is %d.\n",key,hs.get(key));
        }

        System.out.println();

        // traversing through EntrySet
        for (Map.Entry<String, Integer> e: hs.entrySet()) {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

        // traversing all hashmap -- 3
        // upgrade jdk 10 for running this features

//        for (var e : hs.entrySet()) {
//            System.out.println("Age of %s is %d\n",e.getkey(),e.getValue());
//        }

    }
}
