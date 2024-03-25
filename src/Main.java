import company.Employee;
import company.Staff;
import world.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        testPerson();
//        testEmployee();
        testStaff();
    }

    static void testPerson() {
        try {
            Person p = new Person(null);
        } catch (Exception e) {
            System.out.println("new Person with null String");
        }
        Person p = new Person("John");
        System.out.println("Person: " + p);
        System.out.println("Name: " + p.getName());
        p.setName("Abigel");
        System.out.println("Name: " + p.getName());
        Person p2 = new Person("Somsak");
        System.out.println("p2: " + p2);
        System.out.println("p == p2" + " " + (p == p2));
        System.out.println("p.equal(p2) ? " + p.equals(p2));
    }

    static void testEmployee() {
        try {
            Employee e = new Employee(-1, "John", -1.1);
        } catch (Exception e) {
            System.out.println("new Employee with lower than zero id");
        }
        Employee e = new Employee(1, "John", 1500.00);
        Person p = new Employee(4, "Somchai", 10000.00); // substitutability
        System.out.println("Employee:" + e);
        System.out.println("ID: " + e.getId());
        e.setId(2);
        System.out.println("ID: " + e.getId());
        Employee e2 = new Employee(3, "Jonathan", 1150.20);
        System.out.println("e2: " + e2);
        System.out.println("e == e2" + " " + (e == e2));
        System.out.println("e.equal(e2) ? " + e.equals(e2));
    }

    static void testStaff() {
        Staff s = new Staff(555, "Sompong", 15000.00, 30);
        System.out.println("Staff: " + s);

    }
}