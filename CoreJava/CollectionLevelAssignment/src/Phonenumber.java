public class Phonenumber implements Comparable<Phonenumber>{
    private Long Number;


    public Phonenumber(Long Number){
        super();
        this.Number = Number;

    }
    public Long getNumber() {

        return Number;
    }

    public void setNumber(Long number) {

        Number = number;
    }
    public String toString(){
        return "Phonenumber [Number="+Number+"]";
    }




    @Override
    public int compareTo(Phonenumber o)
    {

        return o.getNumber().compareTo(this.getNumber());
    }
}
