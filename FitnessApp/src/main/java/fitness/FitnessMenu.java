/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sasha-Clover
 */

package fitness;

import javax.swing.*;
import java.awt.Color; // settings for color
import java.awt.Font; // settings for font


public class FitnessMenu extends JFrame {
    
    private JPanel p; // panel with our elements
    private JLabel titleLabel; // the title "Fitness Tracker"
    private JButton addButton; // add button
    
    public FitnessMenu() { // our constructor
        
        setSize(500, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        p = new JPanel();
        p.setLayout(null);
        add(p);
        
        titleLabel = new JLabel("Fitness Tracker");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        //------------------------------------------------------
        addButton = new JButton("Add Workout");
        addButton.setFocusPainted(false); // remove border near text
        addButton.setBackground(new Color(46, 204, 113)); // color
        addButton.setForeground(Color.WHITE);
        
        titleLabel.setBounds(175, 40, 200, 30);
        addButton.setBounds(150, 120, 200, 40);
        
        p.add(titleLabel);
        p.add(addButton);

 }
      
}
