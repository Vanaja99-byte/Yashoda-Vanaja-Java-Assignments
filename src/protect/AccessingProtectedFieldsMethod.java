package protect;

import core.ProtectedClassFieldsMethod;

public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod {
    public static void main(String[] args) {
        //Creating object of AccessingProtectedFieldsMethod
        AccessingProtectedFieldsMethod sub = new AccessingProtectedFieldsMethod();
        //Accessing protected field
        sub.name = "Protected Method in SubClass";
        //Accessing protected method
        sub.protectedMethod();
    }
}
