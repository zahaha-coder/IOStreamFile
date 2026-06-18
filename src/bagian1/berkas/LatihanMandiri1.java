package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        // objek File yang menunjuk laporan.txt
        File berkas = new File("laporan.txt");
        
        // Tampilkan berkas tersebut ada, dan jika ada tampilkan ukurannya dalam byte
        if (berkas.exists()) {
            System.out.println("Berkas laporan.txt ada, ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
    }
}