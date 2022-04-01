package com.company;

public class Samochod {
    private String nrRej;
    private String marka;

    public Samochod(String nrRej, String marka) {
        this.nrRej = nrRej;
        this.marka = marka;
    }

    public String getNrRej() {
        return this.nrRej;
    }

    public String getMarka() {
        return this.marka;
    }

    public String toString(){
        return "Numer rejestracyjny: " + this.nrRej + " Marka: " + this.marka;
    }
}
