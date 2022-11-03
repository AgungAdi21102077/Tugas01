/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas1;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Tugas1 {

    public static void main(String[] args) {
    System.out.println("Hello World!");
    Rangkelas RNK = new Rangkelas ();
    Scanner dtIN = new Scanner(System.in);
    
    
    System.out.print("Input Nama Dosen :");
    String NAMA = dtIN.nextLine();
    RNK.SetDosen(NAMA);
    
    System.out.print("Input Nama Siswa: ");
    String siswa = dtIN.nextLine();
    RNK.SetDosen(siswa);
    
    System.out.print("Input Jenis Meja : ");
    String meja = dtIN.nextLine();
    RNK.SetMeja(meja);
    
    System.out.print("Input Jenis Papan: ");
    String papan = dtIN.nextLine();
    RNK.SetPapan(papan);
    
    System.out.print("Input Nama Laptop: ");
    String laptop = dtIN.nextLine();
    RNK.SetLaptop(laptop);
    
 
    }
}
