package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // 1. Buat buku kontak utama dan isi data
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));

        // Cetak data awal dan simpan ke file
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        //Buat objek buku baru untuk membuktikan load berkas 3 kolom sukses
        System.out.println("--- Menguji Load Berkas Baru ---");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println();

        //cariKontak
        System.out.println("--- Menguji Fitur Cari Kontak  ---");
        bukuLain.cariKontak("Budi"); // Kasus ketemu
        bukuLain.cariKontak("Zaki"); // Kasus tidak ketemu
        System.out.println();

        //hapusKontak
        System.out.println("--- Menguji Fitur Hapus Kontak ---");
        bukuLain.hapusKontak("Andi"); // Menghapus andi dan otomatis simpan file
        System.out.println();
        
        //daftar akhir 
        System.out.println("--- Hasil Akhir Setelah Penghapusan ---");
        bukuLain.tampilkanSemua();
    }
}