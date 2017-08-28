package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

       BufferedReader  bfreader = new BufferedReader (new InputStreamReader(new FileInputStream ("chr1.subst.fa")));


        CSVWritering fileCSV = new CSVWritering(bfreader)
    }


}
