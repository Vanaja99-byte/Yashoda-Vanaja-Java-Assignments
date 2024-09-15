package core;

class Parent_02_05 {
    String name = "kiran";

    Parent_02_05() {
        System.out.println("This is parent class constructor");
    }
}

//SubClass
class Child_02_05 extends Parent_02_05 {
    String name = "sai";

    Child_02_05() {
        //5. Calling constructor of the parent class using super()
        super();
        System.out.println("This is child class constructor");
    }

    void myMethod() {
        //Printing fields of the parent class using super
        System.out.println("My name is " + super.name);
    }
}

class CallUsingSuper {
    public static void main(String[] args) {
        Child_02_05 c = new Child_02_05();
        c.myMethod();
    }

}
