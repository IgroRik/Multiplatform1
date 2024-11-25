import textencryptor.TextEncryptionUtils;

public class Main {
    public static void main(String[] args) {
        // Example usage of the library
        String originalText = "Hello, World!";
        int caesarShift = 3;
        char xorKey = 'K';

        // Caesar Cipher
        String caesarEncrypted = TextEncryptionUtils.caesarCipher(originalText, caesarShift);
        System.out.println("Caesar Cipher Encrypted: " + caesarEncrypted);

        // Base64 Encoding
        String base64Encrypted = TextEncryptionUtils.base64Encrypt(originalText);
        System.out.println("Base64 Encrypted: " + base64Encrypted);
        String base64Decrypted = TextEncryptionUtils.base64Decrypt(base64Encrypted);
        System.out.println("Base64 Decrypted: " + base64Decrypted);

        // XOR Encryption
        String xorEncrypted = TextEncryptionUtils.xorEncrypt(originalText, xorKey);
        System.out.println("XOR Encrypted: " + xorEncrypted);
        String xorDecrypted = TextEncryptionUtils.xorEncrypt(xorEncrypted, xorKey);
        System.out.println("XOR Decrypted: " + xorDecrypted);
    }
}