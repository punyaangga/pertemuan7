/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author Angga
 */
public class DuplikatKata {
        public static void main (String[] args) {
                                String [] data1 = {"Mobil","Motor","Becak","Handphone","Java","Informatika"};
                                String [] data2 = {"Saya","Memiliki","Satu","Motor","Merk","Mio","dan","Handphone","Informatika"};
                                System.out.print ("Data 1 = ");
                                for (int k = 0; k<data1.length; k++){
                                                System.out.print (data1[k] + " ");
                                }

                                System.out.print("\nData 2 = ");
                                for (int l = 0; l<data2.length; l++){
                                                System.out.print (data2[l] + " ");
                                }
                                System.out.print ("\nData yang sama = ");
                                for (int i = 0; i<data1.length; i++){
                                                for (int j = 0; j<data2.length; j++){
                                                                if (data1[i]==data2[j])
                                                                                System.out.print (data1[i] + ",");
                                                }
                                }             
}
    
}
