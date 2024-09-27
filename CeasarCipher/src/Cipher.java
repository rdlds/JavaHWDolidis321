public class Cipher {
    // Метод для шифрования текста
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Проверяем, является ли символ буквой
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                character = (char) ((character - base + shift) % 26 + base);
            }

            result.append(character);
        }

        return result.toString();
    }

    // Метод для дешифрования текста
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}
