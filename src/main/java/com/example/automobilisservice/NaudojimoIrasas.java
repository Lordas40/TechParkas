package com.example.automobilisservice;

import java.util.Objects;

public class NaudojimoIrasas {
    private int id;
    private int automobilioId;
    private int vartotojoId;
    private String naudojimoData;
    private int pravaziuotasAtstumas;

    // Constructor
    public NaudojimoIrasas(int id, int automobilioId, int vartotojoId, String naudojimoData, int pravaziuotasAtstumas) {
        this.id = id;
        this.automobilioId = automobilioId;
        this.vartotojoId = vartotojoId;
        this.naudojimoData = naudojimoData;
        this.pravaziuotasAtstumas = pravaziuotasAtstumas;
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

    public int getVartotojoId() {
        return vartotojoId;
    }

    public void setVartotojoId(int vartotojoId) {
        this.vartotojoId = vartotojoId;
    }

    public String getNaudojimoData() {
        return naudojimoData;
    }

    public void setNaudojimoData(String naudojimoData) {
        this.naudojimoData = naudojimoData;
    }

    public int getPravaziuotasAtstumas() {
        return pravaziuotasAtstumas;
    }

    public void setPravaziuotasAtstumas(int pravaziuotasAtstumas) {
        this.pravaziuotasAtstumas = pravaziuotasAtstumas;
    }

    // hashCode, equals, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaudojimoIrasas)) return false;
        NaudojimoIrasas that = (NaudojimoIrasas) o;
        return id == that.id &&
                automobilioId == that.automobilioId &&
                vartotojoId == that.vartotojoId &&
                pravaziuotasAtstumas == that.pravaziuotasAtstumas &&
                Objects.equals(naudojimoData, that.naudojimoData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, automobilioId, vartotojoId, naudojimoData, pravaziuotasAtstumas);
    }

    @Override
    public String toString() {
        return "NaudojimoIrašas{" +
                "id=" + id +
                ", automobilioId=" + automobilioId +
                ", vartotojoId=" + vartotojoId +
                ", naudojimoData='" + naudojimoData + '\'' +
                ", pravažiuotasAtstumas=" + pravaziuotasAtstumas +
                '}';
    }
}
