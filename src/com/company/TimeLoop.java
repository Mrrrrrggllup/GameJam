package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static com.company.SalleTv.salleTv;
import static com.company.Salon.salon;

public class TimeLoop {

    static Player joueur = new Player ("Michel");
    static Garde gardeDoor = new Garde();
    static Pizza pizza = new Pizza();
    static Poule poule = new Poule();

    public static void main(String[] args) {

        boolean timeLoop = true;
        System.out.println("### L'AVENTURE COMMENCE ! ###");

            //pause puis vidéo intro
            aventure(joueur,gardeDoor,pizza);

    }


    public static void aventure (Player joueur,Garde gardeDoor, Pizza pizza){


        System.out.println("Sur votre GAUCHE il semble y avoir une porte fermée");
        System.out.println("Sur votre DROITE se trouve un petit salon, vous entendez du bruit provenant de cet endroit");
        System.out.println("Que voulez vous faire ? :");
        Scanner sc = new Scanner(System.in);
        String choixJoueur = sc.nextLine().toLowerCase();
        while ( !choixJoueur.equals("gauche") && !choixJoueur.equals("droite") ) {
            switch (choixJoueur){
                case "gauche": salleTv(joueur,gardeDoor,pizza);
                break;
                case "droite": salon(joueur,gardeDoor,pizza);
                break;
            }
        }

    }




    //La méthode de lecture de fichiers !

    public static void playVideo(File file) {
        if (Desktop.isDesktopSupported()) {
            if (Desktop.getDesktop().isSupported(java.awt.Desktop.Action.OPEN)) {

                try {
                    java.awt.Desktop.getDesktop().open(file);
                } catch (IOException exc) {
                    System.out.println("Exception: " + exc.toString());
                }
            } else {
                System.out.println("La fonction OPEN n'est pas supportée par votre Système d'exploitation");
            }
        } else {
            System.out.println("La fonction Desktop n'est pas supportée par votre Système d'exploitation");
        }
    }


}
