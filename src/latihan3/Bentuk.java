package latihan3;

// Buat abstract class Bentuk
public abstract class Bentuk {
    protected String nama;

    // Constructor
    public Bentuk(String nama) {
        this.nama = nama;
    }

    // Abstract methods - wajib di-override oleh subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    /**
     * Method concrete ini akan di-override oleh subclass
     * untuk memberikan info yang lebih spesifik.
     */
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas: " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}