package CollectionExample;

import java.util.LinkedList;
import java.util.Stack;

public class StudentList {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Ajay", "CS", 1);
        Student s2 = new Student(112, "Bhuvan", "CS", 2);
        Student s3 = new Student(113, "Chetan", "IT", 3);
        Student s4 = new Student(114, "Dinesh", "IT", 4);
        Student s5 = new Student(115, "Suraj", "CS", 5);

        Stack<Student> stk = new Stack<>();
        stk.push(s1);
        stk.push(s2);
        stk.push(s3);
        stk.push(s4);
        stk.push(s5);

        Student s = stk.pop();
        s.show();

        /*LinkedList<Student> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for (Student st : list) {
            st.show();
        }*/
    }
}
