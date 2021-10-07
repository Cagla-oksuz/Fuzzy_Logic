/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev_1;

import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author Çağla Öksüz
 */
public class Blood_fis {

    //I created a fis file
    private FIS fis;
    private double frequency;
    private double recency;
    private double time;
    public double degis;

    public Blood_fis(double frequency, double time, double recency) throws URISyntaxException {
        this.frequency = frequency;
        this.recency = recency;
        this.time = time;

        File dosya = new File(getClass().getResource("model.fcl").toURI());
        fis = FIS.load(dosya.getPath());
        fis.setVariable("frequency", frequency);
        fis.setVariable("time", time);
        fis.setVariable("recency", recency);
        fis.evaluate();
    }

    public FIS getModel() {
        return fis;
    }

    @Override
    public String toString() {
        String cikti = "Frequency :" + frequency + "time : " + time + "Recency :" + recency;
        cikti += "\nSONUC ::" + fis.getVariable("sonuc").getValue();
        return cikti;
    }
    //calculates if the value is true false
    public boolean getSonuc() {
        return Math.round(fis.getVariable("sonuc").getValue()) == 1;
    }
    //calculated 
    public double getSonucD() {
        return fis.getVariable("sonuc").getValue();
    }

}
