import java.util.Scanner;

class Manager extends Dealer{


    public Manager(String nname, int keuze) {
        super(nname, keuze);
    }

    public String getOrderLine () {
        System.out.print ("Wilt u dat de manager al eerdere ervaring heeft?");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("j")){
            return "Manager moet ervaren zijn" + "\r\n";
        }else if(scanner.nextLine().equals("n")){
            return "Manager hoeft niet ervaren te zijn"+ "\r\n";
        }
        return "Keuze niet gemaakt.";
    }
}