package com.blackcoffer.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.blackcoffer.Model.CSVData;


public interface CSVDataService {

	public String processCsvFile(MultipartFile file) throws Exception;
	public List<CSVData> getData() throws Exception;
	
}
