package global.goit.edu.Module3;

public class CaptainDisputeAgain {

    public static int findMin(int[] triple) {

        int minNumber = triple[0];
        for (int i = 0; i < triple.length; i++) {

            minNumber = minNumber < triple[i] ? minNumber : triple[i];

        }
        return minNumber;

    }

    public static void main(String[] args) {
        System.out.println("findMin(new int[] {1, 10, 3}) = " + findMin(new int[]{1, 10, 3}));
        System.out.println("findMin(new int[] {50, 4, 100}) = " + findMin(new int[]{50, 4, 100}));
        System.out.println("findMin(new int[] {244, 338, 710}) = " + findMin(new int[]{244, 338, 710}));
        System.out.println("findMin(new int[] {949, 587, 728}) = " + findMin(new int[]{949, 587, 728}));
        System.out.println("findMin(new int[] {704, 919, 471}) = " + findMin(new int[]{704, 919, 471}));
    }

}
