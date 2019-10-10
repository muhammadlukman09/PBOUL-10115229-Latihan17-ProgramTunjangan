/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan17.programtunjangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
       

/**
 *
 * @author Lukman
 * NIM          : 10115229
 * NAMA         : MUHAMMAD LUKMAN HAKIM
 */

import javax.swing.*;
public class PBOUL10115229Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaS = JOptionPane.showInputDialog(" Nama Anda =  "  );
            String jabatanS = JOptionPane.showInputDialog (" Jabatan =  ");
            String statusS= JOptionPane.showInputDialog("Status: \n1:Nikah \n2:Belum Nikah");
            String jumlahjkS = JOptionPane.showInputDialog (" Jumlah jam Kerja =  ");
            String jmlJAS= JOptionPane.showInputDialog("Masukan Jumlah Anak: ");
            int  jumlahjk =Integer.parseInt(jumlahjkS);
            int  status =Integer.parseInt(statusS);
            int  jmlJA =Integer.parseInt(jmlJAS);
            //int jabatan = Integer.parseInt(jabatanS );

            
            float Gaji,Tunj,ppn,total,gaji,up,ul,jlb,ta,gajibersih,tjg;
            gaji=0;
            total=0;

             
            if (jabatanS.equals ("Direktur")) 
            {
                ul = 25000;
                up = 20000;
                Gaji = 3000000;
                Tunj = 1/(float)100  * Gaji;
            }
            else if (jabatanS.equals("Manager")) 
            {
                ul = 20000;
                up = 15000;
                Gaji = 2000000;

                Tunj = 5/(float)100* Gaji;
            }
            else if (jabatanS.equals("Karyawan")) 
            {
                ul = 15000;
                up = 10000;
                Gaji = 1000000;
                Tunj = 1/(float)100* Gaji;
            }            
            else
            {
                ul = 10000;
                up = 5000;
                Gaji = 800000;
                Tunj =1/(float)100* Gaji;
            }


            
            if(status==1)                         //jika status Nikah
            { 
                tjg=250000;                //tungjangan=250000
            } 
            else 
                tjg=0;        



            if(jmlJA >= 3)                        //jika jumlah anak >= 3
            { 
                ta=4*150000;                //maka dapat 150000 * 4
            } 
             else 
                {
                 ta=jmlJA * 150000;            //jika punya anak hanya 1 atau 2 maka hanya dikali Rp150000
                }            



            if (40 <= jumlahjk)                    //jika karyawan kerja kurang/lebih 40 jam
            { 
                jlb=jumlahjk-40;                    //maka Inputan (Jmljk - 40)
                gaji=(up*40) + (ul*jlb);        //cara perhitungan , (up) * 40 ditambah (ul)*jlb
            } 
            else
                jlb=0;                        //jika karyawan tidak bekerja lebih dari 40 jam" maka tdk dapat bonus
                gaji = up*jumlahjk;                //hanya karyawan mendapat up*jumlah jam kerja
                            

            
            ppn = (1/(float)100)*Gaji;
            gajibersih = ta +  Tunj +gaji+tjg;
            total = gajibersih- ppn;

            System.out.print(" Nama Anda =  "+namaS  );
            System.out.print("\n\n Jabatan =   "+jabatanS);
            System.out.print("\n \n Tunjangan Jabatan : Rp."+Tunj);
            System.out.println("\n\nJumlah Jam Lembur: "+jlb);
            System.out.print("\n\nJumlah Jam Lembur: "+gajibersih);
            System.out.print("\n\nPPN 10 % : Rp."+ppn);
            System.out.print("\n \nTotal Gaji : Rp."+total);

            System.out.println("\n\n");
        
    }
    
}
