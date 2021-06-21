package com.mehmet;

import java.util.Scanner;

class IT extends Dealer{


    public IT(String nname, int keuze) {
        super(nname, keuze);
    }

    public String getOrderLine () {
        System.out.print ("Moet de ontwikkelaar Java/PHP/Symfony/HTML/C+ weten? (j/n) ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("j")){
            return "Ontwikkelaar heeft ervaring met:" + "\r\n" + "Java" + "\r\n" + "PHP" + "\r\n" + "Symfony" + "\r\n" + "HTML" + "\r\n" + "C+" + "\r\n";
        }else if(scanner.nextLine().equals("n")){
            return "Ontwikkelaar heeft geen enof geen ervaring met een van de genoemde talen."+ "\r\n";
        }
        return "Keuze niet gemaakt.";
    }
}