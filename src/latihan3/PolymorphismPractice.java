package latihan3;

public class PolymorphismPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Polymorphism
         *
         * Instruksi: Lengkapi latihan untuk menguasai method overriding
         * dan method overloading (polymorphism).
         */

        // ===== PART 1: METHOD OVERRIDING =====
        System.out.println("=== METHOD OVERRIDING ===");

        // Latihan 1: Method overriding pada class hierarchy
        // Tipe data 'Bentuk', tapi objeknya 'Lingkaran'
        Bentuk b1 = new Lingkaran(5);
        b1.tampilkanInfo(); // Java memanggil tampilkanInfo() milik Lingkaran
        System.out.println();

        // Tipe data 'Bentuk', tapi objeknya 'PersegiPanjang'
        Bentuk b2 = new PersegiPanjang(4, 6);
        b2.tampilkanInfo(); // Java memanggil tampilkanInfo() milik PersegiPanjang
        System.out.println();

        // Tipe data 'Bentuk', tapi objeknya 'Segitiga'
        Bentuk b3 = new Segitiga(3, 4);
        b3.tampilkanInfo(); // Java memanggil tampilkanInfo() milik Segitiga

        // ===== RUNTIME POLYMORPHISM =====
        System.out.println("\n=== RUNTIME POLYMORPHISM ===");

        // Latihan 2: Array polymorphic
        System.out.println("Menghitung total luas semua bentuk:");
        // Array 'Bentuk' bisa diisi oleh subclass-subclass nya
        Bentuk[] bentukArray = {
                new Lingkaran(7),
                new PersegiPanjang(5, 10),
                new Segitiga(6, 8)
        };

        double totalLuas = 0;
        for (Bentuk b : bentukArray) {
            // Java secara otomatis (runtime) menentukan
            // method hitungLuas() mana yang harus dipanggil
            // (milik Lingkaran, PersegiPanjang, atau Segitiga)
            double luas = b.hitungLuas();
            System.out.println(b.getClass().getSimpleName() + ": " + String.format("%.2f", luas));
            totalLuas += luas;
        }
        System.out.println("Total Luas: " + String.format("%.2f", totalLuas));

        // ===== PART 2: METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");

        // Latihan 3: Kalkulator dengan method overloading
        Kalkulator calc = new Kalkulator();
        // Java tahu method 'tambah' mana yang harus dipanggil
        // berdasarkan jumlah dan tipe argumen (compile time)
        System.out.println("Menjumlahkan 2 integer: 5 + 3 = " + calc.tambah(5, 3));
        System.out.println("Menjumlahkan 3 integer: 2 + 4 + 6 = " + calc.tambah(2, 4, 6));
        System.out.println("Menjumlahkan 2 double: 2.5 + 3.7 = " + String.format("%.2f", calc.tambah(2.5, 3.7)));

        // ===== CONSTRUCTOR OVERLOADING =====
        System.out.println("\n=== CONSTRUCTOR OVERLOADING ===");

        // Latihan 4: Product dengan berbagai constructor
        Product p1 = new Product("Laptop");
        p1.tampilkanInfo();

        Product p2 = new Product("Mouse", 150000);
        p2.tampilkanInfo();

        Product p3 = new Product("Keyboard", 500000, 10);
        p3.tampilkanInfo();

        // ===== OVERRIDING DENGAN SUPER =====
        System.out.println("\n=== OVERRIDING DENGAN SUPER ===");

        // Latihan 5: Menggunakan super untuk memanggil method parent
        PegawaiTetap pegawai = new PegawaiTetap("Budi", 5000000, 10000000);
        pegawai.tampilkanInfo();
    }
}