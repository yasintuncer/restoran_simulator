package nyp_proje_odevi;
// Yemek sınıfı Urun sınıfından türetilmiştir. Yemek sınıfı Urun sınıfının protected değişkenlerine erişebilir. ayrıca abstract olan urunBilgisi metodu override edilmiştir.
public class Yemek extends Urun{
    private String tur;
    Yemek(String ad, double fiyat, String tur) {
        // Urun sınıfının constructor'ı çağrılmıştır.
        super(ad, fiyat);
        this.tur = tur;
    }    
    @Override
    void urunBilgisi() {
        System.out.println("Yemek Adı : " + ad + "\nFiyatı: " + fiyat + "\nTür: " + tur);
    }
}
