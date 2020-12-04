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
public class Bayar {
    private double berat,harga;

    Bayar(double berat, double harga) {
        this.berat=berat;
        this.harga=harga;
    }

    public double getBerat() {
        berat = 15.7;
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        harga = 570.000;
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double hitungemas(){
        
        return berat*harga;
    } 
    public void tampil(){
        System.out.println("Mahar Nikah =  "+ berat+" gram ");
        System.out.println("Harga =  "+"RP. "+ harga);
        System.out.println("Total bayar yang harus di keluarkan hendi = "+"Rp. "+hitungemas()+" juta ");
    }
}
