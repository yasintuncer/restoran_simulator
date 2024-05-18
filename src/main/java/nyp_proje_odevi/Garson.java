package nyp_proje_odevi;

//io paketleri Dosya yazma ve dosya oluşturma işlemleri için kullanıldı.
import java.io.PrintWriter;
import java.io.File;

import java.util.ArrayList;

public class Garson extends Kisi {
    Garson(String ad) {
        super(ad);
    }

    void siparisAl(Siparis s, ArrayList<Siparis> siparisler) {
        s.garsonAta(this);
        siparisler.add(s);
        s.siparisBilgisi();

        String dizin_adı = "Siparisler";
        String dosyaAdi = "Siparisler/siparis_" + s.siparisNo + ".txt";

        // Dosya yazma işleminde oluşabilecek hataların kontrolü için try-catch bloğu
        // kullanıldı.
        try {
            //eğer dizin yoksa oluşturulur.
            if (!new File(dizin_adı).exists()) {
                new File(dizin_adı).mkdir();
            }

            File dosya = new File(dosyaAdi); // Dosya oluşturuldu.
            dosya.createNewFile(); // Dosya oluşturuldu.
            PrintWriter writer = new PrintWriter(dosyaAdi, "UTF-8");
            s.siparisYazdir(writer);
            writer.close(); // sipariş bilgileri dosyaya yazıldıktan sonra dosya kapatıldı.
        } catch (Exception e)// genel olarak dosya yazma hatası olarak ele alındı.
        {
            System.out.println("Dosya yazma hatasi" + e.getMessage());
        }
    }
}
