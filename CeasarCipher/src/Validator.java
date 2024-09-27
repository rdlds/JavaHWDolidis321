import java.nio.file.Files;
import java.nio.file.Paths;


public class Validator {
    // Проверка, что сдвиг является корректным числом
    public static boolean isValidShift(int shift) {
        return shift >= 0 && shift <= 25;
    }

    // Проверка существования файла
    public static boolean fileExists(String filePath) {
        return Files.exists(Paths.get(filePath));
    }
}

