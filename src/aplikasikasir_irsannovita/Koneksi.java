/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikasir_irsannovita;

//import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author User
 */
public class Koneksi {
    Connection koneksi = null;
    
    
    public static Connection koneksiDB() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_irsan_novita", "root","");
           return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
