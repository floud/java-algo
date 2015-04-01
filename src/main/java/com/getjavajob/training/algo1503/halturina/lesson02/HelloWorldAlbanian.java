package com.getjavajob.training.algo1503.halturina.lesson02;

import sun.io.ByteToCharCp1252;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * @author Vital Severyn
 * @since 22.03.15
 */
public class HelloWorldAlbanian {
    public static void main(String[] args) throws UnsupportedEncodingException {

        System.out.println(new String("P�rsh�ndetje bot�!".getBytes(), "CP1252"));

    }
}
