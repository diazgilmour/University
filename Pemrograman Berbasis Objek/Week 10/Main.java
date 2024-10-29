/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) {
        
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();
        
        double hargaElektronik = 1000000;
        double hargaMakanan = 500000;
        
        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        System.out.println("Pajak untuk pembayaran Elektronik: Rp " + pajakElektronik);
        
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);
        System.out.println("Pajak untuk oembayaran Makanan: Rp " + pajakMakanan);
    }
    
}
