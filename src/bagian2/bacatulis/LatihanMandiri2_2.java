package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2_2 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";

        // 1. Tambahkan (append) 2 nama hari lagi dengan parameter true pada FileWriter
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile, true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Sukses menambahkan 2 hari baru (append).");
        } catch (IOException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }

        // setelah di-append
        System.out.println("\n====== ISI BERKAS SETELAH APPEND ======");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}