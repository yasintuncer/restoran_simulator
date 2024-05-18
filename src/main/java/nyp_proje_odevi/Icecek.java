package nyp_proje_odevi;
public class Icecek extends Urun{
    private String boy;

    Icecek(String ad, double fiyat, String boy) 
    {
        super(ad, fiyat);
        this.boy = boy;
    };
    @Override
    void urunBilgisi() 
    {
        System.out.println("İçecek Adı: " + ad + "\nFiyat: " + fiyat + "\nBoyut:" + boy);
    } 
}
