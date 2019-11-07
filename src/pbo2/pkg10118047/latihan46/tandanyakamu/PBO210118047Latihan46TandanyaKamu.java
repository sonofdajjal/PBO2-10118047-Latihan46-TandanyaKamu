/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class PBO210118047Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        // TODO code application logic here
        Age age = new Age(yearNow);
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(input.nextInt());
        
        int umur = age.hitungUmur();
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahum Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari Ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(umur));
        
    }
    
}
