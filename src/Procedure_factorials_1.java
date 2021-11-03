import java.util.Scanner;
public class Procedure_factorials_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = in.nextInt();
        System.out.println("The double factorial of X: "+DoubleFactorial(x));
    }
    public static int DoubleFactorial(int x) {
        int ResultOfDoubleFactorialX = 1;
        if(x==0 || x==1) return ResultOfDoubleFactorialX;
        else if ((x % 2) == 0) {
            for (int i = 1; i <= (x / 2); i++) {
                ResultOfDoubleFactorialX = ResultOfDoubleFactorialX * (2 * i);
                if (i == (x / 2)) return ResultOfDoubleFactorialX;
            }
        }

        else {
            for (int i = 1; i <= (x / 2); i++) {
                ResultOfDoubleFactorialX = ResultOfDoubleFactorialX * (3 * i);
                if (i == (x / 2)) return ResultOfDoubleFactorialX;
            }
        }
        return 0;
    }
}