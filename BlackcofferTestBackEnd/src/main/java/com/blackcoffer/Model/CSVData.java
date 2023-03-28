package com.blackcoffer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 	
public class CSVData {

	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String end_year;
	    private String citylng;
	    private String citylat;
	    private String intensity;
	    private String sector;
	    private String topic;
	    
	    @Column(length = 500)
	    private String insight;
	    private String swot;
	    private String url;
	    private String region;
	    private String start_year;
	    private String impact;
	    private String added;
	    private String published;
	    private String city;
	    private String country;
	    private String relevance;
	    private String pestle;
	    private String source;
	    @Column(length = 500)
	    private String title;
	    private String likelihood;

	
	

	
}
