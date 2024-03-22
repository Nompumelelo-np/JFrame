/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jframeletterdisplay;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Acer-User
 */
public class JframeLetterDisplay extends JFrame {
    private JLabel letterLabel;
    private int fontSize = 12;
    
    public JframeLetterDisplay() {
        setTitle("Letter Display");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        letterLabel = new JLabel("A", SwingConstants.CENTER);
        letterLabel.setFont(new Font("Arial", Font.PLAIN, fontSize));
        add(letterLabel, BorderLayout.CENTER);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                increaseFontSize();
            }
            
              });
    }
    
    private void increaseFontSize() {
        fontSize += 5;
        letterLabel.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }
    
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JframeLetterDisplay letterDisplay = new JframeLetterDisplay();
            letterDisplay.setVisible(true);
        });
    }
}
