/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) {
        Pekerja worker = new Pekerja("Diaz", 21, "Bos Muda", 999999999);
        
        System.out.println("Informasi Pekerja Awal : ");
        System.out.println(worker.toString());
        
        worker.setNama("Ridho");
        
        System.out.println("\nInformasi Pekerja Setelah Nama Diubah : ");
        System.out.println(worker.toString());
        
        
        System.out.println(worker.nama);  // Tidak bisa diakses karena private
        System.out.println(worker.usia);  // Bisa diakses karena protected
        System.out.println(worker.gaji);  // Tidak bisa diakses karena private
    } 
}
