package CollectionExample;

import java.util.HashSet;

public class StudentData {

    public static void main(String[] args) {
        Student s1 = new Student(1000, "Rajiv", "MCA", 1);
        Student s2 = new Student(1001, "Sanjay", "Mech", 2);
        Student s3 = new Student(1000, "Rajiv", "MCA", 1);
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
