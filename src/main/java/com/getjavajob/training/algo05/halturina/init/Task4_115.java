package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 18.03.2015.
 */
public class Task4_115 {
    public static String getMoonYear(int year) {
        String animal;
        String colour;
        int odd = year - 1984; //
        switch (odd % 12) {
            case 0:
                animal = "Крыса";
                break;
            case 1:
                animal = "Корова";
                break;
            case 2:
                animal = "Тигр";
                break;
            case 3:
                animal = "Заяц";
                break;
            case 4:
                animal = "Дракон";
                break;
            case 5:
                animal = "Змея";
                break;
            case 6:
                animal = "Лошадь";
                break;
            case 7:
                animal = "Овца";
                break;
            case 8:
                animal = "Обезьяна";
                break;
            case 9:
                animal = "Петух";
                break;
            case 10:
                animal = "Собака";
                break;
            case 11:
                animal = "Свинья";
                break;
            default: animal = "NoAnimal";

        }
        switch (odd % 10) {
            case 0:
            case 1:
                colour = "Зеленый";
                break;
            case 2:
            case 3:
                colour = "Красный";
                break;
            case 4:
            case 5:
                colour = "Желтый";
                break;
            case 6:
            case 7:
                colour = "Белый";
                break;
            case 8:
            case 9:
                colour = "Черный";
                break;
            default: colour = "NoColour";
        }
        return animal + ", " + colour;
    }
}
