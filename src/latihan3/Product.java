package latihan3;

// Implementasikan class Product dengan constructor overloading
public class Product {
    private String nama;
    private double harga;
    private int stok;

    // Constructor 1: hanya nama
    // Memanggil constructor 3 dengan nilai default
    public Product(String nama) {
        this(nama, 0, 0);
    }

    // Constructor 2: nama dan harga
    // Memanggil constructor 3 dengan nilai default
    public Product(String nama, double harga) {
        this(nama, harga, 0);
    }

    // Constructor 3: nama, harga, dan stok (Constructor utama)
    public Product(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Product: " + nama + " | Price: Rp " + harga + " | Stock: " + stok);
    }
}