package CollectionExample;

import java.util.LinkedList;
import java.util.Stack;

//Nested Collection With LinkedList In Stack
public class NestedCollectionTwo {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Ajay", "CS", 1);
        Student s2 = new Student(112, "Bhuvan", "CS", 2);
        Student s3 = new Student(113, "Chetan", "IT", 3);
        Student s4 = new Student(114, "Dinesh", "IT", 4);
        Student s5 = new Student(115, "Suraj", "CS", 5);

        LinkedList<Student> csList = new LinkedList<>();
        LinkedList<Student> itList = new LinkedList<>();
        csList.add(s1);
        csList.add(s2);
        csList.add(s5);

        itList.add(s3);
        itList.add(s4);

        Stack<LinkedList<Student>> stk = new Stack<>();
        stk.push(csList);
        stk.push(itList);

        LinkedList<Student> list1 = stk.pop();
        Student st1 = list1.get(0);
        st1.show();
        Student st2 = list1.get(1);
        st2.show();

        LinkedList<Student> list2 = stk.pop();
        Student st3 = list2.get(0);
        st3.show();
        Student st4 = list2.get(1);
        st4.show();
        Student st5 = list2.get(2);
        st5.show();

    }
}
