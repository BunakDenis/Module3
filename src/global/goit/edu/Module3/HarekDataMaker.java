package global.goit.edu.Module3;

import java.util.Arrays;

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {

        String informationOfCitizens = "name - " + name + ", age - " + age + ", planet - " + planet;
        return informationOfCitizens;

    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {

        int lengthOfMassive = names.length;
        String[] massiveForAggregation = new String[lengthOfMassive];

        for (int i = 0; i < lengthOfMassive; i++) {

                massiveForAggregation[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);

        }


        return massiveForAggregation;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");
        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }

}
