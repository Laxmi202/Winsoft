//Q4
package winsoft_assignment;

public class Dup {
    public static void main(String[] args) {
        String str = "Telecommunication";
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char)i);
            }
        }
    }
}
