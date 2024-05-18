package nyp_proje_odevi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Restoran restoran = new Restoran();
        restoran.menuyeUrunEkle(new Yemek("Köfte", 20, "Kırmızı Et"));
        restoran.menuyeUrunEkle(new Yemek("Tavuk", 15, "Beyaz Et"));
        restoran.menuyeUrunEkle(new Yemek("Pilav", 5, "Yan Yemek"));
        restoran.menuyeUrunEkle(new Yemek("Çorba", 8, "Başlangıç"));

        restoran.menuyeUrunEkle(new Icecek("Su", 1, "Pet"));
        restoran.menuyeUrunEkle(new Icecek("Kola", 5,  "Şişe"));
        restoran.menuyeUrunEkle(new Icecek("Çay", 3, "Fincan"));
        restoran.menuyeUrunEkle(new Icecek("Kahve", 4, "Fincan"));
        restoran.menuyeUrunEkle(new Icecek("Limonata", 4, "Bardak"));
        restoran.menuyuGoster();
        

        restoran.garsonEkle(new Garson("Ali"));
        restoran.garsonEkle(new Garson("Veli"));
        restoran.garsonEkle(new Garson("Ayşe"));
        restoran.garsonEkle(new Garson("Fatma"));

        restoran.musteriEkle(new Musteri("Ahmet"));
        restoran.musteriEkle(new Musteri("Mehmet"));
        restoran.musteriEkle(new Musteri("Ayşe"));
        restoran.musteriEkle(new Musteri("Fatma"));

        restoran.rasgeleSiparislerOlustur(5);
        
    }
}
