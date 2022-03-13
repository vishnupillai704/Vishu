public class StringAssignment {
    public static void main(String[] args) {
        String str = "Hello World";  //Q1
        System.out.println(str.length());


        String str2 = "Hello";//Q2
        String str3 = str2.concat(" How are you?");
        System.out.println(str3);

        String Q3="Java String pool refers to collection of Strings which are stored in heap";//Q3
        System.out.println(Q3.toLowerCase());
        System.out.println(Q3.toUpperCase());
        System.out.println(Q3.replace("a","$"));
        System.out.println(Q3.contains("collection"));
        System.out.println(Q3.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println(Q3.compareTo("java string pool refers to collection of strings which are stored in heap memory"));

        StringBuffer Q4=new StringBuffer("StringBuffer");//string buffer
        Q4.append(" is a peer class of String");
        Q4.append(" that provides much of");
        Q4.append(" the functionality of strings");
        System.out.println(Q4);

        StringBuffer second = new StringBuffer("It is used to _ at the specified index position");
        second.replace(14,15,"insert text");
        System.out.println(second);

        StringBuffer third=new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(third.reverse());

        StringBuilder Q5=new StringBuilder("StringBuffer");//string builder
        Q5.append(" is a peer class of String");
        Q5.append(" that provides much of");
        Q5.append(" the functionality of strings");
        System.out.println(Q5);

        StringBuilder second1 = new StringBuilder("It is used to _ at the specified index position");
        second1.replace(14,15,"insert text");
        System.out.println(second1);

        StringBuilder third1=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(third1.reverse());

    }
}