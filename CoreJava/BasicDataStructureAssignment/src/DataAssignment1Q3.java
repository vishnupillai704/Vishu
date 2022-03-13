class Sici{

    public Double SimpleInterest(Double PrincipleAmount,Integer Time,Double InterestRate){
        Double P=PrincipleAmount;
        Integer T=Time;
        Double R=InterestRate;
        Double Si=P*R*T/100;
        System.out.println("Simple Interest"+Si);
        return P;
    }
    public Double CompoundInterest(Double PrincipalAmount,Integer Time,Double InterestRate){
        Double P=PrincipalAmount;
        Integer T=Time;
        Double R=InterestRate;
        Double Ci=P*(Math.pow(1+R/100,T))-P;
        System.out.println("CompoundInterest"+Ci);
        return P;
    }
}
public class DataAssignment1Q3 {
    public static void main(String[] args) {
      Sici obj=new Sici();
      obj.SimpleInterest(8000.2,2,2.10);
      obj.CompoundInterest(8000.2,2,2.10);
    }
}
