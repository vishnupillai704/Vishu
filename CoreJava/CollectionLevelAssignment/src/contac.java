public class contac {
    private Object Contact;
    private String Name;
    private String Email;
    private String Gender;
    public contac(String Name,String Email,String Gender){
      this.Name=Name;
      this.Email=Email;
      this.Gender=Gender;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String toString(){
        return "contac[Name="+Name+",Email="+Email+",gender="+Gender+"]";
    }
}
