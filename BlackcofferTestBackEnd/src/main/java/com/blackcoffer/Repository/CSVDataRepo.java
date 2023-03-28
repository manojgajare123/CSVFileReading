package com.blackcoffer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackcoffer.Model.CSVData;

public interface CSVDataRepo extends JpaRepository <CSVData, Integer> {

}
