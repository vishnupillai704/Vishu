public class DataAssignment1Q1 {
    public static void main(String[] args) {
      DataAssignment1Q1 obj=new DataAssignment1Q1();
      obj.armstrongCheck(154);
    }
        public boolean armstrongCheck ( int num){
            int temp = num;
            int sum = 0;
            int r;
            while (num > 0) {
                r = num % 10;
                sum = sum + (r * r * r);
                num = num / 10;

            }
            if (temp == sum) {
                System.out.println("it is armstrong number");
            } else {
                System.out.println("it is not a armstrong number");
            }
            return false;
        }
    }
