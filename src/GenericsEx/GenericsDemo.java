package GenericsEx;

public class GenericsDemo<S> {

    S v1, v2;

    public void showData(S p) {
        System.out.println(p);
    }

    public S getData() {
        return null;
    }

    public static void main(String args[]) {
        GenericsDemo<String> ob = new GenericsDemo<>();
        GenericsDemo<Integer> ob2 = new GenericsDemo<>();
    }
}
