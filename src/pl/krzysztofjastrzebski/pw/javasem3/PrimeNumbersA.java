package pl.krzysztofjastrzebski.pw.javasem3;

import java.util.Scanner;

public class PrimeNumbersA {
    public static void main(String[] args) throws Exception{

        int min;
        int max;
        int count = 0;
        String s = "";

        //Wczytanie inputu z zakresami
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("minimum: ");
            min = scanner.nextInt();
            System.out.println("maksimum: ");
            max = scanner.nextInt();
        } catch(Exception e){
            e.printStackTrace();
            return;
        }

        for(int i = min; i <= max; i++){
            boolean isPrime = true;
            //Sprawdzenie czy liczba jest pierwsza
            for(int j = 2; j <= i/2; j++){
                if(i<=1){
                    isPrime = false;
                    break;
                }
                else if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                s = s + " " + i;
            }
        }

        System.out.printf("Znaleziono (%d) liczb pierwszych:\n" + s, count);
    }
}
