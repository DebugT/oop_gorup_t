/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapplication;

/**
 *
 * @author Tristan Odhiambo
 */
public class RestLog {
    
    //data memebers
    private String logID;
    private String date;
    private String notes;
    private int durationMinutes;
    
    //overloaded constructor 
    public RestLog(String logID, String date, String notes, int durationMinutes) {
        this.logID = logID;
        this.date = date;
        this.notes = notes;
        this.durationMinutes = durationMinutes;     
    }

    //setters
    
    public void setLogID(String logID) {
        this.logID = logID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    
    //getters
    public String getLogID() {
        return logID;
    }

    public String getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
    
    
}
