/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    // Menambah produk ke dalam keranjang
    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    // Menghitung total harga setelah diskon
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            double hargaSetelahDiskon = produk.getHarga() - produk.hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }

    // Menampilkan semua produk dalam keranjang
    public void tampilkanProduk() {
        for (Produk produk : produkList) {
            System.out.println("Nama: " + produk.getNama() + ", Harga: " + produk.getHarga() + ", Diskon: " + produk.hitungDiskon());
        }
    }
}

