public class StringRotation {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        if (areRotations(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }

    static boolean areRotations(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
    }
}
