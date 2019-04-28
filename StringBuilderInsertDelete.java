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
public class StringBuilderInsertDelete {
    public static void main(String[] args) {
        Object objectRef="Hello";
         String string = "goodbye";
        char[] charArray={'a','b','c','d','e','f'};
        boolean booleanValue=true;
        char characterValue='K';
        int integerValue=7;
        long longValue=1000000000;
        float floatValue=2.5f;
        double doubleValue=33.333;
    
        StringBuilder buffer = new StringBuilder();
        
        buffer.insert(0, objectRef)
                .insert(0," ")
                .insert(0,string)
                .insert(0," ")
                .insert(0,charArray)
                .insert(0," ")
                .insert(0,charArray,3,3)
                .insert(0," ")
                .insert(0,booleanValue)
                .insert(0," ")
                .insert(0,characterValue)
                .insert(0," ")
                .insert(0,integerValue)
                .insert(0," ")
                .insert(0,longValue)
                .insert(0," ")
                .insert(0,floatValue)
                .insert(0," ")
                .insert(0,doubleValue);
        
        System.out.printf("Buffer after inserts : \n%s\n\n",buffer.toString());
        buffer.deleteCharAt(10);
        buffer.delete(2,6);
        
        System.out.printf("buffer after deletes:\n%s\n",buffer.toString());

    }
}
