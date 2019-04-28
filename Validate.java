/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
import java.util.Scanner;
/**
 *
 * @author Angga
 */
public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter first name :");
        String firstName=scanner.nextLine();
        System.out.println("Please enter Last Name");
        String lastName=scanner.nextLine();
        System.out.println("Please enter address");
        String address=scanner.nextLine();
        System.out.println("Please enter city");
        String city = scanner.nextLine();
        System.out.println("Please enter zip");
        String zip=scanner.nextLine();
        System.out.println("Please enter phone");
        String phone=scanner.nextLine();
        
        System.out.println("\n valudate Result :");
        if(!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if(!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name");
        else if (!ValidateInput.validateAddress(address))
            System.out.println("Invalid addres");
        else if (!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if (!ValidateInput.validateZip(zip))
            System.out.println("Invalid zip");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone");
        else
            System.out.println("Thankyou");
        
        
        
    
    }
}
