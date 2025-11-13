package latihan1;

// Implementasikan class Burung extends Hewan
public class Burung extends Hewan {
    // Constructor
    public Burung(String nama) {
        // Memanggil constructor dari superclass (Hewan)
        super(nama);
    }

    // Implementasi method bersuara() yang wajib
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Cuit Cuit!");
    }
}