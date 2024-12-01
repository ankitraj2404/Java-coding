//Java Program to print the reverse of teh leftangle triangle

import java.util.Scanner;

public class RevLeftStarTriangle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character: ");
            char ch = sc.next().charAt(0);

            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = row; j >= i; j--) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Enter only single character");
        }
    }

}
