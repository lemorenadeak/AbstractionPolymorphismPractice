package latihan1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Introduction to Abstraction
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep abstraction dan abstract class.
         */

        // ===== TANPA ABSTRACTION: CARA BIASA =====
        System.out.println("=== TANPA ABSTRACTION ===");

        // Latihan 1: Buat beberapa object hewan dengan cara biasa
        // Masalah: Kita bisa membuat object dari class Hewan yang terlalu umum
        // Padahal di dunia nyata, tidak ada "hewan" tanpa jenis spesifik

        // UNCOMMENT kode di bawah dan perhatikan masalahnya
        HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        hewan.bersuara(); // Output apa yang akan keluar? (Output: Hewan Umum bersuara...)

        // ===== DENGAN ABSTRACTION: MENGGUNAKAN ABSTRACT CLASS =====
        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Latihan 2: Menggunakan abstract class
        // Buat beberapa object dari subclass Hewan

        // Buat object Kucing
        Kucing kucing = new Kucing("Kitty");
        kucing.bersuara();
        kucing.makan();
        kucing.tidur();
        System.out.println(); // Menambah spasi agar sesuai ekspektasi output

        // Buat object Anjing
        Anjing anjing = new Anjing("Bobby");
        anjing.bersuara();
        anjing.makan();
        anjing.tidur();
        System.out.println(); // Menambah spasi agar sesuai ekspektasi output

        // Buat object Burung
        Burung burung = new Burung("Tweety");
        burung.bersuara();
        burung.makan();
        burung.tidur();

        // ===== DEMONSTRASI ABSTRACTION =====
        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");

        // Latihan 3: Polymorphic array
        // Buat array bertipe Hewan yang berisi berbagai jenis hewan
        // Iterasi array dan panggil method bersuara()

        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Kucing("Kitty");
        hewanArray[1] = new Anjing("Bobby");
        hewanArray[2] = new Burung("Tweety");

        for (Hewan h : hewanArray) {
            h.bersuara(); // Memanggil method spesifik (Kucing/Anjing/Burung)
        }

        // ===== KEUNTUNGAN ABSTRACTION =====
        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");
        // Tuliskan dalam komentar 5 keuntungan menggunakan abstraction

        /*
         * 5 Keuntungan Abstraction:
         * 1. Menyembunyikan Detail Implementasi (Hiding Complexity):
         * Kita hanya perlu tahu *apa* yang dilakukan method (seperti bersuara()),
         * tanpa perlu tahu *bagaimana* cara melakukannya (meong, guk guk, dll).
         *
         * 2. Mencegah Instansiasi Objek yang Tidak Logis:
         * Kita tidak bisa membuat objek `new Hewan()`. Ini bagus, karena
         * di dunia nyata tidak ada "Hewan" generik, yang ada adalah "Kucing", "Anjing", dll.
         *
         * 3. Menetapkan "Kontrak" untuk Subclass:
         * Dengan abstract method (seperti `bersuara()`), class Hewan *memaksa*
         * semua subclass-nya (Kucing, Anjing) untuk wajib membuat implementasi
         * method tersebut.
         *
         * 4. Mendukung Polymorphism:
         * Memudahkan kita untuk mengelola objek yang berbeda-beda tapi
         * memiliki "jenis" yang sama (Kucing, Anjing adalah sama-sama Hewan),
         * seperti yang ditunjukkan pada Latihan 3 (hewanArray).
         *
         * 5. Meningkatkan Fleksibilitas dan Maintainability:
         * Kita bisa mengubah cara kerja internal `Kucing.bersuara()` tanpa
         * mengubah kode yang memanggilnya (di `main` method), selama
         * nama method-nya tetap `bersuara()`.
         */
    }
}