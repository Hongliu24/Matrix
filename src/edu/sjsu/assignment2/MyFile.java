package edu.sjsu.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MyFile {
    public static void theFile(String file1, String file2){
        File infile = new File("file1");
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\test.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }
        //from StackOverFlow


        }
    }


