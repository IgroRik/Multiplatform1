package textencryptor;

import java.util.Base64;

/**
 * A utility class for text encryption using three different methods:
 * - Caesar Cipher
 * - Base64 Encoding
 * - XOR Encryption
 */
public class TextEncryptionUtils {

    /**
     * Encrypts text using the Caesar Cipher method.
     *
     * @param text  the text to be encrypted
     * @param shift the number of positions to shift each letter
     * @return the encrypted text
     */
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * Encrypts text using Base64 encoding.
     *
     * @param text the text to be encoded
     * @return the Base64-encoded string
     */
    public static String base64Encrypt(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    /**
     * Decrypts text encoded in Base64 format.
     *
     * @param encodedText the Base64-encoded string
     * @return the decoded original text
     */
    public static String base64Decrypt(String encodedText) {
        return new String(Base64.getDecoder().decode(encodedText));
    }

    /**
     * Encrypts or decrypts text using the XOR operation.
     *
     * @param text the text to be encrypted or decrypted
     * @param key  the encryption key
     * @return the resulting text after XOR operation
     */
    public static String xorEncrypt(String text, char key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            result.append((char) (c ^ key));
        }
        return result.toString();
    }
}
