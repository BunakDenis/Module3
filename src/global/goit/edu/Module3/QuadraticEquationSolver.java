package global.goit.edu.Module3;

import java.util.*;
public class QuadraticEquationSolver {

    public static double[] solve(int a, int b, int c) {

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {

            double x1 = ((b * -1) + Math.sqrt(discriminant)) / (2 * a);
            double x2 = ((b * -1) - Math.sqrt(discriminant)) / (2 * a);
            double[] result = {x1, x2};
            return result;
        } else if (discriminant == 0) {

            double x1 = (b * -1) / (2 * a);
            double [] result = {x1};
            return result;

        } else {
            double result[] = {};
            return result;
        }

    }

    public static void main(String[] args) {

        System.out.println("solve(1, -2, -3) = " + Arrays.toString(solve(1, -2, -3)));
        System.out.println("solve(1, 12, 36) = " + Arrays.toString(solve(1, 12, 36)));
        System.out.println("solve(5, 3, 7) = " + Arrays.toString(solve(5, 3, 7)));

    }

}
