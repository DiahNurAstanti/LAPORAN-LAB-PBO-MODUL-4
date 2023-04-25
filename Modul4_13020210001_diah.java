Class:
public class Mobil {
    private String merk;
    private int tahunProduksi;
    
    public Mobil(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}

Main Class:
public class Modul4_13020210001_diah {
    
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Civic",2021 );
        
        System.out.println("Merk mobil: " + mobil.getMerk());
        System.out.println("Tahun produksi: " + mobil.getTahunProduksi());
        
        mobil.setMerk("Honda");
        mobil.setTahunProduksi(2022);
        
        System.out.println("Merk mobil setelah diubah: " + mobil.getMerk());
        System.out.println("Tahun produksi setelah diubah: " + mobil.getTahunProduksi());
    }
}
