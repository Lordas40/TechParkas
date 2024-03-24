package com.example.automobilisservice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Automobilis> readAutomobiliaiFromFile(String filePath) {
        try {
            return List.of(mapper.readValue(new File(filePath), Automobilis[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of(); // Grąžina tuščią sąrašą klaidos atveju
        }
    }
}
