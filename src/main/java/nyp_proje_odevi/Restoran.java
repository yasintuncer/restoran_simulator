package nyp_proje_odevi;

import java.util.ArrayList;
import java.util.Random;

public class Restoran {
    private ArrayList<Urun> menu;
    private ArrayList<Musteri> musteri;
    private ArrayList<Garson> garson;
    private ArrayList<Siparis> siparisler;

    public Restoran() {
        this.menu = new ArrayList<Urun>();
        this.musteri = new ArrayList<Musteri>();
        this.garson = new ArrayList<Garson>();
        this.siparisler = new ArrayList<Siparis>();

        // müsteri icecek veya yemekten birini siparis etmek istemeyebilir. Bu nedenle bos bir yemek ve icecek objeleri olusturuldu
        menuyeUrunEkle(new Yemek("Bos", 0, "Bos"));
        menuyeUrunEkle(new Icecek("Bos", 0, "Bos"));
    }

    public void menuyeUrunEkle(Urun u) {
        menu.add(u);
    }

    public void musteriEkle(Musteri m) {
        musteri.add(m);
    }

    public void garsonEkle(Garson g) {
        garson.add(g);
    }

    public void menuyuGoster() {
        System.out.println("----MENÜ----");
        for (Urun u : menu) {
            //"Bos" adlı ürünlerin menüde gösterilmesi engellendi. 
            if( u.ad.equals("Bos")) {
                continue;
            }
            u.urunBilgisi();
        
            System.out.println("------------");
        }
        System.out.println("------------");
    }

    public void rasgeleSiparislerOlustur(int adet) {
        
        //array list'ler boyutunca rasgele değer üretmek için random sınıfı kullanıldı
        Random random = new Random();
        int varolan_siparis_sayisi = siparisler.size();

        while ( siparisler.size() < varolan_siparis_sayisi + adet) {

            //try cacth bloğu boş array list elemanlarına erişim hatasını engellemek için kullanıldı
            try {

                // secili yemek ve icecek basta null olarak tanimlandi.
                Yemek secili_yemek = null;
                Icecek secili_icecek = null;

                // Döngü, herhangi bir yemek ve icecek secilene kadar devam eder.
                while(secili_yemek == null || secili_icecek == null) {
                    Urun secili_urun = menu.get(random.nextInt(menu.size()));
                    if (secili_urun instanceof Yemek) {
                        secili_yemek = (Yemek) secili_urun;
                    } else if (secili_urun instanceof Icecek) {
                        secili_icecek = (Icecek) secili_urun;
                    }
                }
                
                // gecersiz siparis olusturmayi engellemek icin kontrol. Eger secili yemek ve icecek bos ise siparis olusturulmaz. döngü bir sonraki tura geçer
                if (secili_yemek.getAd().equals("Bos") && secili_icecek.getAd().equals("Bos")) {
                    continue;
                }

                Musteri secili_musteri = musteri.get(random.nextInt(musteri.size()));
                Siparis s = secili_musteri.siparisVer((Yemek)secili_yemek, (Icecek)secili_icecek);
            
                Garson secili_garson = garson.get(random.nextInt(garson.size()));
                secili_garson.siparisAl(s, siparisler); // ilgili method'da siparis garson bilgiside atandıktan sonra siparisler listesine eklenir

            } catch (IndexOutOfBoundsException e) { // herhangi bir arraylist'in Indexout olma durumunu handle eder.
                System.out.println(
                        "Restoranda yeterli garson, müşteri ve menü elemanı olmadığı için sipariş oluşturulamadı.");

            }
        }
        return ;
    }

}
