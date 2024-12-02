//JAVA PROGRAM TO PRINT THE REVERSE OF THE LEFT-ANGLE TRIANGLE

import java.util.Scanner;

public class RevLeftStarTriangle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a single character: ");
            String input = sc.next();

            System.out.print("Enter the number of rows: ");
            int row = sc.nextInt();

            sc.close();

            // Check if the input is a single character
            if (input.length() != 1) {
                throw new IllegalArgumentException("Please enter only one character.");
            }

            char ch = input.charAt(0);

            for (int i = 1; i <= row; i++) {
                for (int j = row; j >= i; j--) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }
    }

}
