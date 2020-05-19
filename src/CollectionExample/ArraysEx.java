package CollectionExample;

import java.util.Arrays;

public class ArraysEx {

    public static void main(String[] args) {
        String cities[] = {"Indore", "Chennai", "Bhopal", "Mandsaur", "Ratlam", "Agra"};

        Arrays.sort(cities);

        for (String city : cities) {
            System.out.println(city);
        }

        int idx = Arrays.binarySearch(cities, "Mandsaur");
        System.out.println("Index of Mandsaur : " + idx);
    }
}
