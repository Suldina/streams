package com.company;

import java.io.FileInputStream;
import java.io.FileWriter;

public class CSVWritering {

    public  void writer(FileInputStream args) {


        CSVWriter writer = new CSVWriter(new FileWriter(csv));
    }
}
