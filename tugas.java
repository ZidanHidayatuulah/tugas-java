/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Praktek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
  String jalurmasuk,golongan = null,SBMPTN,SNMPTN,MANDIRI,dsp,spp,a,b,c ;
   
    
    
    
        System.out.println("masuk lewat jalur mana anda ?");
        System.out.println("-SBMPTN");
        System.out.println("-SNMPTN");
        System.out.println("-MANDIRI");
        jalurmasuk=input.nextLine();
        
        if(jalurmasuk.equalsIgnoreCase("SBMPTN")&&golongan.equalsIgnoreCase("a")){
            System.out.println("dsp=5000000,spp=500000");
        }else if(jalurmasuk.equalsIgnoreCase("SBMPTN")&&golongan.equalsIgnoreCase("b")){
            System.out.println("dsp=15000000,spp=1000000");
        }else if(jalurmasuk.equalsIgnoreCase("SBMPTN")&&golongan.equalsIgnoreCase("c")){
            System.out.println("dsp=30000000,spp=2000000");
        }else if(jalurmasuk.equalsIgnoreCase("SNMPTN")&&golongan.equalsIgnoreCase("a")){
            System.out.println("dsp=7000000,spp=500000");
        }else if(jalurmasuk.equalsIgnoreCase("SNMPTN")&&golongan.equalsIgnoreCase("b")){
            System.out.println("dsp=17000000,spp=1000000");
        }else if(jalurmasuk.equalsIgnoreCase("SNMPTN")&&golongan.equalsIgnoreCase("c")){
            System.out.println("dsp=35000000,spp=2000000");
        }else if(jalurmasuk.equalsIgnoreCase("MANDIRI")&&golongan.equalsIgnoreCase("a")){
            System.out.println("dsp=10000000,spp=1000000");
        }else if(jalurmasuk.equalsIgnoreCase("MANDIRI")&&golongan.equalsIgnoreCase("b")){
            System.out.println("dsp=25000000,spp=2000000");
        }else if(jalurmasuk.equalsIgnoreCase("SNMPTN")&&golongan.equalsIgnoreCase("c")){
            System.out.println("dsp=50000000,spp=3000000");
        }
        }
    }

        
    
