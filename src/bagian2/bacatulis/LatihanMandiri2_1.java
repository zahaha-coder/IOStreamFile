package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2_1 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        // 5 nama hari
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile))) {
            for (String h : hari) {
                penulis.println(h);
            }
            System.out.println("Sukses menulis 5 nama hari ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // menampilkan ke layar
        System.out.println("\n====== ISI BERKAS " + namaFile.toUpperCase() + " ======");
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