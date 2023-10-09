import java.util.Scanner;

public class IntToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Please enter an integer between 1 and 3999.");
        } else {
            String romanNumeral = convertToRoman(num);
            System.out.println("Roman numeral: " + romanNumeral);
        }

        scanner.close();
    }

    public static String convertToRoman(int num) {
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder result = new StringBuilder();

        for (int i = 12; i >= 0; i--) {
            while (num >= values[i]) {
                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
