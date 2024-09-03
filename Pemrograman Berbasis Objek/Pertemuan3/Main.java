/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) { 
        Mobil diaz = new Mobil("Honda", "Brio", 2024, "Coklat");
        diaz.displayInfo();
        
        diaz.setWarna("Putih");
        
        System.out.println("Warna mobil setelah perubahan warna : ");
        diaz.displayInfo();
    }
    
}
