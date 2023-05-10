package pertemuan05;

public class Pertemuan05 {
    
    public static void main(String[] args) {
        Laptop asus = new Laptop();
        asus.merek = "Asus";
        asus.tipe = "X441N";
        asus.warna = "Hijau Telur Asin";
        asus.CPU = "Intel Celeron";
        asus.ram = 2;
        asus.penyimpanan = 512;     
        
        asus.infoSpec();
        
        Laptop lenovo = new Laptop();
        lenovo.merek = "Lenovo Ideapad Gaming";
        lenovo.tipe = "G112K";
        lenovo.warna = "Black Mempesona";
        lenovo.CPU = "Intel Core I7 101119H";
        lenovo.ram = 16;
        lenovo.penyimpanan = 512;
        
        lenovo.infoSpec();
        lenovo.caraPenggunaan();
    }
    
}
