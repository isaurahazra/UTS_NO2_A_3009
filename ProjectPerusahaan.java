/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.teoripbo.commissionemployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class ProjectPerusahaan {
    public static void main(String[] args) throws IOException {
        SalariedEmployee S = new SalariedEmployee();
        CommissionEmployee C = new CommissionEmployee();
        ProjectPlanner P = new ProjectPlanner();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        try{
           S.nama_3009 = "Isaura";
           S.nip_3009  = 21103009;
           S.upahMingguan_3009 = 1500000; 
        
           C.nama_3009 = "Hazra";
           C.nip_3009 = 21103008;
           C.gajiPokok_3009 = 4000000;
           C.komisi_3009 = 1000000;
           C.totalPenjualan_3009 = 100;
           
           P.nama_3009 = "Cantik";
           P.nip_3009 = 21103007;
           P.gajiPokok_3009 = 3000000;
           P.komisi_3009 = 500000;
           P.totalHasilProyek_3009 = 150;
           
           S.cetakSalariedEmployee();
           System.out.println("");
           C.cetakCommissionEmployee();
           System.out.println("");
           P.cetakProjectPlanner();
            System.out.println("");
        }  
    catch(Exception ex){
            System.out.println(ex);
        }
    }
}