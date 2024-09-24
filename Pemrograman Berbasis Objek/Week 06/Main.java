/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        
        Buku buku1 = new Buku("Java Programming", 100000, 10); 
        Elektronik elektronik1 = new Elektronik("Smartphone", 3000000, 15); 
        Pakaian pakaian1 = new Pakaian("Jacket", 250000, 20); 

        
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        
        keranjang.tampilkanProduk();

        
        double total = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total Harga Setelah Diskon: " + total);
    }
}
