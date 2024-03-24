package com.example.automobilisservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutomobilisService {
    @Value("${json.automobiliai.path}")
    private String automobiliaiJsonPath;


    private ObjectMapper mapper = new ObjectMapper();

    public List<Automobilis> loadAutomobiliai() {
        try {
            return mapper.readValue(new File(automobiliaiJsonPath), new TypeReference<List<Automobilis>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Automobilis saveAutomobilis(Automobilis automobilis) {
        List<Automobilis> automobiliai = loadAutomobiliai();
        automobiliai.add(automobilis);
        saveAutomobiliaiList(automobiliai);
        return automobilis;
    }

    public List<Automobilis> findAutomobiliaiByMarkeAndModelis(String marke, String modelis) {
        List<Automobilis> automobiliai = loadAutomobiliai();
        return automobiliai.stream()
                .filter(a -> a.getMarke().equals(marke) && a.getModelis().equals(modelis))
                .collect(Collectors.toList());
    }

    public Automobilis updateAutomobilis(int id, Automobilis automobilisDetails) {
        List<Automobilis> automobiliai = loadAutomobiliai();
        automobiliai.forEach(automobilis -> {
            if (automobilis.getId() == id) {
                automobilis.setMarke(automobilisDetails.getMarke());
                automobilis.setModelis(automobilisDetails.getModelis());
                automobilis.setValstybiniaiNumeriai(automobilisDetails.getValstybiniaiNumeriai());
                automobilis.setKuras(automobilisDetails.getKuras());
                automobilis.setRida(automobilisDetails.getRida());
            }
        });
        saveAutomobiliaiList(automobiliai);
        return automobilisDetails;
    }

    public String deleteAutomobilis(int id) {
        List<Automobilis> automobiliai = loadAutomobiliai();
        List<Automobilis> updatedList = automobiliai.stream()
                .filter(automobilis -> automobilis.getId() != id)
                .collect(Collectors.toList());
        saveAutomobiliaiList(updatedList);
        return "Automobilis su ID " + id + " ištrintas.";
    }

    private void saveAutomobiliaiList(List<Automobilis> automobiliai) {
        try {
            mapper.writeValue(new File(automobiliaiJsonPath), automobiliai);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Automobilis> sortAutomobiliai(String sortBy) {
        return null;
    }
}
