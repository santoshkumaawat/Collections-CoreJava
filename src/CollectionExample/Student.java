package CollectionExample;

import java.util.Objects;

public class Student {

    private int rno;
    private String name;
    private String branch;
    private int sem;

    public Student(int a, String b, String c, int d) {
        rno = a;
        name = b;
        branch = c;
        sem = d;
    }

    public void show() {
        System.out.println(rno + "," + name + "," + branch + "," + sem);
    }

    @Override
    public String toString() {
        return "Student{" + "Roll No=" + rno + ", Name=" + name + ", Branch=" + branch + ", Sem=" + sem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.rno;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.branch);
        hash = 41 * hash + this.sem;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rno != other.rno) {
            return false;
        }
        if (this.sem != other.sem) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.branch, other.branch)) {
            return false;
        }
        return true;
    }
}
