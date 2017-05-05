package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS implements KPSPeli {
    private static final Scanner scanner = new Scanner(System.in);
    
    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = haeEkaSiirto();

        String tokanSiirto = haeTokaSiirto();


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = haeEkaSiirto();

            tokanSiirto = haeTokaSiirto();

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    protected String lueIo() {
        return scanner.nextLine();
    }
    
    protected abstract String haeEkaSiirto();
    protected abstract String haeTokaSiirto();
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
