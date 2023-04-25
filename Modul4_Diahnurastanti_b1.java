//Class Bunga:
public class Bunga {
    private String nama;
    private int Umur;

    public Bunga(String nama, int biji) {
        this.nama = nama;
        this.Umur = Umur;
    }

    public void Penyerbukan() {
        System.out.println("Bunga " + nama + " Penyerbukan");
    }

    public void Pembuahan() {
        System.out.println("Bunga " + nama + " Pembuahan");
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        int umur = 0;
        return umur;
    }
}

//Class Matahari extends Bunga:
public class Matahari extends Bunga{
    public Matahari(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void Penyerbukan() {
        System.out.println("Matahari " + getNama() + "Melalui Bantuan Hewan");
    }

    @Override
    public void Pembuahan() {
        System.out.println("Matahari " + getNama() + "Melalui Kupu-kupu dibagian bunga Matahari");
    }
}

//Class Mawar extends Bunga:
public class Mawar extends Bunga{
    public Mawar(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void Penyerbukan() {
        System.out.println("Mawar " + getNama() + "Penyerbukan Entomofili");
    }

    @Override
    public void Pembuahan() {
        System.out.println("Mawar " + getNama() + "Melalui Kupu-kupu dibagian bunga Mawar");
    }
}

//Class Melati extends Bunga:
public class Melati extends Bunga{
    public Melati(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void Penyerbukan() {
        System.out.println("Melati " + getNama() + "Penyerbukan anemogami");
    }

    @Override
    public void Pembuahan() {
        System.out.println("Melati " + getNama() + "Melalui serangga yang hinggap dibunga");
    }
}

//Main class:
public class Modul4_DiahNurAstanti_b1 {
    public static void main(String[] args) {
        Bunga Matahari = new Matahari("Sunflower", 1);
        Bunga Mawar = new Mawar("Rose", 2);
        Bunga Melati = new Melati("Jasmine", 1);

        Matahari.Penyerbukan();
        Matahari.Pembuahan(); 

        Mawar.Penyerbukan(); 
        Mawar.Pembuahan();

        Melati.Penyerbukan(); 
        Melati.Pembuahan();
    }
}
