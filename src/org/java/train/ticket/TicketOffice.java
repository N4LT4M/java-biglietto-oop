package org.java.train.ticket;

import java.util.Scanner;

public class TicketOffice {
    public static void main(String[] args) {
            /*
    creare una classe Biglietto con due attributi interi: km e età del passeggero.
Nel costruttore vanno valorizzati entrambi gli attributi,
assicurandosi che abbiano valori validi (creare due metodi isValidKm e isValidEta che implementano questa logica).
In caso anche solo uno non sia valido, sollevare un’eccezione.
Aggiungere tre costanti:
-il costo chilometrico di 21 centesimi di €/km (BigDecimal),
-lo sconto over 65 del 40 % (BigDecimal)
-lo sconto minorenni del 20% (BigDecimal).
Implementare il metodo public che calcola il prezzo del biglietto comprensivo di eventuale sconto (calcolaPrezzo).
Per eseguire il calcolo dello sconto aggiungere un metodo private calcolaSconto, da chiamare dentro al metodo calcolaPrezzo.

Creare una classe Biglietteria, che contiene il metodo main in cui:
- chiedere all’utente di inserire il numero di km e l’età del passeggero
- con quei dati provare a creare un nuovo Biglietto (gestire eventuali eccezioni con try-catch)
- stampare a video il prezzo del biglietto calcolato
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many km you need to run?");
        int km = scanner.nextInt();
        System.out.println("how old are you?");
        int passengerAge = scanner.nextInt();
        Ticket ticket = new Ticket(km, passengerAge);
        System.out.println();
    }
}
