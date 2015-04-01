package com.getjavajob.training.algo1503.halturina.lesson02;

import sun.io.ByteToCharCp1252;

import java.nio.charset.Charset;

/**
 * @author Vital Severyn
 * @since 22.03.15
 */
public class HelloWorldAlbanian {
    public static void main(String[] args) {
        String charset = "CP1252";
        try {
            System.out.println(new String("P�rsh�ndetje bot�!".getBytes(), "CP1252"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
