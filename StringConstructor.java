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
public class StringConstructor {
    public static void main(String[] args) {
        char[] charArray = {'b','i','r','t','h',' ','d','a','y'};
        String s = new String("hello");
        String s1 = new String() ;
        String s2 = new String(s);
        String s3 =  new String(charArray);
        String s4 = new String(charArray,6,3);
         System.out.printf("s1 = %s \ns2 = %s\ns3 = %s\ns4 = %s\n",s1,s2,s3,s4);
    }
}
