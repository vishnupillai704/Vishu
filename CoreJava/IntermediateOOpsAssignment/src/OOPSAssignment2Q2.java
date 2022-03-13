import java.util.ArrayList;

public class OOPSAssignment2Q2 {
    int salary=10000;
    int total=0;
    public int getSalary(int salary){

        return 0;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        System.out.println(employeeSalaries);
        return total;
    }

    static class Manager extends OOPSAssignment2Q2{
        ArrayList<Integer>pa=new ArrayList<>();

        @Override
        public int getSalary(int salary){
            int Incentive=5000;
            salary=salary+Incentive;
            pa.add(salary);
            return 0;
        }

    }
    static class Labour extends OOPSAssignment2Q2{
        ArrayList<Integer>p=new ArrayList<>();

        @Override
        public int getSalary(int salary){
            int overtime=500;
            salary=salary+overtime;
            p.add(salary);
            return 0;
        }
    }

    public static void main(String[] args) {
        Labour obj1=new Labour();
        Manager obj2=new Manager();

        OOPSAssignment2Q2 obj=new OOPSAssignment2Q2();
        obj1.getSalary(70);
        obj1.getSalary(80);
        obj2.getSalary(90);
        obj2.getSalary(80);
        ArrayList<Integer> labou=obj1.p;
        ArrayList<Integer> Manage=obj2.pa;
        obj.totalEmployeesSalary(labou);
        obj.totalEmployeesSalary(Manage);

    }
}
