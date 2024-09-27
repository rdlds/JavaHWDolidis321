import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    // Метод для чтения текста из файла
    public static String readFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    // Метод для записи текста в файл
    public static void writeToFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
