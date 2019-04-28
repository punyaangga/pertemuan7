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
public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1=  new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3= new StringBuilder("Hello");
        
        System.out.printf("buffer 1 = \"%s\"\n",buffer1);
        System.out.printf("buffer 2 = \"%s\"\n",buffer2);
        System.out.printf("buffer 3 = \"%s\"\n",buffer3);
    }
    
}
