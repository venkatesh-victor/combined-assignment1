public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 99;

        if(true) {
            int b = 10;
        }

        System.out.println("Local variable a: " + a);


     // System.out.println("If scope variable b " + b); <-- This wrong this code generates the following error.

     /* 
        LocalVariableDemo.java:12: error: cannot find symbol
        System.out.println("If scope variable b " + b);
                                                    ^  
        symbol:   variable b
        location: class LocalVariableDemo
        1 error
     */
    }
}