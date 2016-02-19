package com.josh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int songMinutes = 3;
        double songSeconds = songMinutes * 60; //seconds in a song
        double secondsInDay = (60 * 60) * 24;  //seconds in a day
    Scanner scanner = new Scanner(System.in); //input for side of square
        int side = scanner.nextInt();
        double areaSquare = side * 4;  //calculate area of square

        double kilometersInput = scanner.nextDouble();
        double miles = kilometersInput / 1.6;
        System.out.println(miles);

                double milesInput = scanner.nextDouble();
        double kilometers = milesInput * 1.6;
        System.out.println(kilometers);


    }
}
