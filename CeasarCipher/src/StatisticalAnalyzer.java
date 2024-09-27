import java.util.HashMap;
import java.util.Map;

public class StatisticalAnalyzer {
    private static final char[] COMMON_LETTERS = {'e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', 'd', 'l', 'c'};

    // Анализ текста и попытка расшифровки
    public static void analyze(String encryptedText) {
        Map<Character, Integer> frequency = calculateFrequency(encryptedText);

        char mostFrequent = findMostFrequentLetter(frequency);
        int estimatedShift = (mostFrequent - 'e' + 26) % 26;

        System.out.println("Предполагаемый сдвиг: " + estimatedShift);
        System.out.println("Расшифрованный текст: " + Cipher.decrypt(encryptedText, estimatedShift));
    }

    private static Map<Character, Integer> calculateFrequency(String text) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }

        return frequency;
    }

    private static char findMostFrequentLetter(Map<Character, Integer> frequency) {
        return frequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse('e');
    }
}
