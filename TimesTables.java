import java.util.Scanner;
public class TimesTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the number you want to go up to?");
        int m = scanner.nextInt();
        for (int i = 1; i < m +1; i++){
            for (int j = 1; j < m +1; j++){
                int r = i*j;
                if(r > 0 && r < 10){
                    System.out.print(r + "      ");
                }
                else if(r >=10 && r < 100){
                    System.out.print(r + "     ");
                }
                else if(r >=100 && r < 1000){
                    System.out.print(r + "    ");
                }
                 else if(r >=1000 && r < 10000){
                    System.out.print(r + "   ");
                }
                 else if(r >=10000 && r < 100000){
                    System.out.print(r + "  ");
                }
                 else if(r >=100000 && r < 1000000){
                    System.out.print(r + " ");
                }

            } System.out.println();
        }
    }
}
