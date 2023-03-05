package pl.krzysztofjastrzebski.pw.javasem3;

import java.util.Scanner;

public class TimesTable {
    
    public static void main(String[] args) throws Exception{
        //Deklaracja zmiennych
        int x_min;
        int x_max;
        int y_min;
        int y_max;

        //Wczytanie inputu z zakresami
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Oś X - minimum: ");
            x_min = scanner.nextInt();
            System.out.println("Oś X - maksimum: ");
            x_max = scanner.nextInt();
            System.out.println("Oś Y - minimum: ");
            y_min = scanner.nextInt();
            System.out.println("Oś Y - maksimum: ");
            y_max = scanner.nextInt();
        } catch(Exception e){
            e.printStackTrace();
            return;
        }

        if(y_min > y_max || x_min > x_max) return;

        System.out.print("  |");
        for(int i = x_min; i <= x_max; i++){
            System.out.print("  " + i + "   ");
        }
        // \n <- symbol nowej linii
        System.out.print("\n");

        for(int i = x_min; i <= x_max; i++){
            System.out.print("-------");
        }
        System.out.print("\n");

        for(int i = y_min; i <= y_max; i++){
            System.out.print(i + " |");
            for(int j = x_min; j <= x_max; j++){
                System.out.print("  " + j*i + "  ");
            }
            System.out.print("\n");
        }
    }
}
