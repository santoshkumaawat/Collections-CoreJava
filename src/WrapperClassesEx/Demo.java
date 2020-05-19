package WrapperClassesEx;



public class Demo {

    public static void square(int i) {
        System.out.println(i + i);
    }

    public static void show(Object ob) {
        System.out.println(ob);
    }

    public static void main(String args[]) {
        show("hello java");
        show(10);
        show(4.5);
        
        //manual boxing
        Integer ob = new Integer(5);
        square(ob);
        
        square(10);
    }
}
