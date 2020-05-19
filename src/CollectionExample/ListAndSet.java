package CollectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListAndSet {

    public static void main(String[] args) {
        String s1 = "Indore", s2 = "Mandsaur", s3 = "Delhi", s4 = "Chennai", s5 = "Mumbai";

        //ArrayList<String> city = new ArrayList();
        //HashSet<String> city = new HashSet<>();
        //LinkedHashSet<String> city = new LinkedHashSet<>();
        TreeSet<String> city = new TreeSet<>();
        city.add(s1);
        city.add(s2);
        city.add(s3);
        city.add(s4);
        city.add(s5);
        city.add(s4);
        System.out.println(city);
    }
}
