package nyp_proje_odevi;

public class Test 
{
    public static void main( String[] args )
    {
        Restoran restoran = new Restoran(); // Restoran nesnesi oluşturuldu.
        restoran.menuyeUrunEkle(new Yemek("Köfte", 200, "Kırmızı Et"));
        restoran.menuyeUrunEkle(new Yemek("Tavuk", 150, "Beyaz Et"));
        restoran.menuyeUrunEkle(new Yemek("Pilav", 50, "Yan Yemek"));
        restoran.menuyeUrunEkle(new Yemek("Çorba", 80, "Başlangıç"));
        restoran.menuyeUrunEkle(new Yemek("Kuru Fasulye", 100, "Sulu Yemek"));

        restoran.menuyeUrunEkle(new Icecek("Su", 10, "Pet"));
        restoran.menuyeUrunEkle(new Icecek("Kola", 30,  "Şişe"));
        restoran.menuyeUrunEkle(new Icecek("Çay", 15, "Fincan"));
        restoran.menuyeUrunEkle(new Icecek("Kahve", 50, "Fincan"));
        restoran.menuyeUrunEkle(new Icecek("Limonata", 80, "Bardak"));
        restoran.menuyuGoster();
        

        restoran.garsonEkle(new Garson("Ali"));
        restoran.garsonEkle(new Garson("Veli"));
        restoran.garsonEkle(new Garson("Ayşe"));
        restoran.garsonEkle(new Garson("Fatma"));

        restoran.musteriEkle(new Musteri("Ahmet"));
        restoran.musteriEkle(new Musteri("Mehmet"));
        restoran.musteriEkle(new Musteri("Ayşe"));
        restoran.musteriEkle(new Musteri("Fatma"));

        restoran.rasgeleSiparislerOlustur(10);
        
    }
}
