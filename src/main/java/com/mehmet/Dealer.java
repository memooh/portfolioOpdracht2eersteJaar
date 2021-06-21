package com.mehmet;

abstract class Dealer {
    private String voornaam;
    private String achternaam;
    private String email;
    private Integer leeftijd;
    private Accountant accountant;
    private IT it;
    private String nname;

    public Dealer (String nname, int keuze){

    }

    public Dealer(String voornaam, String achternaam, String email, Integer leeftijd) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.leeftijd = leeftijd;


    }

    public abstract String getOrderLine ();


    public String getOrder () {

        String gkeuze = "\r\n===============================================\r\n";
        gkeuze += getOrderLine ();

        if (accountant != null) {
            gkeuze += accountant.getOrderLine ();
        }

        if (it != null) {
            gkeuze += it.getOrderLine ();
        }

        return gkeuze + "===============================================";
    }



    public void dDealer(){
        System.out.println("Dealer heet: " + this.getVoornaam() + " " + this.getAchternaam());
        System.out.println("De/het/it email van de/het/it dealer is: " + this.getEmail());
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }
}