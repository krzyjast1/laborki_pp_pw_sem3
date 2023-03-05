package pl.krzysztofjastrzebski.pw.javasem3;

import java.util.Scanner;

public class LeibnizPi {

    private static int x;
    private static double approximateOfPi;
    private static final int MIN = 5;
    private static final int MAX = 1000;

    public static void main(String[] args) throws Exception {

        //Inicjalizacja scannera, pobranie inputu uzytkownika, zamknięcie scannera
        //try-with przechwytuje błędy przy wprowadzaniu 
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj liczbę wyrazów ciągu: ");
            x = scanner.nextInt();
        } catch(Exception e){
            //printStackTrace - wypisanie szczegółów błędu
            //return - wyjście z main'a -> koniec programu
            System.err.println("Błąd wprowadzonych danych");
            e.printStackTrace();
            return;
        }


        //Weryfikacja poprawności wprowadzonej wartości
        if(x > MAX || x < MIN){
            System.out.printf("Liczba wyrazów musi zawierać się w przedziale <%d; %d>", MIN, MAX);
        } else {
            //Algorytm na liczbę PI:
            // PI/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
            //Implementacja:
            approximateOfPi = 0;
            for(int i = 1; i <= x; i++){
                double j = i;
                if(j%2 == 1){
                    approximateOfPi = approximateOfPi + (1/((j*2)-1));
                } else {
                    approximateOfPi = approximateOfPi - (1/((j*2)-1));
                }
            }
            approximateOfPi = approximateOfPi * 4;

            System.out.println();
            System.out.println("PI przyblizone: " + approximateOfPi);
            System.out.println("PI realne: " + Math.PI);
        }
    }
}