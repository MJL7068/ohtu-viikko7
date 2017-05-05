package ohtu.kivipaperisakset;


// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {
    private static final TekoalyParannettu tekoaly = new TekoalyParannettu(20);

    @Override
    protected String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = super.lueIo();;
        return ekanSiirto;
    }

    @Override
    protected String haeTokaSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}
