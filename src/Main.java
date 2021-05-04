import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Auto voor test
        Auto auto1 = new Auto("BMW", 120000, 2);
        auto1.Opslag();

        System.out.println("-------------------------------------------");

        Auto auto2 = new Auto("Audi", 89000, 4);
        auto2.Opslag();

        System.out.println("-------------------------------------------");

        // Scooter voor test
        Scooter scooter1 = new Scooter("Vespa", 50, 200);
        scooter1.Opslag();

        System.out.println("-------------------------------------------");

        //Dealership locatie uitprinten
        Dealership dlship1 = new Dealership("Fontiona", "Kosovo");
        dlship1.dLocatie();

        System.out.println("-------------------------------------------");

        //Dealer uitprinten
        Dealer dealer1 = new Dealer("Mehmet", "Ozturk", "20129947@student.hhs.nl", 20);
        dealer1.dDealer();
        Dealer dealer2 = new Dealer("Robin", "Hood", "test@test.nl", 211);
        dealer2.dDealer();


        System.out.println("----------------------TESTING TESTING TESTING---------------------");

        dlship1.addDealer(dealer1);
        dlship1.addDealer(dealer2);
        dlship1.getDealers();

        Scooter scooby = new Scooter("Scooby",20,10);

        auto1.startEngine();
        scooby.startEngine();

        System.out.println("-------------------------------------------");

    }
}

class Dealer {
    private String voornaam;
    private String achternaam;
    private String email;
    private Integer leeftijd;

    public Dealer(String voornaam, String achternaam, String email, Integer leeftijd) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.leeftijd = leeftijd;
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

class Dealership {
    private String naam;
    private String locatie;
    private ArrayList<Dealer> hasA = new ArrayList<>();

    public Dealership(String naam, String locatie) {
        this.naam = naam;
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

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

}

abstract class Voertuig{
    private String name;
    private Dealership has;

    public abstract void Opslag();

    public Voertuig(String name) {
        this.name = name;
    }

    public String getVoertuigName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dealership getHas() {
        return has;
    }

    public void setHas(Dealership has) {
        this.has = has;
    }

    public void startEngine() {
        System.out.println("starting engine....");
    }
}

class Scooter extends Voertuig {
    private Integer torquePower;
    private Integer cilinder;

    public Scooter(String voertuigName, Integer torquePower, Integer cilinder) {
        super(voertuigName);
        this.cilinder = cilinder;
        this.torquePower = torquePower;
    }

    @Override
    public void startEngine() {
        System.out.println(this.getVoertuigName() + " starts engine");
    }

    public Integer getTorquePower() {
        return torquePower;
    }

    public void setTorquePower(Integer torquePower) {
        this.torquePower = torquePower;
    }

    public Integer getCilinder() {
        return cilinder;
    }

    public void setCilinder(Integer cilinder) {
        this.cilinder = cilinder;
    }

    @Override
    public void Opslag() {
        System.out.println("Scooter heeft merk "+ this.getVoertuigName() + ".");
        System.out.println("Heeft zoveel " + this.getCilinder() + " cilinders,");
        System.out.println("en heeft zoveel " + this.getTorquePower() + " torque.");
    }

}

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

class Prijs {
    private Integer aantal;

    public Prijs(Integer aantal) {
        this.aantal = aantal;
    }

    public double getPrijs(int prijs) {
        int dealpercentage = 0;
        double total = 0.00;

        if (prijs > 1000 && prijs <= 14000) {
            dealpercentage = 20;
        }

        if (prijs > 0 && prijs<= 1000) {
            dealpercentage = 40;
        }

        for (int i = 1; i <= this.aantal; i++) {
            if (i == 2) {
                total += 18000.00;
            }
            if (i == 1) {
                total += 34000.00;
            }
            if (i > 2) {
                total += 8000.00;
            }
        }
        return total / 100 * dealpercentage;
    }

    public Integer getAantal() {
        return aantal;
    }

    public void setAantal(Integer aantal) {
        this.aantal = aantal;
    }

}

