/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.teoripbo.commissionemployee;

/**
 *
 * @author Lenovo
 */
public class ProjectPlanner {
    String nama_3009;
    int nip_3009;
    double gajiPokok_3009;
    double komisi_3009;
    double totalHasilProyek_3009;
    private double GajiProjectPlanner_3009;
    private double pajak_3009;

    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        pajak_3009 = (0.05 * gajiPokok_3009);
        GajiProjectPlanner_3009 = gajiPokok_3009 + (komisi_3009*totalHasilProyek_3009) - pajak_3009;
        return GajiProjectPlanner_3009;
    }
    
    public void cetakProjectPlanner(){
        System.out.println(" \n");
        System.out.println(" Data Project Planner \n");
        System.out.println("Nama :"+nama_3009);
        System.out.println("NIP :"+nip_3009);
        System.out.println("gaji Pokok :"+gajiPokok_3009);
        System.out.println("Komisi : "+komisi_3009);
        System.out.println("Total Hasil Proyek :"+totalHasilProyek_3009);

    }
}



