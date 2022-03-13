import java.util.ArrayList;
import java.util.Comparator;

class vish {
    private String name;
    private Integer calories;
    private Integer price;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public vish(String name,Integer calories,Integer price,String color){
        this.name=name;
        this.calories=calories;
        this.price=price;
        this.color=color;
    }
    public String toString(){
        return "vish[name="+name+",calories="+calories+",price="+price+",color="+color+"]";
    }
}



public class Assignment5Q1 {
    public static void main(String[] args) {


        vish obj = new vish("Apple", 102, 85, "red");
        vish obj1 = new vish("Orange", 88, 95, "orange");
        vish obj2 = new vish("Banana", 95, 105, "yellow");
        vish obj3 = new vish( "mango",70,50,"Yellow");
        vish obj4= new vish("Pear",105,30,"Yellow");
        ArrayList<vish> ob = new ArrayList<>();
        ob.add(obj);
        ob.add(obj1);
        ob.add(obj2);
        ob.add(obj3);
        ob.add(obj4);
        ob.stream().filter(t->t.getCalories()<100).sorted(Comparator.comparing(vish::getCalories)).forEach(t->System.out.println("calories greater than 100"+t));//Q1
        ob.stream().forEach(t-> System.out.println(t.getName()+ t.getColor()));//Q2
        ob.stream().filter(t->t.getColor().equals("red")).sorted(Comparator.comparing(vish::getPrice)).forEach(t-> System.out.println("price"+t));//Q3

    }
}