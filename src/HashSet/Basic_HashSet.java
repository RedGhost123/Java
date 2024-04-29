package HashSet;

import java.util.Collections;
import java.util.HashSet;

public class Basic_HashSet {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        System.out.println(st);
        st.add("Aman");
        st.add("Akash");
        st.add("Anupam");
        st.add("Vicky");
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.add("nikku"));
        System.out.println(st);
        System.out.println(st.remove("nikku"));
        System.out.println(st.remove("Arjun"));
        System.out.println(st);
        System.out.println(st.contains("Aman"));
        System.out.println(st.size());
        st.removeAll(st);
        System.out.println(st);
    }
}
