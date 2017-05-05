package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KPSTehdas kps = new KPSTehdas();

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            KPSPeli haettuKomento = kps.hae(vastaus);
            if (haettuKomento != null) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                haettuKomento.pelaa();
            } else {
                break;
            }
        }
        
    }
}
