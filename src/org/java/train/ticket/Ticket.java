package org.java.train.ticket;

import java.math.BigDecimal;

public class Ticket {
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
    //costanti
    private static final BigDecimal PRICE_PER_KM = new BigDecimal("0.21");
    private static final BigDecimal OVER_DISCOUNT = new BigDecimal("0.40");
    private static final BigDecimal UNDERAGE_DISCOUNT = new BigDecimal("0.20");

    //attributi
    private int km;
    private int passengerAge;

    //costruttore
    public Ticket(int km, int passengerAge) {
        this.km = km;
        this.passengerAge = passengerAge;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    //metodi
    public BigDecimal calcolaPrezzo(){
        BigDecimal kmBigDecimal = new BigDecimal(km);
        BigDecimal basePrice = kmBigDecimal.multiply(PRICE_PER_KM);
        if (passengerAge > 65) {
            BigDecimal discount = basePrice.multiply(OVER_DISCOUNT);
            BigDecimal discountedPrice = basePrice.subtract(discount);
            return discountedPrice;
        } else if (passengerAge < 18) {
            BigDecimal discount = basePrice.multiply(UNDERAGE_DISCOUNT);
            BigDecimal discountedPrice = basePrice.subtract(discount);
            return discountedPrice;
        } else return basePrice;
    }

}
