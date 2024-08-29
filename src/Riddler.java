/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        for(int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // Shift uppercase letters by 9, wrapping around using modulo
                decrypted += (char) (((c - 'A' + 9) % 26) + 'A');
            } else if (c >= 'a' && c <= 'z') {
                // Shift lowercase letters by 9, wrapping around using modulo
                decrypted += (char) (((c - 'a' + 9) % 26) + 'a');
            } else {
                // If not a letter, leave the character
                decrypted += c;
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Initialize string to accumulate numbers from the encrypted string
        String num = "";
        // Loop through each character of the encrypted string
        for (int i = 0; i < encrypted.length(); i++) {
            // Get the current char
            char c = encrypted.charAt(i);
            if(c == ' ') {
                // Convert the accumulated number to an integer
                int asciiVal = Integer.parseInt(num);
                // Convert the integer to its corresponding character
                decrypted += (char) asciiVal;
                // Reset the num string to accumulate the next number
                num = "";
            }
            else {
                // If it's not a space, add the character to the num string
                num += c;
            }
        }
        // Return the final decrypted string
        return decrypted;
    }


    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
