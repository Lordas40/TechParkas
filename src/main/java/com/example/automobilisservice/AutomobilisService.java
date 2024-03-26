package com.example.automobilisservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AutomobilisService {
    private final String jsonFilePath = "C:/Users/lorda/OneDrive/Stalinis kompiuteris/St/Paskaitos/Programinės įrangos kūrimas/TechP/DB/Automobiliai.json";

    private ObjectMapper mapper = new ObjectMapper();

    public List<Automobilis> loadAutomobiliai() {
        try {
            return mapper.readValue(new File(jsonFilePath), new TypeReference<List<Automobilis>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Automobilis saveAutomobilis(Automobilis automobilis) {
        List<Automobilis> automobiliai = loadAutomobiliai();
        // Čia galite pridėti logiką naujo ID priskyrimui, jeigu automobilis neturi ID.
        automobiliai.add(automobilis);
        saveAutomobiliaiList(automobiliai);
        return automobilis;
    }

    private void saveAutomobiliaiList(List<Automobilis> automobiliai) {
        try {
            mapper.writeValue(new File(jsonFilePath), automobiliai);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
