class Login{
    public String loginUser(String user, String pass) {
        if(user=="Ajay"& pass=="password"){
            System.out.println("Welcome Ajay");
        }
        else{
            System.out.println("wrong password Try again");
        }

        return user;
    }
}
public class DataAssignment1Q6 {
    public static void main(String[] args) {
        Login obj=new Login();
        obj.loginUser("Aja","passs");
        obj.loginUser("Ajay","password");
    }
}
