public class DataAssignment1Q2 {
    public static void main(String[] args) {

    }
    public int[] armstrongNumbersInRange(int min , int max){
        for(int i=min;i<max;i++){
            int num=i;
            int sum=0;
            int r;
            while (num>0){
                r=num%10;
                sum=sum+(r*r*r);
                num=num/10;
            }
            if(sum==i){
                System.out.println("it is armstrong number");
            }
            else{
                System.out.println("it is not a armstrong number");
            }
        }
        return new int[0];
    }
}
