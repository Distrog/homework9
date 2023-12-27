import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (final int number : arr) {
            sum += number;
        }
        System.out.println("Задача 1");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей\n");

    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (final int number : arr) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Задача 2");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день " +
                "составила " + max + " рублей\n");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        int count = arr.length;
        for (final int number : arr) {
            sum += number;
        }
        float averageNumber = (float) sum / count;
        System.out.println("Задача 3");
        System.out.println("Средняя сумма трат за месяц составила " + averageNumber + " рублей\n");
    }
    public static void task4(){
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("Задача 4");
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}