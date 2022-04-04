package edu.sjsu.assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class TimeDifferenceProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String timeFirst = "";
        String timeSecond = "";
try {
    System.out.println("Please enter the first time: ");
    timeFirst = input.next();
    System.out.println("Please enter the second time: ");
    timeSecond = input.next();
}catch(NumberFormatException e){
    System.out.println("Invalid input! Program terminated!");
}

printTimedifference(timeFirst, timeSecond);
    }
    public static void printTimedifference(String timeFirst, String timeSecond){
        int hr1, hr2, m1, m2;
        int first = convertMilitaryToMins(timeFirst);
        int second = convertMilitaryToMins(timeSecond);

        int difference = second - first;
        if(difference < 0){
            difference += 24 * 60;
        }
        int hours = difference / 60;
        int mins = difference % 60;
        System.out.println(hours + " hours "+ mins + " minute(s) ");

    }
    private static int convertMilitaryToMins(String time){
        int timeInt = Integer.parseInt(time);
        int hour = timeInt / 100;
        int min = timeInt % 100;
        return hour * 60 + min;
    }
}
