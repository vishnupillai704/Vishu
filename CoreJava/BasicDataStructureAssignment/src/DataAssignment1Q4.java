class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        Double a=subject1Marks;
        Double b=subject2Marks;
        Double c=subject3Marks;
        if(a>60||b>60){
            System.out.println("failed");
        }
        else if(c>60){
            System.out.println("failed");
        }
        else if(a+b+c<60){
            System.out.println("failed");
        }
        else if(a+b+c>60){
            System.out.println("passed");
        }
        else if(a+b>60||b+c>60){
            System.out.println("promoted");
        }
        else if(a+c>60){
            System.out.println("promoted");
        }

        return null;
    }

        }
public class DataAssignment1Q4 {
    public static void main(String[] args) {
        ResultDeclaration obj=new ResultDeclaration();
        obj.declareResults(60,89,50);
        obj.declareResults(30,20,2);

    }
}
