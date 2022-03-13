import java.util.Scanner;
public class ExceptionAssignment {
    public static void main(String[] args) {
        try {

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your first Number");
            int a= scan.nextInt();
            System.out.println("Enter your Second number");
            int b= scan.nextInt();
            int c=a/b;
            System.out.println(c);
        } catch ( ArithmeticException e) {
            e.printStackTrace();
            System.out.println("invalid number entered");
        }
        System.out.println("you have entered zero");

    }
}
