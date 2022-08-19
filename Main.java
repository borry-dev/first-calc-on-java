import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String operation;
        double a, b;

        System.out.print("Select an operation(+, -, *, /): ");
        operation = in.nextLine();

        System.out.print("Enter the 1st number: ");
        a = in.nextDouble();

        System.out.print("Enter the 2nd number: ");
        b = in.nextDouble();

        switch (operation){
            case "+":
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case "-":
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case "*":
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case "/":
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            default:
                System.out.println("Wrong operation selected");
        }

        in.close();
    }
}