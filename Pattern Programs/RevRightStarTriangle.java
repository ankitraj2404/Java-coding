//JAVA PROGRAM TO PRINT THE REVERSE OF THE RIGHT-ANGLE TRIANGLE

import java.util.Scanner;

public class RevRightStarTriangle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character: ");
            String input = sc.nextLine();

            System.out.println("Enter the no of rows: ");
            int row = sc.nextInt();

            sc.close();

            if (input.length() != 1) {
                throw new IllegalArgumentException("Please enter only one character");
            }

            char ch = input.charAt(0);
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row; j++) {
                    if (j < i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(ch);
                    }
                }
                System.out.println();
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
