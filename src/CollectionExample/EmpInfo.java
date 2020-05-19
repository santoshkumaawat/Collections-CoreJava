package CollectionExample;

import java.util.HashMap;

public class EmpInfo {

    public static void main(String[] args) {
        Employee e1 = new Employee("E111", "AAAA", "Clerk", 10000);
        Employee e2 = new Employee("E112", "BBBB", "Accountant", 20000);
        Employee e3 = new Employee("E113", "CCCC", "Manager", 30000);
        Employee e4 = new Employee("E114", "DDDD", "Director", 40000);
        Employee e5 = new Employee("E115", "EEEE", "Salesman", 50000);
        Employee e6 = new Employee("E116", "FFFF", "Clerk", 60000);

        HashMap<String, Employee> hm = new HashMap<>();
        hm.put("E111", e1);
        hm.put("E112", e2);
        hm.put("E113", e3);
        hm.put("E114", e4);
        hm.put("E115", e5);
        hm.put("E116", e6);

        Employee emp = hm.get("E112");
        System.out.println(emp);
    }
}
