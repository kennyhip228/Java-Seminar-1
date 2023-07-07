import java.util.Scanner;
/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int number = scanner.nextInt();
        int resultTriangleNumber = calculateTriangleNumber(number);
        int resultFactorialNumber = calculateFactorialNumber(number);
        System.out.println("n-ое треугольное число: " + resultTriangleNumber);
        System.out.println("n-ый факториал: " + resultFactorialNumber);
        scanner.close();
    }

    public static int calculateTriangleNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        return sum;
    }

    public static int calculateFactorialNumber(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}