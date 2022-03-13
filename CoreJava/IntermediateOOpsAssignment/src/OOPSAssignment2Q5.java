abstract class Shape5 {
    abstract public String draw();
}
class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        System.out.println("rectangle drawn");
        return null;
    }
}
class Line5 extends Shape5{
    @Override
    public String draw() {
        System.out.println("--------------------");
        return null;
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        System.out.println("cube drawn");
        return null;
    }
}

public class OOPSAssignment2Q5 {
    public static void main(String[] args) {
        Rectangle5 obj=new Rectangle5();
        Line5 obj1=new Line5();
        Cube5 obj2=new Cube5();
        obj.draw();
        obj2.draw();
        obj1.draw();
    }


}
