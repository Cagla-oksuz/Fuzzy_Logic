/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev_1;

import java.net.URISyntaxException;

/**
 *
 * @author Çağla Oksuz
 */
public class BloodOutputModel extends BloodModel {

    public double calculatedOutputD;
    public double getCalculatedOutputD(){
        return this.calculatedOutputD;
    }
    //For the calculated output
    public void setCalculatedOutputD(double out) {
        this.calculatedOutputD = out;
    }
    
    public boolean getCalculatedOutput(){
        return Math.round(this.calculatedOutputD) == 1;
    }
    //For the actual output
    public BloodOutputModel(int recency, int frequency, int time, boolean output) throws URISyntaxException {
        super(recency, frequency, time, output);

    }

    @Override
    public String toString() {
        String cikti = "CalculatedOutput :" + getCalculatedOutput() + " " + super.toString();
        return cikti;
    }

}
