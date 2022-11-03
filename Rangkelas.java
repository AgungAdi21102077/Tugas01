/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author Acer
 */
public class Rangkelas {
    private String Dosen, Siswa, Meja, Papan, Laptop;
    
    public void SetDosen(String dosen){
        this.Dosen = dosen;
    }
    public void SetSiswa(String siswa) {
        this.Siswa = siswa;
    }
    public void SetMeja(String meja) {
        this.Meja = meja;
    }
    public void SetPapan(String papan) {
        this.Papan = papan;
    }
    public void SetLaptop(String laptop) {
        this.Laptop = laptop;
    }
    public String GetDosen(){
        return this.Dosen;
    }
    public String GetSiswa(){
        return this.Siswa;
    }
    public String GetMeja(){
        return this.Meja;
    }
    public String GetPapan(){
        return this.Papan;
    }
    public String GetLaptop(){
        return this.Laptop;
    }
}
