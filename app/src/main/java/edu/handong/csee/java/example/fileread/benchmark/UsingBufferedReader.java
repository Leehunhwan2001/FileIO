package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            System.out.println("Please provide a file name as a command line argument.");
            return;
        }

        String filename = args[0];

        StopWatch.start();

        BufferedReader inputStream = new BufferedReader(new FileReader(filename));
        while (inputStream.read() != -1) {}

        long duration = StopWatch.stop();
        System.out.println("Reading file: " + filename);
        System.out.println(duration + " milsec");

        inputStream.close();
    }
}
