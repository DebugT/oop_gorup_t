/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapplication;

import javax.swing.*;
import java.awt.event.*; // listener for buttons
import java.awt.Color; // settings for color
import java.awt.Font; // settings for font

/**
 *
 * @author alexk
 */
public class WorkoutHistory extends JFrame {

    private JPanel p;
    private JLabel titleLabel;
    private JTextArea workoutArea;
    
    private JLabel searchLabel;
    private JTextField searchField;
    
    private JButton searchButton;
    private JButton deleteButton;
    
    private JButton returnButton; // back
    
    public WorkoutHistory() {

    setSize(500, 500);
    setLocation(10, 10);

    p = new JPanel();
    p.setLayout(null);
    add(p);
    
    //--------------------------------------------
    
    searchLabel = new JLabel("Search:");
    searchField = new JTextField();
    
    //-------------------------------------------
    searchButton = new JButton("Search");
    searchButton.setFocusPainted(false); // remove border near text
    searchButton.setBackground(new Color(51, 150, 67)); // color
    searchButton.setForeground(Color.WHITE);
    //--------------------------------------------
    
    deleteButton = new JButton("Delete");
    deleteButton.setFocusPainted(false); // remove border near text
    deleteButton.setBackground(new Color(107, 32, 32)); // color
    deleteButton.setForeground(Color.WHITE);
    //----------------------------------------------
    returnButton = new JButton("Back");
    returnButton.setFocusPainted(false);
    returnButton.setBackground(new Color(255, 255, 255));
    returnButton.setForeground(Color.BLACK);
    //---------------------------------------------------------
    workoutArea = new JTextArea();
    //---------------------------------------------------------
    titleLabel = new JLabel("Workout History");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
    //---------------------------------------------------------


    // configure cordinats
    
    
    
    searchLabel.setBounds(50, 70, 100, 30);
    searchField.setBounds(150, 70, 250, 30);

    titleLabel.setBounds(175, 10, 200, 30);
    workoutArea.setBounds(50, 120, 400, 220);
    
    searchButton.setBounds(50, 360, 180, 40);
    deleteButton.setBounds(270, 360, 180, 40);
    
    returnButton.setBounds(150, 410, 200, 40);

    p.add(searchLabel);
    p.add(searchField);
    
    p.add(titleLabel);
    p.add(workoutArea);
    
    p.add(searchButton);
    p.add(deleteButton);
    
    p.add(returnButton);

//-----------------------
        returnButton.addActionListener(new ActionListener() { // listener-event

          public void actionPerformed(ActionEvent event) {
             returnButtonActionPerformed(event);
        }

     });

}
    
        //--------------------------------
        private void returnButtonActionPerformed(ActionEvent event) {

          FitnessMenu menu = new FitnessMenu();
          menu.setVisible(true); // "show" our new window
          setVisible(false); // "close" our current window

    }
    
}
