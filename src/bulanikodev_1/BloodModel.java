/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev_1;

import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author Çağla Oksuz
 *
 */
public class BloodModel {
    //I defined a variable for the values in the data set
    private int recency;
    private int frequency;
    private int time;
    private boolean output;
    
    //I added get methods to be able to read
    public int getRecency() {
        return this.recency;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public int getTime() {
        return this.time;
    }

    public boolean getOutput() {
        return this.output;
    }

    //constructor 
    public BloodModel(int recency, int frequency, int time, boolean output) throws URISyntaxException {
        this.recency = recency;
        this.frequency = frequency;
        this.time = time;
        this.output = output;
    }

     
    @Override
    public String toString() {
        String cikti = "[output: " + this.output + " recency: " + this.recency + ", frequency: " + this.frequency
                + ", time: " + this.time + "]" ;
       
        return cikti;
    }
}
