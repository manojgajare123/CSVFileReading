package com.blackcoffer.CSVRead;

import com.blackcoffer.Model.CSVData;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReading {

    public void readCSV(String filePath) {
        
//    //	String filePath="C:\\Users\\HP\\Desktop\\RevisionUnit\\BlackcofferTest\\Assets\\Data.csv";
//        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
//            String[] header = reader.readNext(); // read the header row
//            String[] row;
//            
//            while ((row = reader.readNext()) != null) {
//                // create an instance of your model class and set its properties using the values in the row
//                CSVData obj = new CSVData();
//                obj.setEnd_year(row[0]);
//                obj.setCitylng(row[1]);
//                obj.setCitylat(row[2]);
//                obj.setIntensity(row[3]);
//                obj.setSector(row[4]);
//                obj.setTopic(row[5]);
//                obj.setInsight(row[6]);
//                obj.setSwot(row[7]);
//                obj.setUrl(row[8]);
//                obj.setRegion(row[9]);
//                obj.setStart_year(row[10]);
//                obj.setImpact(row[11]);
//                obj.setAdded(row[12]);
//                obj.setPublished(row[13]);
//                obj.setCity(row[14]);
//                obj.setCountry(row[15]);
//                obj.setRelevance(row[16]);
//                obj.setPestle(row[17]);
//                obj.setSource(row[18]);
//                obj.setTitle(row[19]);
//                obj.setLikelihood(row[20]);
//                
//                // do something with the object, like adding it to a list
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
