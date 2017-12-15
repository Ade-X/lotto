
        
package lotto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AdeX
 */
public class Lotto {

    public static void main(String[] args) {
        
        // Utworzenie dwóch obiektów klasy Scanner i Random
        Scanner scanner = new Scanner(System.in); // Odpowiada za wprowadzanie danych
        Random random = new Random(); // Odpowiada za generowanie liczb pseudolosowych
        
        int option; // Deklaracja zmiennej całkowitej option odpwiedzialnej za wskazanie trybu losowania
         
        
        
    do
    {   
        System.out.println("Witaj w programie losującym liczby");
        System.out.print("Wybierz losowianie. Wpisz 1 - lotto, 2 - mini lotto: ");
        option = scanner.nextInt(); // Inicjalizacja zmiennej option i przypisanie do niej wartości wprowadzonej w konsoli przez użytkownika
        
        // Wykorzystanie przełącznika do wyboru trybu pracy programu
        switch(option)
        {
            case 1: // Wybór losowania Lotto
            {
               System.out.println("Losuję sześć liczb:");
               int[] lotto = new int[6]; // Deklaracja tablicy sześcioelementowej
               // Przypisanie wyniku działania metody random (liczby pseudolosowe)
               // do zmiennych tablicowych tablicy lotto za pomocą pętli for
               for(int i = 0; i<6; i++)
               {
                   lotto[i] = random.nextInt(50);
               }
               
               // Wyświetlenie poszczególnych elementów tablicy - wyniku losowania
               int x = 0;
               while(x < lotto.length)
               {
                   System.out.print(lotto[x] + " ");
                   
                   x++;
               }
               break;
            }
            case 2: // Wybór losowania Mini Lotto
            {
               System.out.println("Losuję pięć liczb:");
               int[] miniLotto = new int[5]; // Deklaracja tablicy pięcioelementowej
               // Przypisanie wyniku działania metody random (liczby pseudolosowe)
               // do zmiennych tablicowych tablicy miniLotto za pomocą pętli for
               for(int i = 0; i<5; i++)
               {
                   miniLotto[i] = random.nextInt(43);
               }
               // Wyświetlenie poszczególnych elementów tablicy - wyniku losowania
               int x = 0;
               while(x < miniLotto.length)
               {
                   System.out.print(miniLotto[x] + " ");
                   
                   x++;
               }
               break; 
            }
            default: 
            {
                System.out.println("Wybierz poprawną opcję: 1 - Lotto, 2 - Mini Lotto");
            }
            
        }
        System.out.println();
        System.out.println("DZIĘKUJĘ ZA SKORZYSTANIE Z APLIKACJI. ŻYCZĘ WIELU WYGRANYCH!");
        
    } while(option != 1 && option != 2 );
  }
}
