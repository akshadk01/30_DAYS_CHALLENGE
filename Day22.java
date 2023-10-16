public class StringToInteger {

    public static void main(String[] args) {
        String numericString = "12345";
        int result = convertToInteger(numericString);
        System.out.println("Converted integer: " + result);
    }

    static int convertToInteger(String numericString) {
        return Integer.parseInt(numericString);
    }
}
