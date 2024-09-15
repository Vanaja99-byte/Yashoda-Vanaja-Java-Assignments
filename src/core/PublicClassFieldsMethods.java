package core;
//class with public fields and method
class PublicClass_04 {
    //public fields
    public String pName = "Public";

    //public method
    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}
public class PublicClassFieldsMethods {
    public static void main(String[] args) {
        //Creating object of PublicClass_04.
        PublicClass_04 pub = new PublicClass_04();
        //Accessing public fields
        pub.pName = "Public Method";
        //Accessing public method
        pub.publicMethod();
    }
}

