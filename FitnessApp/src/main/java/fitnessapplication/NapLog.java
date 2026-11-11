/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapplication;

/**
 *
 * @author Tristan Odhiambo
 */
public class NapLog extends RestLog {
    
    //data memebers
    private String timeOfDay;
    private boolean feltRefreshed;
    
    //overloaded constructor (inheriting from parent class RestLog)
    public NapLog(String timeOfDay, boolean feltRefreshed, String logID, String date, String notes, int durationMinutes) {
        super(logID, date, notes, durationMinutes);
        this.timeOfDay = timeOfDay;
        this.feltRefreshed = feltRefreshed;
    }
    
    //setters
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public void setFeltRefreshed(boolean feltRefreshed) {
        this.feltRefreshed = feltRefreshed;
    }
    
    //getters
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public boolean isFeltRefreshed() {
        return feltRefreshed;
    }
    
    
    
}
