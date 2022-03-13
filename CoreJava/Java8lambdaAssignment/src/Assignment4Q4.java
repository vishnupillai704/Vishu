import java.util.ArrayList;
import java.util.Collection;

public class Assignment4Q4 {


    public static void main(String[] args) {
        ArrayList<String>employeeList=new ArrayList<>();


        employeeList.add("pvishnu");
        employeeList.add("suraj");
        employeeList.add("shivam");
        employeeList.add("piyush");
        employeeList.removeIf(n -> n.length() % 2 == 0);
        System.out.println(employeeList);




    }




    }