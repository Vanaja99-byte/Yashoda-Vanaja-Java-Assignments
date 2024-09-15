package core;

public class CallUsingThis {
    int num;
    String name;

    CallUsingThis() {
        //3. Calling argument constructor of current class using this()
        this(21, "prakash");
    }

    CallUsingThis(int num, String name) {
        //1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        CallUsingThis ts1 = new CallUsingThis();
        CallUsingThis ts = new CallUsingThis(16, "jack");
    }

}
