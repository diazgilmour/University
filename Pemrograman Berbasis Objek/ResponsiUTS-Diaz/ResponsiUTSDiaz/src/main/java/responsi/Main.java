/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        
        Pegawai budi = new PegawaiTetap("Budi", 5000000, 1000000);
        Pegawai andi = new PegawaiKontrak("Andi", 3000000, 12);
        
        System.out.println("Output Produk : ");
        laptop.tampilkanInfo();
        
        System.out.println("\nOutput Pegawai : ");
        budi.tampilkanInfo();
        
        System.out.println("\nOutput Polimorfisme : ");
        snack.tampilkanInfo();
        System.out.println("                ");
        andi.tampilkanInfo();
        
        
        
    }
    
}
