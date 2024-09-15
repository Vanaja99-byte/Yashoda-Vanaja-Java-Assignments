package core;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 4;
        // Logical AND (&&)
        /* The logical && operator doesn't check the second condition if the
        first condition is false. It checks the second condition only if the first one is true. */
        System.out.println(a > b && a > c); // true  && true  = true
        System.out.println(a < b && a < c); // false && false = false
        System.out.println(a > b && a < c); // true  && false = false

        //Logical OR (||)
        /* The logical || operator doesn't check the second condition if the
        first condition is true.It checks the second condition only if the first one is false. */
        System.out.println(a > b || a > c); // true  || true  = true
        System.out.println(a < b || a < c); // false || false = false
        System.out.println(a < b || a > c); // false || true  = true

        //Logical NOT [!()]
        System.out.println(!(a > b));      // NOT true = false
        System.out.println(!(a < b));      // NOT false = true
    }
}
