package nyp_proje_odevi;

public abstract class Urun {
    protected String ad;   
    protected double fiyat;
    Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }
    String getAd() {
        return ad;
    }
    double getFiyat() {
        return fiyat;
    }
    abstract void urunBilgisi();
}

