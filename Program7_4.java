/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Angga
 */
public class Program7_4 {
 
    public static void main(String[] args) {
        Random ran =  new Random();
        Scanner in = new Scanner(System.in);
        int a=ran.nextInt(10);
        int b=ran.nextInt(10);
        int kurang,kali,tambah,bagi,mod;
        int m1,m2,m3,m4,m5;
    System.out.print("Soal 1 : "+a+" + "+b+" = ");
    m1=in.nextInt();
    System.out.print("Soal 2 : "+a+ " x "+b+" = ");
    m2=in.nextInt();
    System.out.print("Soal 3 : "+a+" / "+b+" = ");
    m3=in.nextInt();
    System.out.print("Soal 4 : "+a+" - "+b+" = ");
    m4=in.nextInt();
    System.out.print("Soal 5 : "+a+" % "+b+" = ");
    m5=in.nextInt();
    
    tambah = a+b;
    kali = a*b;
    kurang = a-b;
    mod = a%b;
    bagi = a/b;
    
    System.out.println("Hasil : ");
    if (m1==tambah)
            System.out.println("Soal Nomor 1 Benar");
    else
            System.out.println("Soal Nomor 1 Salah");
    
    if(m2 == kali)
            System.out.println("Soal Nomor 2 Benar");
    else
            System.out.println("Soal Nomor 2 Salah");
    
    if (m3==bagi)
            System.out.println("Soal Nomor 3 Benar");
    else
            System.out.println("Soal Nomor 3 Salah");
    
    if(m4==kurang)
            System.out.println("Soal Nomor 4 Benar");
    else
            System.out.println("Soal Nomor 4 Salah");
    
    if(m5==mod)
            System.out.println("Soal Nomor 5 Benar");
    else
            System.out.println("Soal Nomor 5 Salah");
}
}
