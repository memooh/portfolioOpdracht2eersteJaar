package com.mehmet;

import java.util.ArrayList;

class Dealership {
    private String naam;
    private String wachtwoord;
    private String locatie;
    private ArrayList<Dealer> hasA = new ArrayList<>();

    public Dealership(String naam, String locatie, String wachtwoord) {
        this.naam = naam;
        this.wachtwoord = wachtwoord;
        this.locatie = locatie;
    }

    public void addDealer(Dealer dealer) {
        hasA.add(dealer);
    }

    public void getDealers() {
        for (Dealer m : hasA) {
            System.out.println(m.getVoornaam() + " " + m.getAchternaam());
        }
    }

    public ArrayList<Dealer> getHasA() {
        return hasA;
    }

    public void dLocatie(){
        System.out.println("Locatie is: " + this.getLocatie());
        System.out.println("En de naam van deze franchise is " + this.getNaam());
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLocatie() {
        return locatie;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public boolean isPasswordCorrect (String wachtwoord) {
        return wachtwoord.equals (this.wachtwoord);
    }
}
