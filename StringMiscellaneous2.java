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
public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Goodbye";
        String s3 = " Spaces ";
        
        System.out.printf("s1 = %s\ns2 = %s\n\n",s1,s2,s3);
        System.out.printf("Replace 'l' with 'L' in s1: %s\n\n",s1.replace('l','L'));
        System.out.printf("s1.toUpperCase() = %s\n",s1.toUpperCase());
        System.out.printf("s2.toLowercase() = %s\n\n",s2.toLowerCase());
        System.out.printf("s3 after trim = \"%s\"\n\n",s3.trim());
        
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");
        for (char character : charArray) 
            System.out.print(character);
        
        System.out.println();
        
        
    }
}
