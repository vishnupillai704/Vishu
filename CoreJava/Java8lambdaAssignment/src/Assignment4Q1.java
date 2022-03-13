import static java.lang.System.*;

public class Assignment4Q1 {
    @FunctionalInterface
    public interface Addition{
        public void addition(int num1,int num2);
    }
    @FunctionalInterface
    public interface Subtraction{
        public void subtraction(int num1,int num2);
    }
    @FunctionalInterface
    public interface multiplication{
        public void multiplication(int num1,int num2);
    }
    @FunctionalInterface
    public interface Division{
        public void division(int num1,int num2);
    }


    public static void main(String[] args) {
        Addition add=(num1,num2)->{System.out.println(num1+num2);};
        add.addition(13,5);
        Subtraction sub=(num1, num2) ->{System.out.println(num1-num2);};
        sub.subtraction(13,5);
        multiplication mul=(num1, num2)-> {System.out.println(num1*num2);};
        mul.multiplication(13,5);
        Division div=(num1, num2) -> {System.out.println(num1/num2);};
        div.division(13,5);


        }

    }

