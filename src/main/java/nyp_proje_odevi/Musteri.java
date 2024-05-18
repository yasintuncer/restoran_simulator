package nyp_proje_odevi;

import java.util.Date;

public class Musteri  extends Kisi{
    Musteri(String ad) {
        super(ad);
    }

    Siparis siparisVer(Yemek yemek, Icecek icecek)
    {
        // siparis ver methodunda garson referansı yer almamaktadır. Bu nedenle null atandı. 
        // asıl garson Garson sınınfının siparisAl methodunda handle edilecektir.
        return new Siparis(yemek, icecek, null, this, new Date());
    }


}
