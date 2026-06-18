package bagian3.kontak;

public class Kontak {
    private String nama;
    private String nomor;
    private String email; 

    // Constructor yang disesuaikan (Nama, Nomor, Email)
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    // Getter untuk email
    public String getEmail() {
        return email;
    }

    // Disesuaikan menjadi 3 bagian dipisah titik koma (;)
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Disesuaikan untuk menampilkan format informasi lengkap
    public String info() {
        return nama + " | Telp: " + nomor + " | Email: " + email;
    }
}