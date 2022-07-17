package DSpracto;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        int flag = 1;
        int sum = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            String str = sc.next();

            if (!checkNumber(str)) {
                if (str.equals("x") ||str.equals("X")) {
                    flag = 0;
                    System.out.println("Finished!");
                } else System.out.println("Not a number");
            }
            else{
                int i = Integer.parseInt(str);
                System.out.println("You entered: " + i);
                sum += i;
            }
        } while (flag != 0);
        System.out.println("Sum of your inputs is: "+sum);
    }

        private static boolean checkNumber(String str){
            try {
                int n= Integer.parseInt(str);
              }
            catch (Exception e){
                return false;
            }
            return true;
            }
        }

