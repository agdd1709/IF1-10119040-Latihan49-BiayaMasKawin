/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan49.biayamaskawin;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menghitung biaya mas kawin
 * dengan metode pendekatan berbasis objek
 */
public class IF110119040Latihan49BiayaMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bayar bayar = new Bayar(15.7,570.000);
        bayar.getBerat();
        bayar.getHarga();
        bayar.hitungemas();
        bayar.tampil();
    }
    
}
