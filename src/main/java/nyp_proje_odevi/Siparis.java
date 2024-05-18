package nyp_proje_odevi;

import java.io.PrintWriter;
import java.util.Date;
public class Siparis {
    private static long siparisNoCounter = 0; // siparis numarası siparisler klasöründen alınabilirdi fakat projede istenmediği için 0 olarak başlatıldı.
    private Yemek yemek;
    private Icecek icecek;
    public Garson garson;
    private Musteri musteri;
    public Date tarih;
    public long siparisNo;
    public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri, Date tarih) {
        this.yemek = yemek;
        this.icecek = icecek;
        this.garson = garson;
        this.musteri = musteri;
        this.tarih = tarih;
        //siparis numarasi olusturulurken her yeni siparis icin bir arttirilir
        Siparis.siparisNoCounter++; 
        //güncel siparis numarasi atanir
        this.siparisNo = Siparis.siparisNoCounter;
    }

    // müşteri sınıfında yeralan siparisVer methodu garson bilgisini parametre olarak almamaktadır. Projenin istenen yapısına dokunmadan bu durumu çözmek için bu methodu ekledim.
    // Bu nedenle müşteri sadece empty string olarak siparisi oluşturcak ardından garson siparisAl methodu ile kendini siparisin garsonu olarak atayacak şekilde bu eklemeyi yaptım.
    void garsonAta(Garson garson)
    {
        this.garson = garson;
    }
    void siparisBilgisi()
    {
        System.out.println("Yemek: " + yemek.getAd() +  " - " + yemek.getFiyat());
        System.out.println("İçecek: " + icecek.getAd() + " - " + icecek.getFiyat());
        System.out.println("Garson: " + garson.getAd());
        System.out.println("Müşteri: " + musteri.getAd());
        System.out.println("Tarih: " + tarih);
        System.out.println("Siparis Alindi.\n\n");
    
    }
    void siparisYazdir(PrintWriter yazici)
    {
        yazici.println("Yemek: " + yemek.getAd() +  " - " + yemek.getFiyat());
        yazici.println("İçecek: " + icecek.getAd() + " - " + icecek.getFiyat());
        yazici.println("Garson: " + garson.getAd());
        yazici.println("Müşteri: " + musteri.getAd());
        yazici.println("Tarih: " + tarih);
        yazici.println("Siparis Alindi.\n\n");
    }

}
