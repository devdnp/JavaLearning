package DSpracto;

import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int GCD = 1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0&&b%i==0){
                GCD = i;
            }
        }
        int LCM = a*b/GCD;
            System.out.println("GCD and LCM are: "+GCD+" "+LCM);

    }
}
