import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу для обработки:");
        String filePath = scanner.nextLine();

        if (!Validator.fileExists(filePath)) {
            System.out.println("Файл не найден. Проверьте путь и попробуйте снова.");
            return;
        }

        try {
            String text = FileManager.readFromFile(filePath);

            System.out.println("Выберите действие: 1 - Шифрование, 2 - Дешифрование, 3 - Brute Force, 4 - Статистический анализ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите сдвиг:");
                    int shift = scanner.nextInt();

                    if (!Validator.isValidShift(shift)) {
                        System.out.println("Неверный сдвиг. Пожалуйста, введите число от 0 до 25.");
                        return;
                    }

                    String encryptedText = Cipher.encrypt(text, shift);
                    System.out.println("Зашифрованный текст: \n" + encryptedText);
                    FileManager.writeToFile("encrypted.txt", encryptedText);
                    break;

                case 2:
                    System.out.println("Введите сдвиг:");
                    shift = scanner.nextInt();

                    if (!Validator.isValidShift(shift)) {
                        System.out.println("Неверный сдвиг. Пожалуйста, введите число от 0 до 25.");
                        return;
                    }

                    String decryptedText = Cipher.decrypt(text, shift);
                    System.out.println("Расшифрованный текст: \n" + decryptedText);
                    FileManager.writeToFile("decrypted.txt", decryptedText);
                    break;

                case 3:
                    BruteForce.bruteForce(text);
                    break;

                case 4:
                    StatisticalAnalyzer.analyze(text);
                    break;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите от 1 до 4.");
                    break;
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи файла: " + e.getMessage());
        }

        scanner.close();
    }
}