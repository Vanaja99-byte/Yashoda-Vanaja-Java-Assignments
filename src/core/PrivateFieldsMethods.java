package core;

public class PrivateFieldsMethods {
    private String name = "hari";
    private int age = 20;

    //private method
    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    //main method
    public static void main(String[] args) {
        PrivateFieldsMethods obj = new PrivateFieldsMethods();
        //Printing the fields in main method
        System.out.println(obj.age);
        System.out.println(obj.name);
        //Calling the private method in main method
        obj.pvtMethod();
    }
}
