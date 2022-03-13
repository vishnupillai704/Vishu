import java.util.ArrayList;
import java.util.Arrays;
 class orders {
     private int totalPrice;
     private String status;

     public int getTotalPrice() {

         return totalPrice;
     }

     public void setTotalPrice(int totalPrice) {
         this.totalPrice = totalPrice;
     }

     public String getStatus() {

         return status;
     }

     public void setStatus(String status) {

         this.status = status;
     }
      public orders(Integer totalPrice,String status) {
          this.status = status;
          this.totalPrice = totalPrice;

      }


     @Override
     public String toString() {
         return "orders{" +
                 "totalPrice=" + totalPrice +
                 ", status='" + status + '\'' +
                 '}';

     }

 }
 public class Assignment4Q2 {


     public static void main(String[] args) {
         ArrayList<orders> Orders1 = new ArrayList<>(Arrays.asList(
                 new orders(112000, "COMPLETED"),
                 new orders(30000, "COMPLETED"),
                 new orders(5000, "ACCEPTED"),
                 new orders(5000, "ACCEPTED"),
                 new orders(110000, "NOT ACCEPTED")));
         Orders1.stream().filter(t->t.getTotalPrice()>10000).filter(t->t.getStatus().equals("COMPLETED")||t.getStatus().equals("ACCEPTED")).forEach(t-> System.out.println(t));


    }
 }
