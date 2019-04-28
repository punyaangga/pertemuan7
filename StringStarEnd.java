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
public class StringStarEnd {
    public static void main(String[] args) {
        String [] strings = {"started","starting","ended","ending"};
        for ( String string : strings) {
            if(string.startsWith("st"))
                System.out.printf("\"%s\"Starts with \"st\"\n",string);
            
        }
        System.out.println();
        for (String string : strings) {
            if(string.startsWith("art",2))
                System.out.printf("\"%s\"Starts with \"art\"at position 2\n",string);
        }
        System.out.println();
        for (String string : strings) {
            if(string.endsWith("ed"))
                System.out.printf("\"%s\"ends with \"ed\"\n",string);
            
        }
    }
}
