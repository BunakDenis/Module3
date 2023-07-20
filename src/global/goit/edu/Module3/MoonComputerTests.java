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
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();

        if (firstInt != 0 & secondInt != 0) {

            int sumOfInts = firstInt + secondInt;
            int differentOfInts = firstInt - secondInt;
            int multiplicationOfInts = firstInt * secondInt;
            int degreeOfInts = (int) (firstInt / secondInt);
            System.out.println(sumOfInts + " " + differentOfInts + " " + multiplicationOfInts + " " + degreeOfInts);
            scanner.close();
        }

    }


    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }
}