/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Lab Informatika
 */
public class DosenView {
     insert dosen{
        String sql = "INSERT INTO dosen VALUES(NULL, ?, ?, ?)";

        PreparedStatement ps = config.prepareStatement(sql);

        ps.setint(1, id);
        ps.setString(2, nama);
        ps.setString(3, nidn);

        ps.execute update();
    };
     
     update dosen{
        String sql = "UPDATE dosen SET nama=?, nidn=? WHERE id=?";
        
        PreparedStatement ps = config.prepareStatement(sql);
        
        ps.setint(1, id);
        ps.setString(2, nama);
        ps.setString(3, nidn);

        ps.execute update();
    };
     
    delete dosen{
        String sql = "DELETE FROM dosen WHERE id=?";
        
        PreparedStatement ps = config.prepareStatement(sql);
        
        ps.setint(1, id);
        
        ps.execute update();
    }
    
    search dosen{
        String sql = "SELECT * FROM dosen WHERE nama LIKE ? OR nidn IKE ?";
        
        ps.setString(1, "%" + keyword + "%");
        ps.setString(2, "%" + keyword + "%");
    }
}
