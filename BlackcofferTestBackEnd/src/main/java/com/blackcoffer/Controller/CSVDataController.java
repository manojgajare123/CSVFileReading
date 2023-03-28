package com.blackcoffer.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.blackcoffer.Model.CSVData;
import com.blackcoffer.Model.CSVDataDTO;
import com.blackcoffer.Service.CSVDataService;


@CrossOrigin
@Controller
@RequestMapping(value = "/api")
public class CSVDataController {

	@Autowired
    private CSVDataService csvService;

   
//    public CSVDataController(CSVDataService csvService) {
//        this.csvService = csvService;
//    }

//    @PostMapping(value = "/csv")
//    public ResponseEntity<String> handleCsvFile(@RequestPart("file") MultipartFile file) {
//        try {
//            csvService.processCsvFile(file);	
//            return ResponseEntity.ok("File processed successfully");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing file: " + e.getMessage());
//        }
//    }
	
	@PostMapping(value = "/csv")
	public ResponseEntity<String> handleCsvFile(@RequestPart("file") MultipartFile file) {
	    if (file == null || file.isEmpty()) {
	        return ResponseEntity.badRequest().body("No file uploaded");
	    }
	    try {
	        csvService.processCsvFile(file);
	        System.out.println(file);
	        return ResponseEntity.ok("File processed successfully");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing file: " + e.getMessage());
	    }
	}	
	
	@GetMapping("/data")
	public ResponseEntity<List<CSVDataDTO>> getData() {
	    try {
	        List<CSVData> csvDataList = csvService.getData();
	        List<CSVDataDTO> dataDTOList = new ArrayList<>();
	        for (CSVData csvData : csvDataList) {
	            CSVDataDTO dataDTO = new CSVDataDTO();
	            dataDTO.setId(csvData.getId());
	            dataDTO.setIntensity(csvData.getIntensity());
	            dataDTO.setLikelihood(csvData.getLikelihood());
	            dataDTO.setRelevance(csvData.getRelevance());
	            dataDTO.setYear(csvData.getEnd_year());
	            dataDTO.setCountry(csvData.getCountry());
	            dataDTO.setTopics(csvData.getTopic());
	            dataDTO.setRegion(csvData.getRegion());
	            dataDTO.setSector(csvData.getSector());
	            dataDTO.setCity(csvData.getCity());
	            dataDTOList.add(dataDTO);
	        }
	        return ResponseEntity.ok(dataDTOList);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}
//    Intensity
//-        Likelihood
//-        Relevance
//-        Year
//-        Country
//-        Topics
//-        Region
//-        City

}














