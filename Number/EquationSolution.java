import java.util.Scanner;

public class EquationSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int result = (int)(Math.pow(a,3) +
                3*Math.pow(a,2)*b +
                3*a*Math.pow(b,2) +
                Math.pow(b,3));

        System.out.println("Result: " + result);
    }
}