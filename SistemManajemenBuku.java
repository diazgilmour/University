package Tugas12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemManajemenBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Buku> daftarBuku = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru dan Simpan ke File Teks");
            System.out.println("2. Simpan Objek Buku ke File Serialisasi");
            System.out.println("3. Tampilkan Buku dari File Teks dan Serialisasi");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");

            try {
                int pilihan = Integer.parseInt(scanner.nextLine().trim());
                switch (pilihan) {
                    case 1:
                        tambahBuku(scanner, daftarBuku);
                        FileManager.simpanKeFileTeks(daftarBuku);
                        break;
                    case 2:
                        FileManager.simpanKeFileSerial(daftarBuku);
                        break;
                    case 3:
                        FileManager.bacaDariFileTeks();
                        List<Buku> bukuDariSerial = FileManager.bacaDariFileSerial();
                        System.out.println("\nDaftar Buku dari Serialisasi:");
                        for (Buku buku : bukuDariSerial) {
                            System.out.println(buku);
                        }
                        break;
                    case 4:
                        System.out.println("Keluar dari sistem.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan angka 1-4.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka saja.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner, List<Buku> daftarBuku) {
        try {
            System.out.print("Masukkan judul buku: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan pengarang buku: ");
            String pengarang = scanner.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            int tahunTerbit = Integer.parseInt(scanner.nextLine().trim());

            Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
            daftarBuku.add(bukuBaru);
            System.out.println("Buku berhasil ditambahkan.");
        } catch (NumberFormatException e) {
            System.out.println("Tahun terbit harus berupa angka.");
        }
    }
}
