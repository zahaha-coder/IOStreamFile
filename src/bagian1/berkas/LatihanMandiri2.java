package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        // Buat folderbernama arsip menggunakan method mkdir()
        File folder = new File("arsip");
        boolean hasil = folder.mkdir();
        
        // Tampilkan pesan berhasil atau gagal berdasarkan nilai kembalian
        if (hasil) {
            System.out.println("Sukses: Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Gagal: Folder 'arsip' gagal dibuat (atau folder sudah ada sebelumnya).");
        }
    }
}