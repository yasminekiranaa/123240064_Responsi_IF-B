/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class MenuView {
    JLabel label;
    
    JButton btnDosen = new JButton("Data Dosen");
    
    JButton btnMahasiswa = new JButton("Data Mahasiswa");

    public MenuView() {
        String username = null;
        this.label = new JLabel (
                "Selamat Datang, " + username + "!"
        );
    }
}
