/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Çağla Oksuz
 */
public class csvReader {
    
    //Reading a file
    public  List<BloodOutputModel> calculatedModel(String fileName) throws URISyntaxException {
        
        
        List<BloodOutputModel> model = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

       
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            //read line
            String line = br.readLine();

            //Continues if the line is not empty
            while (line != null) {

                
                String[] attributes = line.split(";");

               BloodOutputModel row = createData(attributes);

                //Adds the model in the dataset to the list
                model.add(row);

                //moves to the next line each time
                line = br.readLine();
            }       
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return model;
    }
    
    //For new output after reading the file
    private BloodOutputModel createData(String[] metadata) throws URISyntaxException {
        int recency = Integer.parseInt(metadata[0]);
        int frequency = Integer.parseInt(metadata[1]);
        int time = Integer.parseInt(metadata[2]);
        boolean output = Integer.parseInt(metadata[3]) == 1;
     
        // create and return book of this metadata
        return new BloodOutputModel(recency, frequency, time, output);
    }
}
