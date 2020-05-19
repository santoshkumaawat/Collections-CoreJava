package GenericsEx;

public class GTwo {

    public static void main(String[] args) {
        //this user wants to call showData method for Integer value
        GenericsDemo<Integer> ob1 = new GenericsDemo<>();
        ob1.showData(10);
    }
}
