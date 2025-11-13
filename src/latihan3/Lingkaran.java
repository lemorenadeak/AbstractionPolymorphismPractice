package latihan3;

// Implementasikan class Lingkaran extends Bentuk
public class Lingkaran extends Bentuk {
    private double radius;
    // Gunakan Math.PI untuk nilai Pi yang lebih akurat
    private final double PI = Math.PI;

    // Constructor
    public Lingkaran(double radius) {
        super("Lingkaran"); // Memanggil constructor Bentuk
        this.radius = radius;
    }

    // Override hitungLuas()
    @Override
    public double hitungLuas() {
        return PI * radius * radius;
    }

    // Override hitungKeliling()
    @Override
    public double hitungKeliling() {
        return 2 * PI * radius;
    }

    // Override tampilkanInfo() dengan informasi spesifik lingkaran
    // (Sesuai ekspektasi output)
    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Lingkaran dengan radius " + radius + ": " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}