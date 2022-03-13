abstract class Persistence{
    abstract public String persist();

}
class FilePersistence extends Persistence{
    @Override
    public String persist() {

        return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {

        return "DatabasePersistence";
    }
public static class OOPSAssignment2Q6 {
    public static void main(String[] args) {
        OOPSAssignment2Q6 obj=new OOPSAssignment2Q6();
    }
}
}
