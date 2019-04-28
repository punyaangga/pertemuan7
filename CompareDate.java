/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Angga
 */
public class CompareDate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("1999-03-31");
        Date date2 = sdf.parse("2019-04-28");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }

    }
    
}
