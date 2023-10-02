package HomeworkSeminar2;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        
        Cat cat = new Cat("Боня", 70, true);
        Cat cat2 = new Cat("Белый", 14, true);
        Cat cat3 = new Cat("Даля", 20, true);
        Cat cat4 = new Cat("Задира", 23, true);
        Cat cat5 = new Cat("Малыш", 8, true);
        Plate plate = new Plate(99);
        plate.info();
        // cat.eat(plate);
        System.out.println();

        Cat[] cats = new Cat[5];
        cats[0] = cat; //new Cat("Василий", 12);
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        int j = 0;
        int appetiteSumm = 0;

        for (Cat cati : cats) {
            cati.eat2(plate);
            if (cati.getHungry() == true) {
                j++;
                appetiteSumm = appetiteSumm + cati.getAppetite();
            }

        }

        Cat[] cats2 = new Cat[j];
        for (Cat cati : cats) {
            if (cati.getHungry() == true) {

                cats2[j-1] = cati;
                j--;
            }

        }

        System.out.println();
        plate.addFood(appetiteSumm);

        for (Cat cati2 : cats2) {
            cati2.eat2(plate);
        }

    }
    
}
