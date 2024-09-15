package core;

//class with default fields and methods
class DefaultClass_02 {
    //Default fields
    int myAge;
    String myName;

    //Default method
    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

public class DefaultClassFieldsMethod {

    //Accessing default fields and method from other class in the same package
        public static void main(String[] args) {
            //Creating object of DefaultClass_02.
            DefaultClass_02 obj = new DefaultClass_02();
            //Accessing default fields
            obj.myAge =23;
            obj.myName = "viswa";
            //calling default method
            obj.defaultMethod();
        }

    }

