package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        // Buat objek File sementara.txt
        File berkasSementara = new File("sementara.txt");
        
        try {
            // Membuat berkas fisik di disk
            berkasSementara.createNewFile();
            
            // status  berkas sebelum dihapus
            System.out.println("Sebelum dihapus, ada? " + berkasSementara.exists());
            
            // Hapus dengan method delete()
            berkasSementara.delete();
            
            //  status berkas sesudah dihapus
            System.out.println("Sesudah dihapus, ada? " + berkasSementara.exists());
            
        } catch (IOException e) {
            System.out.println("Kesalahan IO: " + e.getMessage());
        }
    }
}