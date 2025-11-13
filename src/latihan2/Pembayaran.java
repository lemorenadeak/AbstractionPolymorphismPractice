package latihan2;

// Buat interface Pembayaran
public interface Pembayaran {
    // Kontrak: setiap metode pembayaran HARUS bisa memproses
    // dan memberi tahu apa metodenya.
    void prosesPembayaran(double jumlah);
    String getMetodePembayaran();
}