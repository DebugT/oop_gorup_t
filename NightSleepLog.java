/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapplication;

/**
 *
 * @author Tristan Odhiambo
 */
public class NightSleepLog extends RestLog {
    
    //data memebers
    private int qualityRating;
    private int interruptions;
    
    //overloaded constructor (inherting from parent class RestLog)
    public NightSleepLog(int qualityRating, int interruptions, String logID, String date, String notes, int durationMinutes) {
        super(logID, date, notes, durationMinutes);
        this.qualityRating = qualityRating;
        this.interruptions = interruptions;
    }
    
    //setters
    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }

    public void setInterruptions(int interruptions) {
        this.interruptions = interruptions;
    }
    
    //getters
    public int getQualityRating() {
        return qualityRating;
    }

    public int getInterruptions() {
        return interruptions;
    }
    
    
}
