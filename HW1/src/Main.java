import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Для выполнения определенного номера задачи ее нужно раскомментить
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();
        // task10();
        // task11();
        // task12();
        // task13();
        // task14();
        // task15();
        // task16();
        // task17();
        // task18();
        // task19();
        // task20();



    }

    // Задача 1: Четное или нечетное число
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    // Задача 2: Минимальное из трех чисел
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Минимальное число: " + min);
    }

    // Задача 3: Таблица умножения на 5
    public static void task3() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }

    // Задача 4: Сумма чисел от 1 до N
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    // Задача 5: Число Фибоначчи
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Первые " + n + " чисел Фибоначчи: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }

    // Задача 6: Проверка простого числа
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }

    // Задача 7: Обратный порядок чисел
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println("Числа от " + n + " до 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    // Задача 8: Сумма четных чисел
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел от " + a + " до " + b + " = " + sum);
    }

    // Задача 9: Реверс строки
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Реверс строки: " + reversed);
    }

    // Задача 10: Количество цифр в числе
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int count = Integer.toString(number).length();
        System.out.println("Количество цифр в числе: " + count);
    }

    // Задача 11: Факториал числа
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + n + " = " + factorial);
    }

    // Задача 12: Сумма цифр числа
    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);
    }

    // Задача 13: Палиндром
    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    // Задача 14: Найти максимальное число в массиве
    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }

    // Задача 15: Сумма всех элементов массива
    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    // Задача 16: Количество положительных и отрицательных чисел
    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int positiveCount = 0, negativeCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);
    }

    // Задача 17: Простые числа в диапазоне
    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Простые числа в диапазоне от " + a + " до " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Задача 18: Подсчет гласных и согласных в строке
    public static void task18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiouаеиоуыэюя".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
    }

    // Задача 19: Перестановка слов в строке
    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        System.out.print("Слова в обратном порядке: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    // Задача 20: Число Армстронга
    public static void task20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int original = number;
        int sum = 0;
        int digits = Integer.toString(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Число является числом Армстронга");
        } else {
            System.out.println("Число не является числом Армстронга");
        }
    }
}
