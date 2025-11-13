package latihan2;

public class InterfacePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Interface
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep interface dan multiple inheritance.
         */

        // ===== BASIC INTERFACE USAGE =====
        System.out.println("=== BASIC INTERFACE USAGE ===");

        // Latihan 1: Implementasi interface Terbang
        BurungTerbang elang = new BurungTerbang("Elang", 50);
        elang.lepasLandas();
        elang.terbang();
        elang.mendarat();

        // ===== MULTIPLE INHERITANCE DENGAN INTERFACE =====
        System.out.println("\n=== MULTIPLE INHERITANCE ===");

        // Latihan 2: Class yang implements multiple interface
        Bebek donald = new Bebek("Donald", 30);
        donald.lepasLandas();
        donald.terbang();
        donald.berenang();
        donald.menyelam();

        // ===== INTERFACE SEBAGAI TYPE =====
        System.out.println("\n=== INTERFACE SEBAGAI TYPE ===");

        // Latihan 3: Menggunakan interface sebagai tipe variable
        // Variabel 'burung1' bertipe interface 'Terbang'
        // tapi diisi dengan objek 'BurungTerbang'
        Terbang burung1 = new BurungTerbang("Elang", 50);
        burung1.terbang(); // 'burung1' hanya bisa memanggil method dari interface Terbang
        // burung1.nama; // ERROR! Tipe 'Terbang' tidak tahu menahu soal 'nama'

        // Variabel 'ikan1' bertipe interface 'Berenang'
        // tapi diisi dengan objek 'Ikan'
        Berenang ikan1 = new Ikan("Nemo");
        ikan1.berenang(); // 'ikan1' hanya bisa memanggil method dari interface Berenang

        // ===== REAL-WORLD EXAMPLE =====
        System.out.println("\n=== REAL-WORLD EXAMPLE ===");

        // Latihan 4: Sistem pembayaran dengan multiple payment methods
        PaymentProcessor processor = new PaymentProcessor();

        // Tipe data 'pembayaran' adalah interface 'Pembayaran'
        // Ini bisa diisi oleh objek APAPUN yang implements 'Pembayaran'
        Pembayaran kartu = new KartuKredit("1234567890123456");
        processor.proses(kartu, 100000);

        Pembayaran ewallet = new EWallet("08123456789");
        processor.proses(ewallet, 50000);

        Pembayaran transfer = new TransferBank("9876543210");
        processor.proses(transfer, 200000);
    }
}