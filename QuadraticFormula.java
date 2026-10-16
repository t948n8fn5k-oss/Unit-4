import java.util.Scanner;
public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the value of a? ");
        double a = scanner.nextDouble();
        System.out.print("What is the value of b? ");
        double b = scanner.nextDouble();
        System.out.print("What is the value of c? ");
        double c = scanner.nextDouble();
        double x = Math.pow(b, 2) - 4*a*c;
        double ans1 = 0;
        double ans2 = 0;
        if (x > 0) {
            ans1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/2*a;
            ans2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/2*a;
            System.out.println(ans1);
            System.out.println(ans2);
        }
        else if (x == 0) {
            ans1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/2*a;
            System.out.println(ans1);
        }
        else if (x < 0) {
            System.out.println("No real solution");
        }
        
    }
}
