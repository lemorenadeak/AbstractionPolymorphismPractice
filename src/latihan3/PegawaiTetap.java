package latihan3;

// Buat class PegawaiTetap extends Pegawai
public class PegawaiTetap extends Pegawai {
    private double bonusTahunan;

    // Constructor
    public PegawaiTetap(String nama, double gajiPokok, double bonusTahunan) {
        super(nama, gajiPokok); // Memanggil constructor Pegawai
        this.bonusTahunan = bonusTahunan;
    }

    // Override hitungGaji() dengan menambahkan bonus
    @Override
    public double hitungGaji() {
        // Memanggil method hitungGaji() dari parent (Pegawai)
        // lalu menambahkannya dengan bonus
        return super.hitungGaji() + bonusTahunan;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        // (Sesuai ekspektasi output)
        System.out.println("Pegawai Tetap: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok); // 'gajiPokok' bisa diakses karena 'protected'
        System.out.println("Bonus Tahunan: Rp " + bonusTahunan);
        System.out.println("Total Gaji: Rp " + hitungGaji()); // Memanggil hitungGaji() milik PegawaiTetap
    }
}