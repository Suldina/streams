package com.company;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       FileInputStream fstream = new FileInputStream("chr1.subst.fa");
       BufferedReader  bfreader = new BufferedReader (new InputStreamReader(fstream);
       CSVWriter fileCSV = new CSVWriter(new FileWriter("chr2.subst.csv")));
       String strLine;
       List<String> linkedList = new LinkedList<>();

       while ((strLine = bfreader.readLine())!=null) {
           if (strLine.contains("AGAAGGGA")) {

           }
          linkedList.add(strLine);
       }
       fileCSV.writeAll(linkedList<String>);

    }


}
