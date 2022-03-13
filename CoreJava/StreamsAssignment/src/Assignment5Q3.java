import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

class Trader{
    private String name;
    private String city;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Trader(String name,String city){
        this.name=name;
        this.city=city;
    }
    public String toString(){

        return "Trader[name="+name+",city="+city+"]";
    }



}


public class Assignment5Q3 {
    public static void main(String[] args) {
        Trader t1 = new Trader("name1", "Bangalore");
        Trader t2 = new Trader("name2", "Pune");
        Trader t3 = new Trader("name3", "Bangalore");
        Trader t4 = new Trader("name4", "Delhi");
        Trader t5= new Trader("name5", "Chennai");

        Trader t6 = new Trader("name6", "Pune");
        Trader t7 = new Trader("name7", "Indore");
        Trader t8 = new Trader("name8", "Delhi");
        Trader t9 = new Trader("name9", "Pune");

        ArrayList<Trader>ob=new ArrayList<>();
        ob.add(t1);
        ob.add(t2);
        ob.add(t3);
        ob.add(t4);
        ob.add(t5);
        ob.add(t6);
        ob.add(t7);
        ob.add(t8);
        ob.add(t9);
        ob.stream().forEach(t-> System.out.println(t.getCity()));
        System.out.println("------------------------------------------------------------");
        ob.stream().filter(t->t.getCity().equals("Pune")).sorted(Comparator.comparing(Trader::getName)).forEach(t-> System.out.println(t));
        System.out.println("--------------------------------------------------------------------------");
        ob.stream().filter(t->t.getName().startsWith("n")).sorted(Comparator.comparing(Trader::getName)).forEach(t-> System.out.println(t.toString()));
        System.out.println("-------------------------------------------------------------------");
        ob.stream().filter(t->t.getCity().equals("Indore")).forEach(t-> System.out.println(t));
    }

}
