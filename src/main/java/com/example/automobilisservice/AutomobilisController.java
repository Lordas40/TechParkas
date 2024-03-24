package com.example.automobilisservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AutomobilisController {
    private final String jsonFilePath = "C:/Users/lorda/OneDrive/Stalinis kompiuteris/St/Paskaitos/Programinės įrangos kūrimas/TechP/TechParkas/src/main/resources/static/Automobiliai.json";
//"C:/Users/lorda/OneDrive/Stalinis kompiuteris/St/Paskaitos/Programinės įrangos kūrimas/TechP/TechParkas/src/main/resources/static/Automobiliai.json"
    // GET visi automobiliai
    @GetMapping
    public List<Automobilis> getAllAutomobiliai() {
        return JsonUtil.readAutomobiliaiFromFile(jsonFilePath);
    }
    @Autowired
    private AutomobilisService automobilisService;

    // Įrašyti naują automobilį
    @PostMapping("/addAutomobilis")
    public Automobilis addAutomobilis(@RequestBody Automobilis automobilis) {
        return automobilisService.saveAutomobilis(automobilis);
    }

    // Paieška automobilių pagal parametrus
    @GetMapping("/searchAutomobiliai")
    public List<Automobilis> searchAutomobiliai(@RequestParam(value = "marke", required = false) String marke,
                                                 @RequestParam(value = "modelis", required = false) String modelis) {
        return automobilisService.findAutomobiliaiByMarkeAndModelis(marke, modelis);
    }

    // Automobilio atnaujinimas
    @PutMapping("/updateAutomobilis/{id}")
    public Automobilis updateAutomobilis(@PathVariable int id, @RequestBody Automobilis automobilisDetails) {
        return automobilisService.updateAutomobilis(id, automobilisDetails);
    }

    // Automobilio šalinimas
    @DeleteMapping("/deleteAutomobilis/{id}")
    public String deleteAutomobilis(@PathVariable int id) {
        return automobilisService.deleteAutomobilis(id);
    }

    // Gautojo automobilių sąrašo rūšiavimas
    // Priklausomai nuo poreikio, ši funkcija gali reikalauti papildomos logikos.
    @GetMapping("/sortAutomobiliai")
    public List<Automobilis> sortAutomobiliai(@RequestParam(value = "sortBy") String sortBy) {
        return automobilisService.sortAutomobiliai(sortBy);

    }

}
