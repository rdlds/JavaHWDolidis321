import java.util.Scanner;
public static void main(String[] args) {
    //Для выполнения определенного номера задачи ее нужно раскомментить
    task1();
    //task2();
    //task3();
    //task4();
    //task5();
    //task6();
    //task7();
    //task8();
    //task9();
    //task10();
    //task11();
    //task12();
    //task13();
    //task14();
    //task15();
    //task16();
    //task17();
    //task18();
    //task19();
    //task20();
}

    public static void task1() {
        // 1. Функция для нахождения максимума
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == b) {
            throw new IllegalArgumentException("Числа равны.");
        }
        int max = Math.max(a, b);
        System.out.println("Максимальное число: " + max);
    }

    public static void task2() {
        // 2. Калькулятор деления
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите делимое и делитель:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        System.out.println("Результат деления: " + (a / b));
    }

    public static void task3() {
        // 3. Конвертер строк в числа
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scan.next();
        try {
            int number = Integer.parseInt(str);
            System.out.println("Конвертированное число: " + number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не может быть конвертирована в число.");
        }
    }

    public static void task4() {
        // 4. Проверка возраста
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scan.nextInt();
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150.");
        }
        System.out.println("Возраст: " + age);
    }

    public static void task5() {
        // 5. Нахождение корня
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        double number = scan.nextDouble();
        if (number < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа не существует.");
        }
        System.out.println("Корень из числа: " + Math.sqrt(number));
    }

    public static void task6() {
        // 6. Факториал
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + number + " = " + factorial);
    }

    public static void task7() {
        // 7. Проверка массива на нули
        int[] array = {1, 2, 3, 0, 5};  // Пример массива
        for (int i : array) {
            if (i == 0) {
                throw new IllegalArgumentException("Массив содержит нуль.");
            }
        }
        System.out.println("Массив не содержит нулей.");
    }

    public static void task8() {
        // 8. Калькулятор возведения в степень
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число и степень:");
        double base = scan.nextDouble();
        int exponent = scan.nextInt();
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }
        System.out.println("Результат: " + Math.pow(base, exponent));
    }

    public static void task9() {
        // 9. Обрезка строки
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку и количество символов:");
        String str = scan.next();
        int length = scan.nextInt();
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки.");
        }
        System.out.println("Обрезанная строка: " + str.substring(0, length));
    }

    public static void task10() {
        // 10. Поиск элемента в массиве
        int[] array = {1, 2, 3, 4, 5};  // Пример массива
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элемент для поиска:");
        int element = scan.nextInt();
        boolean found = false;
        for (int i : array) {
            if (i == element) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Элемент не найден в массиве.");
        }
        System.out.println("Элемент найден в массиве.");
    }

    public static void task11() {
        // 11. Конвертация в двоичную систему
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        System.out.println("Двоичная строка: " + Integer.toBinaryString(number));
    }

    public static void task12() {
        // 12. Проверка делимости
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите делимое и делитель:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num2 == 0) {
            throw new ArithmeticException("Число не может делиться на ноль.");
        }
        if (num1 % num2 == 0) {
            System.out.println("Число делится.");
        } else {
            System.out.println("Число не делится.");
        }
    }

    public static void task13() {
        // 13. Чтение элемента списка
        int[] array = {10, 20, 30, 40, 50};  // Пример массива
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите индекс:");
        int index = scan.nextInt();
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива.");
        }
        System.out.println("Элемент на индексе " + index + ": " + array[index]);
    }

    public static void task14() {
        // 14. Парольная проверка
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scan.next();
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком слабый.");
        }
        System.out.println("Пароль достаточно сложный.");
    }

    public static void task15() {
        // 15. Проверка даты
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String dateStr = scan.next();
        if (!dateStr.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Некорректный формат даты.");
        }
        System.out.println("Дата введена корректно.");
    }

    public static void task16() {
        // 16. Конкатенация строк
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = scan.next();
        System.out.println("Введите вторую строку:");
        String str2 = scan.next();
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null.");
        }
        System.out.println("Результат конкатенации: " + str1 + str2);
    }

    public static void task17() {
        // 17. Остаток от деления
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите делимое и делитель:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num2 == 0) {
            throw new ArithmeticException("Число не может делиться на ноль.");
        }
        System.out.println("Остаток от деления: " + (num1 % num2));
    }

    public static void task18() {
        // 18. Квадратный корень
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        double number = scan.nextDouble();
        if (number < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа не существует.");
        }
        System.out.println("Квадратный корень: " + Math.sqrt(number));
    }

    public static void task19() {
        // 19. Конвертер температуры
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсиях:");
        double celsius = scan.nextDouble();
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля невозможна.");
        }
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }

    public static void task20() {
        // 20. Проверка строки на пустоту
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scan.next();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста или равна null.");
        }
        System.out.println("Строка не пуста.");
    }



