import java.sql.SQLOutput;

import java.util.Scanner;

public class Function_Power_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,B,C,P;

        System.out.println("Enter alternately the A, B, C and P: ");

        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        P = in.nextInt();

        System.out.println("Result:\n- A^P="+Power(A,P)+"\n- B^P="+Power(B,P)+"\n- C^P="+Power(C,P));
    }
    public static int Power(int A, int B){
       int  result = (int) Math.exp(B * Math.log(A));
        if(A <= 0) return 0;
        return result;
    }
}
