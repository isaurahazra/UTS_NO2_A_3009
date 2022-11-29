/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.teoripbo.commissionemployee;

/**
 *
 * @author Lenovo
 */
public class SalariedEmployee {
    String nama_3009;
    int nip_3009;
    double upahMingguan_3009;
    private double GajiSalariedEmploye;
    
    
    
    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        return GajiSalariedEmploye = upahMingguan_3009;
    }
    
    public void cetakSalariedEmployee(){
        System.out.println(" \n");
        System.out.println(" Data Commission Employee \n");
        System.out.println("Nama :"+nama_3009);
        System.out.println("NIP :"+nip_3009);
        System.out.println("gaji Pokok :"+upahMingguan_3009);
    }  
}

    

