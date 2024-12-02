//JAVA PROGRAM TO PRINT THE PYRAMID PATTERN

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Character: ");
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
                    if (i + j <= row) {
                        System.out.print(" ");
                    } else {
                        System.out.print(ch + " ");
                    }
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }

}
