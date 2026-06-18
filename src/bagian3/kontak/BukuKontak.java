package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BukuKontak {
    private ArrayList<Kontak> daftar = new ArrayList<>();
    private String namaBerkas;

    public BukuKontak(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahKontak(Kontak kontak) {
        daftar.add(kontak);
    }

    public void tampilkanSemua() {
        System.out.println("====== DAFTAR KONTAK ======");
        if (daftar.isEmpty()) {
            System.out.println("(Buku kontak kosong)");
        } else {
            for (int i = 0; i < daftar.size(); i++) {
                System.out.println((i + 1) + ". " + daftar.get(i).info());
            }
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Kontak k : daftar) {
                penulis.println(k.keBaris());
            }
            System.out.println("Sukses: Kontak disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    public void muatDariBerkas() {
        daftar.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                // Cek apakah data pecah menjadi 3 bagian (nama, nomor, email)
                if (bagian.length == 3) {
                    daftar.add(new Kontak(bagian[0], bagian[1], bagian[2]));
                }
            }
            System.out.println("Sukses: Kontak dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat berkas: " + e.getMessage());
        }
    }

    public int jumlahKontak() {
        return daftar.size();
    }

    //Method Cari Kontak
    public void cariKontak(String nama) {
        System.out.println("Mencari kontak dengan nama [" + nama + "]...");
        for (Kontak k : daftar) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                System.out.println("-> DITEMUKAN: " + k.info());
                return; // Keluar dari method jika ketemu
            }
        }
        System.out.println("-> KETERANGAN: Kontak '" + nama + "' tidak ditemukan.");
    }

    //Method Hapus Kontak
    public void hapusKontak(String nama) {
        System.out.println("Mencoba menghapus kontak [" + nama + "]...");
        boolean ditemukan = false;
        
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getNama().equalsIgnoreCase(nama)) {
                daftar.remove(i);
                ditemukan = true;
                System.out.println("-> Berhasil menghapus kontak '" + nama + "' dari list.");
                break; // Hentikan loop setelah menghapus
            }
        }
        
        if (ditemukan) {
            //simpanKeBerkas
            simpanKeBerkas();
        } else {
            System.out.println("-> KETERANGAN: Gagal menghapus, kontak '" + nama + "' tidak terdaftar.");
        }
    }
}