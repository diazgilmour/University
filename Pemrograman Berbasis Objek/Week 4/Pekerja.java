/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author khrns
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    
    public Pekerja(String nama, int umur, String pekerjaan, int gaji) {
        super(nama, umur, pekerjaan);
        this.gaji = gaji;
    }
    
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    
    @Override
    public String toString() {
        return "Nama : " + getNama() + ", Usia : " + usia + ", Pekerjaan : " + pekerjaan + ", Gaji : " + gaji;
    }   
}
