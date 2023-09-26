public class NumberPrinter {

    public static void printNumbersInRange(int low, int high) {
        for (int i = low; i <= high; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int low = 1;  // Replace with your low number
        int high = 10; // Replace with your high number

        printNumbersInRange(low, high);
    }
}
Explanation:

We create a Java class called NumberPrinter that contains a static method called printNu
