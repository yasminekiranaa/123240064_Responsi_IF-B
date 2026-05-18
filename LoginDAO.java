/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Lab Informatika
 */
public class LoginDAO {
    String sql = "Select * FROM users WHERE username=? AND password=?";
    
    PreparedStatement ps = config.prepareStatement(sql);
    
    ps.setString(1, username);
    ps.setString(2, password);
    
    ResultSet rs = ps.executeQuery();
    
    return rs.next();
}
