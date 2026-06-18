package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor lengkap
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk akses data atribut
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah objek menjadi baris teks berpemisah titik koma (;) untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan keterangan lengkap barang untuk ditampilkan ke layar
    public String info() {
        return "Nama: " + nama + " | Harga: Rp" + harga + " | Stok: " + stok;
    }
}