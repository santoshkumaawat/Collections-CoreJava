package GenericsEx;

public class GOne {

    public static void main(String[] args) {
        //this user wants to call showData method for String value
        GenericsDemo<String> ob = new GenericsDemo<String>();
        ob.showData("abc");
    }
}
