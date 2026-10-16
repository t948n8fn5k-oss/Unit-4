public class Equations {
    public static void main(String[] args) {
       // x is the changing varible
        int x = 0;
    // y is the answer
       double y = 0;
       //z is when to stop when 2 answers are given
       int z = 0;
       //while statment is checking all the answers
       while (z < 2) {
        x++;
        //calculating the equation
        y = (x - 3) * (x - 8) / (x - 6.0);
        //checking if y is equal to 2 to print, and adding z when a solution is found
        if (y == 2) {
            z++;
            System.out.println(x);
            
            }
        }
    }
}