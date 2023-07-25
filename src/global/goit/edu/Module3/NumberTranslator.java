package global.goit.edu.Module3;

public class NumberTranslator {

    public int translate(String romanNumber) {

        int numbers = -1;
        switch (romanNumber.strip().toUpperCase()) {

            case "I":
                numbers = 1;
                break;
            case "II" :
                numbers = 2;
            case "III":
                numbers = 3;
                break;
            case "IV" :
                numbers = 4;
                break;
            case "V":
                numbers = 5;
                break;
            case "VI" :
                numbers = 6;
                break;
            case "VII":
                numbers = 7;
                break;
            case "VIII" :
                numbers = 8;
                break;
            case "IX":
                numbers = 9;
                break;
            case "X" :
                numbers = 10;
                break;
            case "XI":
                numbers = 11;
                break;
            case "XII" :
                numbers = 12;
                break;

        }
        return numbers;

    }

}
