/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class LoginController {
    if(username.isEmpty() || password.isEmpty(){
            JOptionPane.showMessageDialog(
                    view, 
                    "Fiels Kosong!"
            );
            
    return;
    }
    
    boolean cek = dao.login(UsernameCallback, password);
    
    if(cek) {
        new MenuView(username);
        view.dispose();
    } else {
        JOptionPane.showMessageDialog(
        view,
        "Username/password salah!"
        );
    });
}
