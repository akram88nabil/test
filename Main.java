
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        String op;

        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter the first number");
        a = numbers.nextInt();

        System.out.println("Enter the second number");
        b = numbers.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.println("Enter operation");
        op = operation.next();

        switch(op) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "_":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                System.out.println(a + " / " + b + " = " + (a / b));
                break;

        }
    }
}