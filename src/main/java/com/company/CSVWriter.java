package com.company;

import com.opencsv.CSVWriter;

import java.io.FileInputStream;
import java.io.FileWriter;

public class CSVWritering {

    public  void writer(FileInputStream args) {


        CSVWriter writer = new CSVWriter(new FileWriter(csv));
    }
}
