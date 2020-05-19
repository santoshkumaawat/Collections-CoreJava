package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

    public static void main(String[] args) {
        ArrayList<String> viruses = new ArrayList<>();
        viruses.add("Ebola");
        viruses.add("Corona");
        viruses.add("SARS-CoV ");
        viruses.add("Hanta");
        viruses.add("HIV");
        System.out.println(viruses);

        Collections.sort(viruses);
        System.out.println(viruses);
    }
}
