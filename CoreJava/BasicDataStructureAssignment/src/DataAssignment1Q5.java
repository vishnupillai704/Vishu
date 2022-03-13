class TaxAmount{
    public double calculateTaxAmount(int ctc){
        if(ctc<180000){
            System.out.println("No tax");
        }
        else if(ctc>180001&ctc<300000){
            System.out.println("10 percent tax ="+ctc*10/100);
        }
        else if(ctc>300001&ctc<500000){
            System.out.println("20 percent tax ="+ctc*20/100);
        }
        else if(ctc>500001&ctc<1000000){
            System.out.println("30 percent tax =" +ctc*30/100);
        }
        return 0;
    }
}
public class DataAssignment1Q5 {
    public static void main(String[] args) {
        TaxAmount obj=new TaxAmount();
        obj.calculateTaxAmount(400000);
    }
}
