package latihan1;

// Implementasikan class Kucing extends Hewan
public class Kucing extends Hewan {
    // Constructor
    public Kucing(String nama) {
        // Memanggil constructor dari superclass (Hewan)
        super(nama);
    }

    // Implementasi method bersuara() yang wajib
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }
}