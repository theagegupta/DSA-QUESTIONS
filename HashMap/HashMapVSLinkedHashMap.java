import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;

public class HashMapVSLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hml = new LinkedHashMap<>();
        HashMap<String, Integer> hm = new HashMap<>();
        TreeMap<String, Integer> ts = new TreeMap<>();

        hm.put("Sunday", 7);
        hml.put("Sunday", 7);
        ts.put("Sunday", 7);

        hm.put("Monday", 1);
        hml.put("Monday", 1);
        ts.put("Monday", 1);

        hm.put("Tuesday", 2);
        hml.put("Tuesday", 2);
        ts.put("Tuesday", 2);

        hm.put("Wednesday", 3);
        hml.put("Wednesday", 3);
        ts.put("Wednesday", 3);

        hm.put("Thrursday", 4);
        hml.put("Thrursday", 4);
        ts.put("Thrursday", 4);

        hm.put("Friday", 5);
        hml.put("Friday", 5);
        ts.put("Friday", 5);

        hm.put("Saturday", 6);
        hml.put("Saturday", 6);
        ts.put("Saturday", 6);

        System.out.println(hm);
        System.out.println(hml);
        System.out.println(ts);


        System.out.println(hm.keySet());
        System.out.println(hml.keySet());
        System.out.println(ts.keySet());
 
    }
}
