/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author khrns
 */
public class Main {
    public static void main(String[] args) {
        Kucing anggora = new Kucing();
        anggora.nama = "Juli";
        anggora.jenis = "Anggora";
        anggora.suara = "Meong-Meong";
        anggora.ciri = "Mengeong";
        System.out.println("Info Kucing");
        anggora.InfoHewan();
        
        Anjing pudel = new Anjing();
        pudel.nama = "Chess";
        pudel.jenis = "Pudel";
        pudel.suara = "Guk-Guk";
        pudel.ciri = "Mengaing";
        System.out.println("\nInfo Anjing");
        pudel.InfoHewan();
        
        Mamalia gajah = new Mamalia();
        gajah.nama = "Gembrot";
        gajah.jenis = "Gajah Mada";
        gajah.ciri = "Belalai";
        System.out.println("Info Mamalia");
        gajah.InfoHewan();
    }
    
}
