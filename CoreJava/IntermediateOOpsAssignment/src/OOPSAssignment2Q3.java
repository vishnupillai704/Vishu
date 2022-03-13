import java.util.ArrayList;

public class OOPSAssignment2Q3 {
    public int getCash(){

    return 0;
}
    public int totalCashInBank(ArrayList<Integer> cash){
        System.out.println(cash);
        return 0;
    }
    static class CurrentAccount extends OOPSAssignment2Q3 {
    ArrayList<Integer>ob=new ArrayList<>();
    int totalDeposits = 10000;
        int creditLimit = 2000;
        @Override
        public int getCash() {
            int cash=totalDeposits+creditLimit;
            ob.add(cash);
            return cash;
        }

    }
    static class SavingsAccount extends OOPSAssignment2Q3 {
         ArrayList<Integer>obl=new ArrayList<>();
        int totalDeposits = 10000;
        int fixedDepositAmount = 5000;
        @Override
        public int getCash() {
            int cash=totalDeposits+fixedDepositAmount;
            obl.add(cash);
            return cash;
        }
    }

    public static void main(String[] args) {
        CurrentAccount obj=new CurrentAccount();
        SavingsAccount obj1=new SavingsAccount();
        OOPSAssignment2Q3 obj2=new OOPSAssignment2Q3();
        obj.getCash();
        obj1.getCash();
        ArrayList<Integer>Cas=obj.ob;
        ArrayList<Integer>ca=obj1.obl;
        obj2.totalCashInBank(Cas);
        obj2.totalCashInBank(ca);
    }
}




