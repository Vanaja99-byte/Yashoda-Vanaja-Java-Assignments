package core;

interface Jala_01 {
    void oneMethod();
}

class InterfaceOneMethod implements Jala_01 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod if1 = new InterfaceOneMethod();
        //Calling the method implemented
        if1.oneMethod();
    }

}

