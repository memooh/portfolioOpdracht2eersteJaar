package com.mehmet;

import java.util.ArrayList;
import java.util.Scanner;

class Login {

    private static Login singleton;
    private ArrayList<Dealership> users;
    private Dealership user;

    Login() {
        users = new ArrayList<> ();
        users.add (new Dealership ("Rifi", "Zuid Holland", "yolo"));
        user = null;
    }

    public static Login getInstance () {

        if (singleton == null) {
            singleton = new Login ();
        }

        return singleton;
    }

    private boolean userExists (String name) {

        for (Dealership user : users) {
            if (user.getNaam ().equals (name)) {
                this.user = user;
                return true;
            }
        }

        return false;
    }

    public boolean userIsAuthenticated () {
        return user != null;
    }

    public boolean isAuthenticated() {

        if (userIsAuthenticated ()) {
            return true;
        }
        else {

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {

                System.out.println ("=================");
                System.out.print("Met welke gebruikersnaam wilt u inloggen? ");
                String userName = scanner.nextLine();
                System.out.print ("Graag het bijbehorende password: ");
                String password = scanner.nextLine();
                System.out.println ("=================");

                if (userExists (userName) && user.isPasswordCorrect(user.getWachtwoord())) {
                    System.out.println ("Succesvol ingelogd");
                    return true;
                }

                System.out.println ("De combinatie van gebruikersnaam en password is niet OK.");
            }

            System.out.println ("=================");
            System.out.println ();
            return false;
        }
    }


}