//JAVA PROGRAM TO PRINT LEFTANGLE TRIANGLE

import java.util.Scanner;

public class LeftStarTriangle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Character: ");
            char ch = sc.next().charAt(0);

            System.out.print("Enter the no of rows: ");
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
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
