/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author Lab Informatika
 */
public class DBConnection {
    Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/responsi_pbo_b",
            "root",
            ""
    );
}
