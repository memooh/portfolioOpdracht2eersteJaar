import java.util.Scanner;

class Mechanic extends Dealer{


    public Mechanic(String nname, int keuze) {
        super(nname, keuze);
    }

    public String getOrderLine () {
        System.out.print ("Moet de mechanic 10+ jaar werkervaring hebben? (j/n)");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("j")){
            return "Mechanic heeft 10+ jaar werkervaring" + "\r\n";
        }else if(scanner.nextLine().equals("n")){
            return "Mechanic heeft minder dan 10+ jaar werkervaring"+ "\r\n";
        }
        return "Keuze niet gemaakt.";
    }
}