package CollectionExample;

import java.util.LinkedList;
import java.util.Stack;

//Nested Collection With Stack In Linked List
public class NestedCollectionOne {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Ajay", "CS", 1);
        Student s2 = new Student(112, "Bhuvan", "CS", 2);
        Student s3 = new Student(113, "Chetan", "IT", 3);
        Student s4 = new Student(114, "Dinesh", "IT", 4);
        Student s5 = new Student(115, "Suraj", "CS", 5);

        Stack<Student> csStk = new Stack<>();
        Stack<Student> itStk = new Stack<>();
        csStk.push(s1);
        csStk.push(s2);
        csStk.push(s5);
        
        itStk.push(s3);
        itStk.push(s4);

        LinkedList<Stack<Student>> list = new LinkedList<>();
        list.add(csStk);
        list.add(itStk);

        Stack<Student> stk1 = list.get(0);
        Student st1 = stk1.pop();
        st1.show();
        Student st2 = stk1.pop();
        st2.show();
        Student st3 = stk1.pop();
        st3.show();

        Stack<Student> stk2 = list.get(1);
        Student st4 = stk2.pop();
        st4.show();
        Student st5 = stk2.pop();
        st5.show();
    }
}
