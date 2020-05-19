package CollectionExample;

import java.util.ArrayList;

public class EmpData {

    public static void main(String[] args) {
        ArrayList<Employee> elist = new ArrayList<>();
        elist.add(new Employee("E111", "AAAA", "Clerk", 10000));
        elist.add(new Employee("E112", "BBBB", "Accountant", 20000));
        elist.add(new Employee("E113", "CCCC", "Manager", 30000));
        elist.add(new Employee("E114", "DDDD", "Director", 40000));
        elist.add(new Employee("E115", "EEEE", "Salesman", 50000));
        elist.add(new Employee("E116", "FFFF", "Clerk", 60000));

        String eid = "E113";

        for (int i = 0; i < elist.size(); i++) {
            Employee e = elist.get(i);
            String id = e.getEmpId();
            if (id.equals(eid)) {
                System.out.println(e);
            }
        }
        /*for (Employee e : elist) {
            System.out.println(e);
        }*/
    }
}
