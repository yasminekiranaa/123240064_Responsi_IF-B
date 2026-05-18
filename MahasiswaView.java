/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Lab Informatika
 */
public class MahasiswaView {
    insert mahasiswa{
        String sql = "INSERT INTO mahasiswa VALUES(NULL, ?, ?, ?)";

        PreparedStatement ps = config.prepareStatement(sql);

        ps.setint(1, id);
        ps.setString(2, nama);
        ps.setString(3, nim);

        ps.execute update();
    };
     
     update mahasiswa{
        String sql = "UPDATE mahasiswa SET nama=?, nidn=? WHERE id=?";
        
        PreparedStatement ps = config.prepareStatement(sql);
        
        ps.setint(1, id);
        ps.setString(2, nama);
        ps.setString(3, nim);

        ps.execute update();
    };
     
    delete mahasiswa{
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        
        PreparedStatement ps = config.prepareStatement(sql);
        
        ps.setint(1, id);
        
        ps.execute update();
    }
    
    search mahasiswa{
        String sql = "SELECT * FROM mahasiswa WHERE nama LIKE ? OR nim IKE ?";
        
        ps.setString(1, "%" + keyword + "%");
        ps.setString(2, "%" + keyword + "%");
    }
}
