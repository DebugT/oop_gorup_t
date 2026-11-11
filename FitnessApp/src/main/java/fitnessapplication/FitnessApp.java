/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fitnessapplication;

/**
 *
 * @author alexk
 */
public class FitnessApp {

    public static void main(String[] args) {
        // main menu init & display
        MainMenu mainMenu = new MainMenu(); // create object our window
        mainMenu.setVisible(true); // show our window
        
        FitnessMenu menu = new FitnessMenu(); // create object our window
        menu.setVisible(false); // show our window
        
        AddWorkout workout = new AddWorkout();
        workout.setVisible(false);
        
        WorkoutHistory history = new WorkoutHistory();
        history.setVisible(false);
        
        
        
    }
}
