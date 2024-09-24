/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author ASUS
 */
class Pakaian extends Produk {
    private double diskon; // dalam persen

    public Pakaian(String nama, double harga, double diskon) {
        super(nama, harga);
        this.diskon = diskon;
    }

    @Override
    public double hitungDiskon() {
        return harga * (diskon / 100);
    }
}

