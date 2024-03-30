import java.util.Scanner;
import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arithmetic Demo
        System.out.println("Arithmetic:");
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        Arithmetic<Double, Double> arithmetic = new Arithmetic<>(num1, num2);
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());

        // MyMap Demo
        System.out.println("\nMyMap:");
        MyMap<String, Integer> myMap = new MyMap<>();
        System.out.println("Enter key:");
        String key = scanner.next();
        System.out.println("Enter value:");
        int value = scanner.nextInt();
        myMap.put(key, value);
        System.out.println("Enter key to get its value:");
        key = scanner.next();
        Integer retrievedValue = myMap.get(key);
        if (retrievedValue != null) {
            System.out.println("Value corresponding to key " + key + ": " + retrievedValue);
        } else {
            System.out.println("Key " + key + " not found.");
        }
        System.out.println("Enter key to remove from the map:");
        key = scanner.next();
        Integer removedValue = myMap.remove(key);
        if (removedValue != null) {
            System.out.println("Removed value corresponding to key " + key + ": " + removedValue);
        } else {
            System.out.println("Key " + key + " not found.");
        }

        scanner.close();
    }
}
