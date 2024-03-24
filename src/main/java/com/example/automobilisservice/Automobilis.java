package com.example.automobilisservice;
import java.util.Objects;

public class Automobilis {
    private int id;
    private String marke;
    private String modelis;
    private String valstybiniaiNumeriai;
    private String kuras;
    private int rida;

    // Constructor
    public Automobilis(int id, String marke, String modelis, String valstybiniaiNumeriai, String kuras, int rida) {
        this.id = id;
        this.marke = marke;
        this.modelis = modelis;
        this.valstybiniaiNumeriai = valstybiniaiNumeriai;
        this.kuras = kuras;
        this.rida = rida;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public String getValstybiniaiNumeriai() {
        return valstybiniaiNumeriai;
    }

    public void setValstybiniaiNumeriai(String valstybiniaiNumeriai) {
        this.valstybiniaiNumeriai = valstybiniaiNumeriai;
    }

    public String getKuras() {
        return kuras;
    }

    public void setKuras(String kuras) {
        this.kuras = kuras;
    }

    public int getRida() {
        return rida;
    }

    public void setRida(int rida) {
        this.rida = rida;
    }

    // hashCode, equals, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automobilis)) return false;
        Automobilis that = (Automobilis) o;
        return id == that.id &&
                rida == that.rida &&
                Objects.equals(marke, that.marke) &&
                Objects.equals(modelis, that.modelis) &&
                Objects.equals(valstybiniaiNumeriai, that.valstybiniaiNumeriai) &&
                Objects.equals(kuras, that.kuras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marke, modelis, valstybiniaiNumeriai, kuras, rida);
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "id=" + id +
                ", markė='" + marke + '\'' +
                ", modelis='" + modelis + '\'' +
                ", valstybiniaiNumeriai='" + valstybiniaiNumeriai + '\'' +
                ", kuras='" + kuras + '\'' +
                ", rida=" + rida +
                '}';
    }
}
