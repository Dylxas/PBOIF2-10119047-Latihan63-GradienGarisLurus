/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan63.gradiengarislurus;

import data.Koordinat;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG GRADIEN GARIS LURUS
 */

public class PBOIF210119047Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (" + koordinat1.getX1() + "," 
                                                        + koordinat1.getY1() + ") dan (" 
                                                        + koordinat1.getX2() + "," 
                                                        + koordinat1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + koordinat1.hitungGradien());
        
        System.out.println();

        
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + koordinat2.getX1() + "," 
                                                        + koordinat2.getY1() + ") dan (" 
                                                        + koordinat2.getX2() + "," 
                                                        + koordinat2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + koordinat2.hitungGradien());
    }
    
}
