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
    private JButton historyButton; // our Workout history button
    private JButton returnButton; // back
    
    public FitnessMenu() { // our constructor
        
        setSize(500, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // clear graphic resource
        
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
        //------------------------------------------------------
        historyButton = new JButton("Workout History");
        historyButton.setFocusPainted(false);
        historyButton.setBackground(new Color(20, 33, 54));
        historyButton.setForeground(Color.WHITE);
        //-------------------------------------------------------
        returnButton = new JButton("Back");
        returnButton.setFocusPainted(false);
        returnButton.setBackground(new Color(255, 255, 255));
        returnButton.setForeground(Color.BLACK);
        
        titleLabel.setBounds(175, 40, 200, 30);
        addButton.setBounds(150, 120, 200, 40);
        historyButton.setBounds(150, 180, 200, 40);
        returnButton.setBounds(150, 360, 200, 40);
        
        p.add(titleLabel);
        p.add(addButton);
        p.add(historyButton);
        p.add(returnButton);

 }
      
}
