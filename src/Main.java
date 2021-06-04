import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.isAuthenticated();

        System.out.println("-------------------------------------------");

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
        Dealership dlship1 = new Dealership("Fontiona", "Kosovo", "yolowaterpolo");
        dlship1.dLocatie();

        System.out.println("-------------------------------------------");

        //Dealer uitprinten
        Dealer dealer1 = new Dealer("Mehmet", "Ozturk", "20129947@student.hhs.nl", 20) {
            @Override
            public String getOrderLine() {
                return null;
            }
        };
        dealer1.dDealer();
        Dealer dealer2 = new Dealer("Robin", "Hood", "test@test.nl", 211) {
            @Override
            public String getOrderLine() {
                return null;
            }
        };
        dealer2.dDealer();


        System.out.println("----------------------TESTING TESTING TESTING---------------------");

        dlship1.addDealer(dealer1);
        dlship1.addDealer(dealer2);
        dlship1.getDealers();

        Scooter scooby = new Scooter("Scooby",20,10);

        auto1.startEngine();
        scooby.startEngine();

        System.out.println("-------------------------------------------");

        System.out.println("Wat voor soort Dealer wil je?");

        System.out.println("1. IT");
        System.out.println("2. Accountant");
        System.out.println("3. Mechanic");
        System.out.println("4. Manager");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk dealer");
        int keuze = scanner.nextInt();
        scanner.nextLine();


        Dealer dealer111 = null;

        if (keuze == 1)  {
            dealer111 = new IT ("test", keuze);
        }
        else if(keuze == 2){
            dealer111 = new Accountant ("test",keuze);
        }
        else if(keuze == 3){
            dealer111 = new Mechanic ("test",keuze);
        }
        else if(keuze == 4){
            dealer111 = new Manager ("test",keuze);
        }
        else{
            System.out.println("nothing found");
        }
        assert dealer111 != null;
        System.out.println (dealer111.getOrder ());

    }
}
