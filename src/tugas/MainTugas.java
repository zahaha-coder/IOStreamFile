package tugas;

// Nama: M Reza Maulani Aditya
// NPM: 2410010638

public class MainTugas {
    public static void main(String[] args) {
        
        // 1. Menyimpan daftar nama kategori dalam sebuah array String ukuran tetap (minimal 3)
        String[] kategori = {"Elektronik", "Pakaian", "Makanan", "Alat Tulis"};
        System.out.println("====== KATEGORI TOKO ======");
        for (String kat : kategori) {
            System.out.println("- " + kat);
        }
        System.out.println();


        // 2. Membuat objek Gudang pertama dan menambahkan minimal 5 objek Barang
        Gudang gudangUtama = new Gudang("barang.txt");
        
        gudangUtama.tambahBarang(new Barang("Laptop ASUS", 9500000, 4));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 200000, 15));
        gudangUtama.tambahBarang(new Barang("Keyboard Mechanical", 550000, 8));
        gudangUtama.tambahBarang(new Barang("Monitor LED 24'", 1850000, 6));
        gudangUtama.tambahBarang(new Barang("Headset Gaming", 400000, 10));

        // Menampilkan data awal dan menyimpannya ke berkas teks barang.txt
        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();


        // 3. Membuat objek Gudang baru untuk membuktikan pembacaan load data berkas berhasil
        System.out.println("--- PENGUJIAN OBJEK GUDANG BARU (BUKTI PENYIMPANAN) ---");
        Gudang gudangBaru = new Gudang("barang.txt");
        
        // Memuat kembali data dari berkas teks
        gudangBaru.muatDariBerkas();
        
        // Menampilkan kembali datanya ke layar console
        gudangBaru.tampilkanSemua();
        
        // Menampilkan total nilai persediaan (Harga * Stok) dari gudang baru
        System.out.printf("Total Nilai Persediaan Gudang: Rp%,.0f%n", gudangBaru.totalNilai());
    }
}