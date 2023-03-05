package pl.krzysztofjastrzebski.pw.javasem3;

import java.util.Scanner;

public class TaylorSinus {

    private static double angleDg;
    private static double angleRd;
    private static double precision;

    private static final double MIN = 0;
    private static final double MAX = 90;

    private static final double MIN_PRECISION = 0.000001;
    private static final double MAX_PRECISION = 1;

    public static void main(String[] args) throws Exception{
        //Inicjalizacja scannera, pobranie inputu uzytkownika, zamknięcie scannera
        //try-with przechwytuje błędy przy wprowadzaniu danych
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj kąt w stopniach: ");
            angleDg = scanner.nextDouble();
            System.out.println("Podaj dokładność: ");
            precision = scanner.nextDouble();
        } catch(Exception e){
            //printStackTrace - wypisanie szczegółów błędu
            //return - wyjście z main'a -> koniec programu
            System.err.println("Błąd wprowadzonych danych");
            e.printStackTrace();
            return;
        }

        //Weryfikacja poprawności wprowadzonej wartości
        if(angleDg > MAX || angleDg < MIN){
            System.out.printf("Miara kąta musi zawierać się w przedziale <%d; %d>", MIN, MAX);
            return;
        } else if(precision > MAX_PRECISION || precision < MIN_PRECISION){
            System.out.printf("Dokładność musi zawierać się w przedziale <%d; %d>", MIN_PRECISION, MAX_PRECISION);
            return;
        }

        //Konwersja na radiany
        angleRd = Math.toRadians(angleDg);

        //Zmienne pomocnicze do pętli
        long n = 1;
        double sum = angleRd;
        double element = angleRd;

        do{
            element = -1 * element * ((angleRd*angleRd)/(2*n*((2*n)+1)));
            sum = sum + element;
            n++;
        } while(Math.abs(element) >= precision);

        System.out.println("Sinus z szeregu Taylora: " + sum);
        System.out.println("Sinus z Math.sin(): " + Math.sin(angleRd));

    }

        
}
