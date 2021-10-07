/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev_1;

import java.net.URISyntaxException;
import java.util.List;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import java.util.Random;

/**
 *
 * @author Çağla Oksuz
 */
public class BulanikOdev_1 {

    /**
     * @param args the command line arguments
     * @throws java.net.URISyntaxException
     */
    public static void main(String[] args) throws URISyntaxException {
          //Reading a file
        csvReader csv = new csvReader();
        //Retrieves data read from file for a list
        List<BloodOutputModel> out = csv.calculatedModel("Blood.csv");

       
        Blood_fis r;
        double err = 0;
        int conterr = 0;

        //I make it loop through all the data like foreach
        int i = 0;
        for (BloodOutputModel bom : out) {
           
            r = new Blood_fis(bom.getFrequency(), bom.getTime(), bom.getRecency());            
            bom.setCalculatedOutputD(r.getSonucD());
            
            
           
            int output = bom.getOutput() == true ? 1 : 0;       
           
            int calculatedOutput = bom.getCalculatedOutput() == true ? 1 : 0;
          
           if (output != calculatedOutput) {
                conterr++;
                err += Math.abs((output - calculatedOutput)/ 1);
            }
          
          
            System.out.println(bom);
              i++;
           int rnd;
           rnd=((int)(Math.random()*748));
           //To plot my member functions
        if (i == rnd) {
           
             
         Blood_fis t = new Blood_fis(bom.getFrequency(), bom.getTime(), bom.getRecency());
         JFuzzyChart.get().chart(t.getModel());
        }
        }
        
        
      
       //double mse = err/out.size();
       
        //to suppress the result
       double mape =  100*err/out.size();
        System.out.println("Hata Hesabı : ");
        System.out.println("Mape :"+ mape );
      
      //  System.out.println( " -hatalı kayıt: " +conterr);
    }
    


}
