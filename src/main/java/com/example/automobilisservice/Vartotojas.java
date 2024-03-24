package com.example.automobilisservice;

import java.util.Objects;

public class Vartotojas {
    private int id;
    private String vardas;
    private String pavarde;
    private String elPastas;

    // Constructor
    public Vartotojas(int id, String vardas, String pavarde, String elPastas) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.elPastas = elPastas;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getElPastas() {
        return elPastas;
    }

    public void setElPastas(String elPastas) {
        this.elPastas = elPastas;
    }

    // hashCode, equals, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vartotojas)) return false;
        Vartotojas that = (Vartotojas) o;
        return id == that.id &&
                Objects.equals(vardas, that.vardas) &&
                Objects.equals(pavarde, that.pavarde) &&
                Objects.equals(elPastas, that.elPastas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vardas, pavarde, elPastas);
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavardė='" + pavarde + '\'' +
                ", elPaštas='" + elPastas + '\'' +
                '}';
    }
}
