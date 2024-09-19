/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author khrns
 */
public class Kucing extends Mamalia {
    String suara;
    
    @Override
    public void InfoHewan() {
        super.InfoHewan();
        System.out.println("Suara kucing: " + suara);
    }
    
}
