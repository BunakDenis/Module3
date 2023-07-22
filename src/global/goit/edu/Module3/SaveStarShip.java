package global.goit.edu.Module3;

public class SaveStarShip {

    public int calculateDistance(int distance) {

        int moduleOfNumber = Math.abs(distance);
        return moduleOfNumber;

    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}
