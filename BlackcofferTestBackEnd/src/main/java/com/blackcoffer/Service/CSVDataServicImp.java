package com.blackcoffer.Service;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.blackcoffer.Model.CSVData;
import com.blackcoffer.Repository.CSVDataRepo;
import com.opencsv.CSVReader;

@Service
public class CSVDataServicImp implements CSVDataService {

    @Autowired
    private CSVDataRepo csvDataRepo;
    
    
    @Override
    public String processCsvFile(MultipartFile file) throws Exception {
        List<CSVData> csvDataList = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new InputStreamReader(file.getInputStream()))) {
            String[] header = reader.readNext(); // read the header row
            String[] row;

            while ((row = reader.readNext()) != null) {
                // create an instance of your model class and set its properties using the values in the row
                CSVData obj = new CSVData();
                obj.setEnd_year(row[0]);
                obj.setCitylng(row[1]);
                obj.setCitylat(row[2]);
                obj.setIntensity(row[3]);
                obj.setSector(row[4]);
                obj.setTopic(row[5]);
                obj.setInsight(row[6]);
                obj.setSwot(row[7]);
                obj.setUrl(row[8]);
                obj.setRegion(row[9]);
                obj.setStart_year(row[10]);
                obj.setImpact(row[11]);
                obj.setAdded(row[12]);
                obj.setPublished(row[13]);
                obj.setCity(row[14]);
                obj.setCountry(row[15]);
                obj.setRelevance(row[16]);
                obj.setPestle(row[17]);
                obj.setSource(row[18]);
                obj.setTitle(row[19]);
                obj.setLikelihood(row[20]);

                csvDataList.add(obj);
            }
        } catch (IOException e) {
            throw new Exception("Error processing file: " + e.getMessage());
        }

        csvDataRepo.saveAll(csvDataList);
        return "OK";
    }


    @Override
    public List<CSVData> getData() throws Exception {
        try {
            return csvDataRepo.findAll();
        } catch (Exception e) {
            throw new Exception("Error retrieving data: " + e.getMessage());
        }
    }
    }