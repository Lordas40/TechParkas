package com.example.automobilisservice;

import java.util.Objects;

public class ServisoIrasas {
    private int id;
    private int automobilioId;
    private String servisoData;
    private String atliktasDarbas;
    private String komentarai;

    // Constructor
    public ServisoIrasas(int id, int automobilioId, String servisoData, String atliktasDarbas, String komentarai) {
        this.id = id;
        this.automobilioId = automobilioId;
        this.servisoData = servisoData;
        this.atliktasDarbas = atliktasDarbas;
        this.komentarai = komentarai;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutomobilioId() {
        return automobilioId;
    }

    public void setAutomobilioId(int automobilioId) {
        this.automobilioId = automobilioId;
    }

    public String getServisoData() {
        return servisoData;
    }

    public void setServisoData(String servisoData) {
        this.servisoData = servisoData;
    }

    public String getAtliktasDarbas() {
        return atliktasDarbas;
    }

    public void setAtliktasDarbas(String atliktasDarbas) {
        this.atliktasDarbas = atliktasDarbas;
    }

    public String getKomentarai() {
        return komentarai;
    }

    public void setKomentarai(String komentarai) {
        this.komentarai = komentarai;
    }

    // hashCode, equals, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServisoIrasas)) return false;
        ServisoIrasas that = (ServisoIrasas) o;
        return id == that.id &&
                automobilioId == that.automobilioId &&
                Objects.equals(servisoData, that.servisoData) &&
                Objects.equals(atliktasDarbas, that.atliktasDarbas) &&
                Objects.equals(komentarai, that.komentarai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, automobilioId, servisoData, atliktasDarbas, komentarai);
    }

    @Override
    public String toString() {
        return "ServisoIrašas{" +
                "id=" + id +
                ", automobilioId=" + automobilioId +
                ", servisoData='" + servisoData + '\'' +
                ", atliktasDarbas='" + atliktasDarbas + '\'' +
                ", komentarai='" + komentarai + '\'' +
                '}';
    }
}
