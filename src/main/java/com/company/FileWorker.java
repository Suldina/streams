package com.company;

import com.opencsv.CSVWriter;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public class FileWorker {
    public static void main(String[] args) throws IOException {
        String fileName = "chr1.subst.fa";
        String fileName2 = "chr2.subst.csv"

        String pattern = "AGAAGGGA";
        int subsstringsCout = 0;

        List<String> linesFromFile = readFromFile(fileName);

        for(String item: linesFromFile) {
            subsstringsCout += getCountSubstringInString(item, pattern);
        }
        System.out.println(subsstringsCout);
    }

    public static List<String> readFromFile(String fileName) throws IOException{
        List<String> linkedList = new LinkedList<>();

        try (BufferedReader bfreader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)))) {
            String strLine;
            while ((strLine = bfreader.readLine()) != null) {
                linkedList.add(strLine);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(format("file [%s] not found", fileName));
        }
        return linkedList;
    }

    public static int getCountSubstringInString(String string, String patternValue) {
        int counter = 0;
        Pattern pattern = Pattern.compile(patternValue, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
