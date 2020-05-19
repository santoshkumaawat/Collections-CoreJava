package GenericsEx;

import java.util.Stack;

public class GStack {

    public static void main(String[] args) {
        Stack<String> ob = new Stack<>();
        ob.push("India");
        ob.push("Australia");
        ob.push("Japan");
        System.out.println(ob);

        String s1 = ob.pop();
        System.out.println(s1);
        String s2 = ob.pop();
        System.out.println(s2);
        String s3 = ob.pop();
        System.out.println(s3);
        System.out.println("String object after calling pop : " + ob);

        Stack<Integer> ob2 = new Stack<>();
        ob2.push(10);
        ob2.push(25);
        ob2.push(85);
        int i = ob2.pop();
        System.out.println(i);

        //Stack<Object> ob3 = new Stack<>();
        Stack ob3 = new Stack();
        ob3.push("Indore");
        ob3.push(10);
        ob3.push(true);
        Boolean b = (Boolean) ob3.pop();
        System.out.println(b);

    }
}
