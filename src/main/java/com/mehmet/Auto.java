package com.mehmet;

class Auto extends Voertuig {
    private Integer kmStand;
    private Integer aantalDeuren;

    public Auto(String name, Integer kmStand, Integer aantalDeuren) {
        super(name);
        this.aantalDeuren = aantalDeuren;
        this.kmStand = kmStand;
    }

    @Override
    public void Opslag() {
        System.out.println("Auto heeft merk "+ this.getVoertuigName());
        System.out.println("Heeft als kilometerstand: " + this.getKmStand());
        System.out.println("En heeft zoveel deuren: " + this.getAantalDeuren());
    }

    public Integer getKmStand() {
        return kmStand;
    }

    public void setKmStand(Integer kmStand) {
        this.kmStand = kmStand;
    }

    public Integer getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(Integer aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

}