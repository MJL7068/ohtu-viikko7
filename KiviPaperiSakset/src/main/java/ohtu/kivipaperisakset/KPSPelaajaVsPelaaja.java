package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPS {

    @Override
    protected String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = super.lueIo();
        return ekanSiirto;
    }

    @Override
    protected String haeTokaSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = super.lueIo();
        return tokanSiirto;
    }
}