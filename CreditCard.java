//class CreditCard {
//public static void main(String arg[]){
//System.out.println("Hello Fahd");




// 1. Basic Syntax and Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Data Types and Variables
class DataTypes {
    int num = 10;
    double decimal = 10.5;
    char letter = 'A';
    boolean flag = true;
    String text = "Java";
}

// 3. Control Flow
class ControlFlow {
    public void demo(int x) {
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
        } while (j < 5);

        switch (x) {
            case 1: System.out.println("One"); break;
            default: System.out.println("Other");
        }
    }
}

// 4. Arrays
class ArraysDemo {
    public void arrayExample() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

// 5. Methods and Functions
class MethodsDemo {
    public int add(int a, int b) {
        return a + b;
    }
}

// 6. Classes and Objects
class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public void display() {
        System.out.println("Model: " + model);
    }
}

// 7. Inheritance
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

// 8. Polymorphism
class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

// 9. Abstract Class
abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
}

// 10. Interface
interface AnimalInterface {
    void makeSound();
}

class Cat implements AnimalInterface {
    public void makeSound() {
        System.out.println("Meow");
    }
}

// 11. Exception Handling
class ExceptionHandling {
    public void handle() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}

// 12. File Handling
import java.io.*;
class FileHandling {
    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter("file.txt");
        writer.write("Hello, Java!");
        writer.close();
    }
}

// 13. Collections Framework
import java.util.*;
class CollectionsDemo {
    public void listExample() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (String lang : list) {
            System.out.println(lang);
        }
    }
}

// 14. Multi-threading
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

// 15. Lambda Expressions
interface MathOperation {
    int operation(int a, int b);
}

class LambdaExample {
    public void perform() {
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operation(5, 3));
    }
}

// 16. Streams API
import java.util.stream.*;
class StreamsDemo {
    public void streamExample() {
        Stream.of(1, 2, 3, 4, 5)
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
    }
}

// 17. Serialization
import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
}

// 18. Generics
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// 19. JDBC (Java Database Connectivity)
import java.sql.*;
class JDBCDemo {
    public void connect() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
    }
}

// 20. Java 8 Features (Optional)
import java.util.Optional;
class OptionalDemo {
    public void optionalExample() {
        Optional<String> name = Optional.of("Java");
        name.ifPresent(System.out::println);
    }
}
