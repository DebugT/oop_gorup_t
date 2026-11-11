/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sasha-Clover
 */

package fitness;

import fitnessapplication.MainMenu;
import javax.swing.*;
import java.awt.event.*; // listener for buttons
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
        
         // configure our cordinates
        
        titleLabel.setBounds(175, 10, 200, 30);
        
        addButton.setBounds(150, 120, 200, 60);
        historyButton.setBounds(150, 220, 200, 60);
        
        returnButton.setBounds(150, 380, 200, 40);
        
        p.add(titleLabel);
        p.add(addButton);
        p.add(historyButton);
        
        p.add(returnButton);
        
        //-----
        
        addButton.addActionListener(new ActionListener() { // listener-event

          public void actionPerformed(ActionEvent event) {
             addButtonActionPerformed(event);
        }

     });
        //-----
        historyButton.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent event) {
             historyButtonActionPerformed(event);
        }

     });
     
        returnButton.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent event) {
             returnButtonActionPerformed(event);
    }

});

 }
    //--------------------------------
      private void addButtonActionPerformed(ActionEvent event) {

        AddWorkout workout = new AddWorkout();
        workout.setVisible(true); // "show" our new window
        setVisible(false); // "close" our fitnessmenu window

    }
      private void historyButtonActionPerformed(ActionEvent event) {

        WorkoutHistory history = new WorkoutHistory();
        history.setVisible(true); // "show" our new window
        setVisible(false); // "close" our fitnessmenu window

    }
      
      private void returnButtonActionPerformed(ActionEvent event) {

        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        setVisible(false);

}
    //----------------------------------
      
}
