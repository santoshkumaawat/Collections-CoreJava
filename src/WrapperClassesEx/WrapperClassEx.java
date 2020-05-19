package WrapperClassesEx;



import java.util.Stack;

public class WrapperClassEx {

    public static void main(String[] args) {

        Stack st = new Stack();
        st.push("Santosh");

        //manual boxing of premitive type value to object
        st.push(new Integer(10));  //convert premitive value to object by using wrapper class
        st.push(new Double(2.60)); //convert premitive value to object by using wrapper class

        //auto-boxing of premitive type value to object by java.
        st.push(1000);
        st.push(3.55);
        st.push(true);

        Boolean b1 = (Boolean) st.pop();
        Double d1 = (Double) st.pop();
        Integer i1 = (Integer) st.pop();

        //manual unboxing premitive type value from object
        boolean b2 = b1.booleanValue();
        System.out.println("Manually Unboxing b2= " + b2);
        double d2 = d1.doubleValue();
        System.out.println("Manually Unboxing d2= " + d2);
        int i2 = i1.intValue();
        System.out.println("Manually Unboxing i2= " + i2);

        //auto unboxing by java
        //here we can directly perform operation on b1,d1,i1;
        System.out.println("Auto Unboxing b1= " + b1);
        System.out.println("Auto Unboxing d1= " + d1);
        System.out.println("Auto Unboxing i1= " + i1);

        System.out.println("d1*5 = " + d1 * 5);   //internally java calls doubleValue(); (d1.doubleValue()*5);
        System.out.println("i1*5 = " + i1 + 5);   //internally java calls intValue(); (d1.intValue()+5);  
    }
}
