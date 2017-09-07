package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) throws IOException {
//        String line;
        FileInputStream file = new FileInputStream("numbers.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));

//        List<Integer> list = new ArrayList<>();
//
//        while ((line = br.readLine()) != null)   {
//            String[] Array = line.split(",");
//            for (String s: Array) {
//                list.add(Integer.parseInt(s.trim()));
//            }
//        }

        List<Integer> list = br.lines()
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .map(s -> Integer.parseInt(s.trim()))
                .collect(Collectors.toList());

        br.close();

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}