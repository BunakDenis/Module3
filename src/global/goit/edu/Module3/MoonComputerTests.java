import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println(sum + " " + sub + " " + multiply + " " + divide);

        scanner.close();
    }

    public void testLogicalOperators() {

        Scanner scanner = new Scanner(System.in);
        boolean firstValueBoolean = scanner.nextBoolean();
        boolean secondValueBoolean = scanner.nextBoolean();
        boolean thirdValueBoolean = scanner.nextBoolean();
        System.out.println(firstValueBoolean && secondValueBoolean && thirdValueBoolean);
        System.out.println(firstValueBoolean || secondValueBoolean || thirdValueBoolean);
        scanner.close();
    }

    //Test output on true, true, false standard input
    public static void main(String[] args) {
        new MoonComputerTests().testLogicalOperators();
    }
}