package Tugas12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";

    // Menyimpan daftar buku ke file teks
    public static void simpanKeFileTeks(List<Buku> daftarBuku) {
        try (FileWriter writer = new FileWriter(TEXT_FILE, true)) { // Append mode
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Daftar buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    // Menyimpan daftar buku ke file serialisasi
    public static void simpanKeFileSerial(List<Buku> daftarBuku) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    // Membaca daftar buku dari file teks
    public static void bacaDariFileTeks() {
        System.out.println("\nDaftar Buku dari File Teks:");
        File file = new File(TEXT_FILE);
        if (!file.exists()) {
            System.out.println("File teks belum dibuat.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks.");
            e.printStackTrace();
        }
    }

    // Membaca daftar buku dari file serialisasi
    @SuppressWarnings("unchecked")
    public static List<Buku> bacaDariFileSerial() {
        File file = new File(SERIAL_FILE);
        if (!file.exists() || file.length() == 0) {
            System.out.println("File serialisasi kosong atau belum dibuat.");
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            return (List<Buku>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca file serial.");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
