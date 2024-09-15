package core;


public class Variables {
        int a = 11;
        void localVariable() {
            //Local variables are declared in methods, constructors, or blocks.
            int a = 22;
            System.out.println("Local variable a : " + a);
        }

        public static void main(String[] args) {
            Variables obj = new Variables();
            System.out.println("Instance variable a : " + obj.a);

            obj.localVariable();
        }
}
