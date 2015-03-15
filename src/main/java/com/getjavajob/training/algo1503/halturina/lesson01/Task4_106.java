package com.getjavajob.training.algo1503.halturina.lesson01;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_106 {
    public static String getMonth(int month) {
        String season;
        switch (month) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Winter";
                break;
            case 3:
                season = "Spring";
                break;
            case 4:
                season = "Spring";
                break;
            case 5:
                season = "Spring";
                break;
            case 6:
                season = "Summer";
                break;
            case 7:
                season = "Summer";
                break;
            case 8:
                season = "Summer";
                break;
            case 9:
                season = "Autumn";
                break;
            case 10:
                season = "Autumn";
                break;
            case 11:
                season = "Autumn";
                break;
            case 12:
                season = "Winter";
                break;
            default:
                season = "NoMonth";
        }

        return season;

    }
}
