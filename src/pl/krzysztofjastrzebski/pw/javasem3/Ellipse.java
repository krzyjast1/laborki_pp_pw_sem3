package pl.krzysztofjastrzebski.pw.javasem3;

import java.util.Scanner;
import java.lang.Math;

public class Ellipse {

    private static double area;
    private static double semiMinorAxis;
    private static double semiMajorAxis;
    private final static double MIN = 0;
    private final static double MAX = 200; 

    public static void main(String[] args) throws Exception {
        System.out.println("Witaj, to ja - twój kalkulator pola powierzchni koła!");
        System.out.print("Podaj dłuzszą półoś elipsy: ");

        Scanner scanner = new Scanner(System.in);
        semiMajorAxis = scanner.nextDouble();

        System.out.print("Podaj krótszą półoś elipsy: ");
        semiMinorAxis = scanner.nextDouble();
        scanner.close();

        if(semiMajorAxis >= MIN && semiMajorAxis <= MAX && semiMinorAxis >= MIN && semiMinorAxis <= MAX){            
            area = semiMajorAxis * semiMinorAxis * Math.PI;
            System.out.println("Półoś krótsza elipsy: " + semiMinorAxis);
            System.out.println("Półoś dłuzsza elipsy: " + semiMajorAxis);
            System.out.println("Pole elipsy: " + area);
            System.out.println("=== KONIEC PROGRAMU ===");
        } else {
            System.out.printf("Półosie elipsy muszą znajdować się w zakresie <%.0f; %.0f>\n", MIN, MAX);
            System.out.println("Półoś krótsza elipsy: " + semiMinorAxis);
            System.out.println("Półoś dłuzsza elipsy: " + semiMajorAxis);
        }
    } 
}
