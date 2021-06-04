import java.util.Scanner;

class Accountant extends Dealer{

    public Accountant(String nname, int keuze) {
        super(nname, keuze);
    }

    public String getOrderLine () {
        System.out.print ("Moet de accountant in hun werkleven met meer dan 10 miljoen euro behandeld hebben? (j/n) ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("j")){
            return "Accountant heeft in hun werkleven met meer dan 10 miljoen euro behandeld" + "\r\n";
        }else if(scanner.nextLine().equals("n")){
            return "Accountant heeft in hun werkleven met minder dan 10 miljoen euro behandeld"+ "\r\n";
        }
        return "Keuze niet gemaakt.";
    }
}