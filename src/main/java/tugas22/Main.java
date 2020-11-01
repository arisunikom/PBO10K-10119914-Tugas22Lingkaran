/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas22;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author
 * Aris Prabowo
 * IF10K - 10119914
 */
public class Main {
    public static void RumusLingkaran(float Diameter){
        float JariJari;
        JariJari = Diameter/2;
        String Luas = String.format("%.2f", 3.14*JariJari*JariJari);
        String Keliling = String.format("%.2f", 3.14*Diameter);
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Jari-Jari Lingkaran: "+JariJari+" Cm");
        System.out.println("Luas Lingkaran: "+Luas+" Cm");
        System.out.println("Keliling Lingkaran: "+Keliling+" Cm");
    }
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        float Diameter;
        boolean IsDiameterValid = false;
        while(!IsDiameterValid)
        {
            try {
                System.out.println("Masukan Diameter Lingkaran: ");
                Diameter = Keyboard.nextFloat();
                IsDiameterValid = true;
                RumusLingkaran(Diameter);
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                Keyboard.next();
            }
        }
    }
    
}
