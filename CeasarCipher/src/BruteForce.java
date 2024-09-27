public class BruteForce {
    // Метод для попытки взлома шифра методом перебора
    public static void bruteForce(String encryptedText) {
        for (int shift = 1; shift < 26; shift++) {
            String decrypted = Cipher.decrypt(encryptedText, shift);
            System.out.println("Попытка сдвига " + shift + ": " + decrypted);
        }
    }
}
