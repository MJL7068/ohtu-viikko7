package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPS {
    private static final Tekoaly tekoaly = new Tekoaly();

    @Override
    protected String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = super.lueIo();
        return ekanSiirto;
    }

    @Override
    protected String haeTokaSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}