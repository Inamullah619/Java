import java.util.*;

public class calculator {
    // Calculator
    static int plus(int x , int y) {
        return x + y;
    }
    static int minus(int x , int y) {
        return x - y;
    }
    static int multiply(int x , int y) {
        return x * y;
    }
    static int divide(int x , int y) {
        return x / y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        
        if (name.equals("plus")) {
            int result = plus(num1, num2);
            System.out.println("Result: " + result);
            
        } else if (name.equals("minus")) {
             int result = minus(num1, num2);
            System.out.println("Result: " + result);
        } else if (name.equals("multiply")) {
            int result = multiply(num1, num2);
            System.out.println("Result: " + result);
        } else if (name.equals("divide")) {
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operation.");
        }
         

    }   
}