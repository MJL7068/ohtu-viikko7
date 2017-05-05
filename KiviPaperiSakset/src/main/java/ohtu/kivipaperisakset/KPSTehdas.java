package ohtu.kivipaperisakset;

import java.util.HashMap;

public class KPSTehdas {
    private HashMap<String, KPSPeli> kpsPelit;
    
    public KPSTehdas() {
        kpsPelit = new HashMap<>();
        kpsPelit.put("a", new KPSPelaajaVsPelaaja());
        kpsPelit.put("b", new KPSTekoaly());
        kpsPelit.put("c", new KPSParempiTekoaly());
    }
    
    public KPSPeli hae(String s) {
        return kpsPelit.get(s);
    }
}
