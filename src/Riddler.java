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
                // If not a letter, append the character as is (e.g., spaces or punctuation)
                decrypted += c;
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String num = "";
        for (int i = 0; i < encrypted.length(); i++)
        {
            char c = encrypted.charAt(i);
            if(c == ' ')
            {
                int asciiVal = Integer.parseInt(num);
                decrypted += (char) asciiVal;
                num = "";
            }
            else
            {
                num += c;
            }

        }
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
