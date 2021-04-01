//public class oldMain {
//    public static void main(String[] args) {
//        Voertuig voertuig1 = new Voertuig("Audi", 100);
//        voertuig1.setSoort("Auto");
//        voertuig1.Opslag();
//        voertuig1.printSoort();
//
//        Voertuig voertuig2 = new Voertuig("Tommy", 30);
//        voertuig2.setSoort("Scooter");
//        voertuig2.Opslag();
//        voertuig2.printSoort();
//
//        Baas baas1 = new Baas(true);
//
//        Dealer dealer1 = new Dealer("Mehmet", "Ozturk", "m.ovdb@outlook.com", 20);
//        dealer1.Baas();
//    }
//}
//
//abstract class soortVoertuig {
//    private String soort;
//
//    public abstract void Opslag();
//
//    public void printSoort() {
//        System.out.println("unknown");
//    }
//
//    public String getSoort() {
//        return soort;
//    }
//
//    public void setSoort(String soort) {
//        this.soort = soort;
//    }
//}
//
//class Voertuig extends soortVoertuig {
//    private String name;
//    private Integer kmStand;
//    private Voertuig has;
//
//    public Voertuig(String name, Integer kmStand) {
//        this.name = name;
//        this.kmStand = kmStand;
//    }
//
//    @Override
//    public void printSoort() {
//        System.out.println("Voertuigtype is: " + getSoort());
//    }
//
//    @Override
//    public void Opslag() {
//        System.out.println("De voertuig is een " + getName() + " en heeft een kilometer stand van: " + getKmStand() + " km");
//    }
//
//    public Integer getKmStand() {
//        return kmStand;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setKmStand(Integer kmStand) {
//        this.kmStand = kmStand;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Baas {
//    private Boolean isBaas;
//
//    public Baas(Boolean isBaas) {
//        this.isBaas = isBaas;
//    }
//
//    public Boolean getBaas() {
//        return isBaas;
//    }
//
//    public void setBaas(Boolean baas) {
//        isBaas = baas;
//    }
//}
//
//class Dealer  {
//    private String voornaam;
//    private String achternaam;
//    private String email;
//    private Integer leeftijd;
//    private Baas isBaas;
//
//    public Dealer(String voornaam, String achternaam, String email, Integer leeftijd) {
//        this.voornaam = voornaam;
//        this.achternaam = achternaam;
//        this.email = email;
//        this.leeftijd = leeftijd;
//    }
//
//    public void Baas(){
//        System.out.println("De baas is: " + isBaas.getBaas());
//    }
//
//    public Integer getLeeftijd() {
//        return leeftijd;
//    }
//
//    public String getAchternaam() {
//        return achternaam;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getVoornaam() {
//        return voornaam;
//    }
//
//    public void setAchternaam(String achternaam) {
//        this.achternaam = achternaam;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setLeeftijd(Integer leeftijd) {
//        this.leeftijd = leeftijd;
//    }
//
//    public void setVoornaam(String voornaam) {
//        this.voornaam = voornaam;
//    }
//
//}
//
//class Dealership{
//    private String naam;
//    private String locatie;
//    private Dealer is;
//
//    public Dealership(String naam, String locatie, Dealer is) {
//        this.naam = naam;
//        this.locatie = locatie;
//        this.is = is;
//    }
//
//    public String getNaam() {
//        return naam;
//    }
//
//    public void setNaam(String naam) {
//        this.naam = naam;
//    }
//
//    public String getLocatie() {
//        return locatie;
//    }
//
//    public void setLocatie(String locatie) {
//        this.locatie = locatie;
//    }
//}