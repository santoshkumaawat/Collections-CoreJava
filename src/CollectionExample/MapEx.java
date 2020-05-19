package CollectionExample;

import java.util.HashMap;

public class MapEx {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();
        hm.put(1001, "Indore");
        hm.put(1002, "Bhopal");
        hm.put(1003, "Mandsaur");
        hm.put(1001, "Delhi");//override the first value because duplicacy is not allowed in map.
        String s = hm.get(1001);
        System.out.println(s);
    }
}
