import java.util.*;

// Класс для запуска всех задач
public class Main {

    public static void main(String[] args) {
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

    // Задача 1: Класс "Человек"
    public static void task1() {
        Person person = new Person("John", 25, "male");
        person.displayInfo();
        person.increaseAge();
        person.setName("Johnny");
        person.displayInfo();
    }

    static class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void displayInfo() {
            System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender);
        }

        public void increaseAge() {
            age++;
        }

        public void setName(String newName) {
            this.name = newName;
        }
    }

    // Задача 2: Наследование: Класс "Работник" и "Менеджер"
    public static void task2() {
        Manager manager = new Manager("Alice", 30, "female", 5000, new String[]{"Bob", "Charlie"});
        manager.displayInfo();
    }

    static class Worker extends Person {
        protected int salary;

        public Worker(String name, int age, String gender, int salary) {
            super(name, age, gender);
            this.salary = salary;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Зарплата: " + salary);
        }
    }

    static class Manager extends Worker {
        private String[] subordinates;

        public Manager(String name, int age, String gender, int salary, String[] subordinates) {
            super(name, age, gender, salary);
            this.subordinates = subordinates;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Подчиненные: " + Arrays.toString(subordinates));
        }
    }

    // Задача 3: Полиморфизм: Животные
    public static void task3() {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    interface Animal {
        void makeSound();
    }

    static class Dog implements Animal {
        public void makeSound() {
            System.out.println("Собака: Гав!");
        }
    }

    static class Cat implements Animal {
        public void makeSound() {
            System.out.println("Кошка: Мяу!");
        }
    }

    static class Cow implements Animal {
        public void makeSound() {
            System.out.println("Корова: Муу!");
        }
    }

    // Задача 4: Абстрактный класс "Транспорт"
    public static void task4() {
        Transport car = new Car();
        Transport bike = new Bike();
        car.move();
        bike.move();
    }

    abstract static class Transport {
        public abstract void move();
    }

    static class Car extends Transport {
        public void move() {
            System.out.println("Машина едет");
        }
    }

    static class Bike extends Transport {
        public void move() {
            System.out.println("Велосипед едет");
        }
    }

    // Задача 5: Класс "Книга" и "Библиотека"
    public static void task5() {
        Library library = new Library();
        library.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        library.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        library.searchByAuthor("Федор Достоевский");
        library.searchByYear(1869);
    }

    static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void display() {
            System.out.println("Книга: " + title + ", Автор: " + author + ", Год: " + year);
        }
    }

    static class Library {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void searchByAuthor(String author) {
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    book.display();
                }
            }
        }

        public void searchByYear(int year) {
            for (Book book : books) {
                if (book.getYear() == year) {
                    book.display();
                }
            }
        }
    }

    // Задача 6: Инкапсуляция: Банк
    public static void task6() {
        BankAccount account = new BankAccount("12345678", 5000);
        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();
    }

    static class BankAccount {
        private String accountNumber;
        private int balance;

        public BankAccount(String accountNumber, int balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(int amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        public void displayBalance() {
            System.out.println("Баланс: " + balance);
        }
    }

    // Задача 7: Счетчик объектов
    public static void task7() {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }

    static class Counter {
        private static int count = 0;

        public Counter() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }

    // Задача 8: Площадь фигур
    public static void task8() {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }

    abstract static class Shape {
        public abstract double getArea();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }

    // Задача 9: Наследование: Животные и их движения
    public static void task9() {
        AnimalMove[] animals = {new Fish(), new Bird(), new DogMove()};
        for (AnimalMove animal : animals) {
            animal.move();
        }
    }

    static class AnimalMove {
        public void move() {
            System.out.println("Животное движется");
        }
    }

    static class Fish extends AnimalMove {
        @Override
        public void move() {
            System.out.println("Рыба плывет");
        }
    }

    static class Bird extends AnimalMove {
        @Override
        public void move() {
            System.out.println("Птица летит");
        }
    }

    static class DogMove extends AnimalMove {
        @Override
        public void move() {
            System.out.println("Собака бежит");
        }
    }

    // Задача 10: Работа с коллекциями: Университет
    public static void task10() {
        University university = new University();
        university.addStudent(new Student("Alice", "A", 90));
        university.addStudent(new Student("Bob", "B", 75));
        university.sortByName();
        university.filterByGrade(80);
    }

    static class Student {
        private String name;
        private String group;
        private int grade;

        public Student(String name, String group, int grade) {
            this.name = name;
            this.group = group;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public void display() {
            System.out.println("Студент: " + name + ", Группа: " + group + ", Оценка: " + grade);
        }
    }

    static class University {
        private List<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public void sortByName() {
            students.sort(Comparator.comparing(Student::getName));
            for (Student student : students) {
                student.display();
            }
        }

        public void filterByGrade(int threshold) {
            for (Student student : students) {
                if (student.getGrade() >= threshold) {
                    student.display();
                }
            }
        }
    }
    // Задача 11: Класс "Магазин"
    public static void task11() {
        Store store = new Store();
        store.addProduct(new Product("Телевизор", 300, 5));
        store.addProduct(new Product("Холодильник", 500, 2));
        store.displayProducts();
        store.searchProduct("Холодильник");
        store.removeProduct("Телевизор");
        store.displayProducts();
    }

    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void display() {
            System.out.println("Товар: " + name + ", Цена: " + price + ", Количество: " + quantity);
        }
    }

    static class Store {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(String name) {
            products.removeIf(product -> product.getName().equalsIgnoreCase(name));
        }

        public void searchProduct(String name) {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(name)) {
                    product.display();
                }
            }
        }

        public void displayProducts() {
            for (Product product : products) {
                product.display();
            }
        }
    }

    // Задача 12: Интерфейс "Платежная система"
    public static void task12() {
        PaymentSystem payment = new CreditCard();
        payment.pay();
        payment.refund();

        payment = new PayPal();
        payment.pay();
        payment.refund();
    }

    interface PaymentSystem {
        void pay();
        void refund();
    }

    static class CreditCard implements PaymentSystem {
        public void pay() {
            System.out.println("Оплата кредитной картой");
        }

        public void refund() {
            System.out.println("Возврат на кредитную карту");
        }
    }

    static class PayPal implements PaymentSystem {
        public void pay() {
            System.out.println("Оплата через PayPal");
        }

        public void refund() {
            System.out.println("Возврат через PayPal");
        }
    }

    // Задача 13: Генерация уникальных идентификаторов
    public static void task13() {
        UniqueID obj1 = new UniqueID();
        UniqueID obj2 = new UniqueID();
        UniqueID obj3 = new UniqueID();
        System.out.println("ID первого объекта: " + obj1.getID());
        System.out.println("ID второго объекта: " + obj2.getID());
        System.out.println("ID третьего объекта: " + obj3.getID());
    }

    static class UniqueID {
        private static int counter = 0;
        private int id;

        public UniqueID() {
            id = ++counter;
        }

        public int getID() {
            return id;
        }
    }

    // Задача 14: Класс "Точка" и "Прямоугольник"
    public static void task14() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 5);
        RectangleShape rectangle = new RectangleShape(p1, p2);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class RectangleShape {
        private Point topLeft;
        private Point bottomRight;

        public RectangleShape(Point topLeft, Point bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public double getArea() {
            int width = Math.abs(bottomRight.getX() - topLeft.getX());
            int height = Math.abs(bottomRight.getY() - topLeft.getY());
            return width * height;
        }
    }

    // Задача 15: Комплексные числа
    public static void task15() {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber diff = num1.subtract(num2);
        ComplexNumber product = num1.multiply(num2);
        ComplexNumber quotient = num1.divide(num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разница: " + diff);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }

    static class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(real + other.real, imaginary + other.imaginary);
        }

        public ComplexNumber subtract(ComplexNumber other) {
            return new ComplexNumber(real - other.real, imaginary - other.imaginary);
        }

        public ComplexNumber multiply(ComplexNumber other) {
            return new ComplexNumber(real * other.real - imaginary * other.imaginary,
                    real * other.imaginary + imaginary * other.real);
        }

        public ComplexNumber divide(ComplexNumber other) {
            double denominator = other.real * other.real + other.imaginary * other.imaginary;
            return new ComplexNumber((real * other.real + imaginary * other.imaginary) / denominator,
                    (imaginary * other.real - real * other.imaginary) / denominator);
        }

        @Override
        public String toString() {
            return real + " + " + imaginary + "i";
        }
    }

    // Задача 16: Перегрузка операторов: Матрица
    public static void task16() {
        Matrix matrix1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
        Matrix matrix2 = new Matrix(new int[][]{{5, 6}, {7, 8}});
        Matrix sum = matrix1.add(matrix2);
        Matrix product = matrix1.multiply(matrix2);

        System.out.println("Сумма матриц:");
        sum.display();
        System.out.println("Произведение матриц:");
        product.display();
    }

    static class Matrix {
        private int[][] matrix;

        public Matrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public Matrix add(Matrix other) {
            int[][] result = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    result[i][j] = matrix[i][j] + other.matrix[i][j];
                }
            }
            return new Matrix(result);
        }

        public Matrix multiply(Matrix other) {
            int[][] result = new int[matrix.length][other.matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < other.matrix[0].length; j++) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        result[i][j] += matrix[i][k] * other.matrix[k][j];
                    }
                }
            }
            return new Matrix(result);
        }

        public void display() {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    // Задача 17: Создание игры с использованием ООП
    public static void task17() {
        Player player = new Player("Герой", 100);
        Enemy enemy = new Enemy("Дракон", 50);

        Weapon sword = new Weapon("Меч", 10);
        player.attack(enemy, sword);
    }

    static class Player {
        private String name;
        private int health;

        public Player(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public void attack(Enemy enemy, Weapon weapon) {
            System.out.println(name + " атакует " + enemy.getName() + " с помощью " + weapon.getName());
            enemy.takeDamage(weapon.getDamage());
        }
    }

    static class Enemy {
        private String name;
        private int health;

        public Enemy(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public void takeDamage(int damage) {
            health -= damage;
            System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
        }

        public String getName() {
            return name;
        }
    }

    static class Weapon {
        private String name;
        private int damage;

        public Weapon(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }
    }

    // Задача 18: Автоматизированная система заказов
    public static void task18() {
        Customer customer = new Customer("Иван");
        Product prod1 = new Product("Ноутбук", 1000, 1);
        Product prod2 = new Product("Мышка", 50, 2);
        Order order = new Order(customer);
        order.addProduct(prod1);
        order.addProduct(prod2);
        System.out.println("Общая стоимость заказа: " + order.getTotal());
        order.displayOrder();
    }

    static class Order {
        private Customer customer;
        private List<Product> products = new ArrayList<>();

        public Order(Customer customer) {
            this.customer = customer;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public double getTotal() {
            double total = 0;
            for (Product product : products) {
                total += product.price * product.quantity;
            }
            return total;
        }

        public void displayOrder() {
            System.out.println("Заказ для " + customer.getName());
            for (Product product : products) {
                product.display();
            }
        }
    }

    static class Customer {
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Задача 19: Наследование: Электроника
    public static void task19() {
        Device smartphone = new Smartphone("Samsung");
        smartphone.turnOn();
        ((Smartphone) smartphone).takePhoto();
        smartphone.turnOff();

        Device laptop = new Laptop("Dell");
        laptop.turnOn();
        ((Laptop) laptop).compileCode();
        laptop.turnOff();
    }

    static class Device {
        protected String brand;

        public Device(String brand) {
            this.brand = brand;
        }

        public void turnOn() {
            System.out.println(brand + " включен");
        }

        public void turnOff() {
            System.out.println(brand + " выключен");
        }
    }

    static class Smartphone extends Device {
        public Smartphone(String brand) {
            super(brand);
        }

        public void takePhoto() {
            System.out.println(brand + " делает фото");
        }
    }

    static class Laptop extends Device {
        public Laptop(String brand) {
            super(brand);
        }

        public void compileCode() {
            System.out.println(brand + " компилирует код");
        }
    }

    // Задача 20: Игра "Крестики-нолики"
    public static void task20() {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    static class TicTacToe {
        private char[][] board = new char[3][3];
        private char currentPlayer = 'X';

        public TicTacToe() {
            for (int i = 0; i < 3; i++) {
                Arrays.fill(board[i], '-');
            }
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);
            int row, col;
            while (true) {
                displayBoard();
                System.out.println("Игрок " + currentPlayer + ", введите строку (0-2) и колонку (0-2): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (board[row][col] == '-') {
                    board[row][col] = currentPlayer;
                    if (checkWin()) {
                        displayBoard();
                        System.out.println("Игрок " + currentPlayer + " победил!");
                        break;
                    }
                    if (isBoardFull()) {
                        displayBoard();
                        System.out.println("Ничья!");
                        break;
                    }
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Клетка занята, попробуйте снова.");
                }
            }
        }

        private boolean checkWin() {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    return true;
                }
                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                    return true;
                }
            }
            return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
                    || (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
        }

        private boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }

        private void displayBoard() {
            for (char[] row : board) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
