package latihan1;

// Buat abstract class Hewan
public abstract class Hewan {
    // Instance variable
    protected String nama;

    // Constructor
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Abstract method - harus diimplementasikan oleh subclass
    // Tidak memiliki isi/body, hanya deklarasi
    public abstract void bersuara();

    // Concrete method - sudah ada implementasi
    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }

    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
}