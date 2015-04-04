package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_106 {
    public static String getMonth(int month) {
        String season;
        switch (month) {
            case 1:
            case 12:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "NoMonth";
        }

        return season;

    }
}
