package latihan2;

// Implementasikan class PaymentProcessor
public class PaymentProcessor {

    // Method untuk memproses pembayaran apapun
    // Tipe parameter 'payment' adalah interface 'Pembayaran'.
    // Ini berarti method ini bisa menerima OBJEK APAPUN
    // selama objek itu meng-implement interface 'Pembayaran'
    // (Contoh: KartuKredit, EWallet, TransferBank)
    public void proses(Pembayaran payment, double jumlah) {
        // Kita tidak perlu tahu ini KartuKredit atau EWallet.
        // Kita hanya perlu tahu bahwa ini PASTI punya method prosesPembayaran().
        // Inilah kekuatan polymorphism & interface.
        payment.prosesPembayaran(jumlah);
    }
}