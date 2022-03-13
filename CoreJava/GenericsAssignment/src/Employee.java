import java.util.HashSet;  //generic Q1
import java.util.Set;
public class Employee {


        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }



        public static void main(String[] args) {
            Employee e1 = new Employee("John", 20);
            Employee e2 = new Employee("John", 20);

            HashSet<Employee> employees = new HashSet<>();
            employees.add(e1);
            employees.add(e2);

            System.out.println(employees);
        }
    }
