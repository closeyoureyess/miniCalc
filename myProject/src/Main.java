import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberone;
        int numbertwo;
        String typeOperations;
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите тип операции: ");
            typeOperations = scanner.nextLine();
            if (typeOperations.equals("*")) {
                System.out.println("Введите первое число: ");
                numberone = scanner.nextInt();
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextInt();
                System.out.println(mathOperations.multiplicationMethod(numberone, numbertwo));
            } else if (typeOperations.equals("+")) {
                System.out.println("Введите первое число: ");
                numberone = scanner.nextInt();
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextInt();
                System.out.println(mathOperations.sumMethod(numberone, numbertwo));
            } else if (typeOperations.equals(":")) {
                System.out.println("Введите первое число: ");
                numberone = scanner.nextInt();
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextInt();
                System.out.println(mathOperations.divisionMethod(numberone, numbertwo));
            } else if (typeOperations.equals("-")) {
                System.out.println("Введите первое число: ");
                numberone = scanner.nextInt();
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextInt();
                System.out.println(mathOperations.substractionMethod(numberone, numbertwo));
            }
            break;
        }

    }
}