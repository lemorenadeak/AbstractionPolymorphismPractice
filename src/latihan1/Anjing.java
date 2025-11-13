package latihan1;

// Implementasikan class Anjing extends Hewan
public class Anjing extends Hewan {
    // Constructor
    public Anjing(String nama) {
        // Memanggil constructor dari superclass (Hewan)
        super(nama);
    }

    // Implementasi method bersuara() yang wajib
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Guk Guk!");
    }
}