/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
import javax.swing.JOptionPane;
/**
 *
 * @author Angga
 */
public class Validasi {
     public static void main(String[] args) {
        
        String firstName=JOptionPane.showInputDialog(null,"Masukan Nama Depan : ");
        String lastName=JOptionPane.showInputDialog(null,"Masukan Nama Belakang : ");
        String address=JOptionPane.showInputDialog(null,"Masukan Alamat : ");
        String city = JOptionPane.showInputDialog(null,"Masukan Kota : ");
        String zip=JOptionPane.showInputDialog(null,"Masuka Kode Pos : ");
        String phone=JOptionPane.showInputDialog(null,"Masukan Nomor Telp : ");
        
        
        if(!ValidateInput.validateFirstName(firstName))
        JOptionPane.showMessageDialog(null,"Hasil Validasi : Nama Depan Salah");
        else if(!ValidateInput.validateLastName(lastName))
        JOptionPane.showMessageDialog(null,"Hasil Validasi : Nama Belakang Salah");
        else if (!ValidateInput.validateAddress(address))
            JOptionPane.showMessageDialog(null,"Hasil Validasi : Alamat Salah ");
        else if (!ValidateInput.validateCity(city))
            JOptionPane.showMessageDialog(null,"Hasil Validasi : Kota Salah ");
        else if (!ValidateInput.validateZip(zip))
            JOptionPane.showMessageDialog(null,"Hasil Validasi : Kode Pos Salah ");
        else if (!ValidateInput.validatePhone(phone))
        JOptionPane.showMessageDialog(null,"Hasil Validasi : Nomor Telp Salah ");
        else
            System.out.println("Terima Kasih");
        
        
        
    
    }
    
}
