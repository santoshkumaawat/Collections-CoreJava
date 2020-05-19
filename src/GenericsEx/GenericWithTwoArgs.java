package GenericsEx;

public class GenericWithTwoArgs<S, K> {

    public static void main(String args[]) {
        //GTest<String,Integer> ob=new GTest<>();
        //GTest<Integer,Double> ob=new GTest<>();
        GenericWithTwoArgs<String, Object> ob = new GenericWithTwoArgs<>();
    }

    public void one(S p1, K p2) {
    }

    public void two(K p1, S p2) {
    }

    public void three(S p1, S p2) {
    }

    public void four(K p1, K p2) {
    }
}
