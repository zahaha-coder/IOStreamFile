package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2_3 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        int jumlahBaris = 0;

        // Membaca berkas sambil menghitung baris
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Selesai membaca berkas.");
            System.out.println("Jumlah banyak baris di dalam berkas " + namaFile + " : " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Gagal membaca berkas: " + e.getMessage());
        }
    }
}