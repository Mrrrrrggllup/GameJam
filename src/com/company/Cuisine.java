package com.company;

import java.util.Scanner;

import static com.company.Porte.porte;
import static com.company.TimeLoop.aventure;

public class Cuisine {
    static Scanner sc = new Scanner(System.in);

    public static void cuisine(Player joueur,Garde gardeDoor, Pizza pizza){
        //TODO : Video arrivée en cuisine

        System.out.println(" Vous pouvez fouiller le petit FRIGO ou bien la grosse POUBELLE semblant débordée de déchets");
        String choixJoueur = "";
        boolean continuer = true;
        while (continuer ) {
            choixJoueur = sc.nextLine();
            switch (choixJoueur) {
                case "frigo":
                    System.out.println("Vous trouvez une vieille pate à pizza");
                    System.out.println("Voulez fouiller autre chose ? (true/false)");
                    continuer = sc.nextBoolean();
                    break;
                case "poubelle":
                    System.out.println("Vous passez un moment à trier les déchets alimentaires de cette poubelles et finissez par trouver des choses interessantes :");
                    System.out.println("Vous ressortez des peperonis, du fromage et une truite en décomposition");
                    System.out.println("Apres avoir fais un peu de cache misere vous les placez dans votre inventaire");
                    joueur.setInventaire("peperoni");
                    joueur.setInventaire("fromage");
                    joueur.setInventaire("truite");
                    System.out.println("Voulez fouiller autre chose ? (true/false)");
                    continuer = sc.nextBoolean();
                    break;
                default:
                    System.out.println("Vous semblez être bloqué dans une boucle");
            }
        }
        if (joueur.getInventaire().contains("pizza") && joueur.getInventaire().contains("fromage")&& joueur.getInventaire().contains("truite")
                && joueur.getInventaire().contains("peperoni")){

            System.out.println("Fort de tout ces délicieux ingrédients vous préparez une délicieuse pizza pour le garde");

        }
        String choixDestination = "";
        while (!choixDestination.equalsIgnoreCase("depart")&& !choixDestination.equalsIgnoreCase("cuisine") )
            choixDestination = sc.nextLine();
        switch (choixDestination){
            case "depart":
                System.out.println("Vous repartez au départ");
                aventure(joueur,gardeDoor,pizza);
                break;
            case "porte" :
                System.out.println("Vous repartez à la porte !");
                porte (joueur,gardeDoor,pizza);
                break;
            default:
                System.out.println("Vous êtes bloqué dans une boucle !");
        }






    }
}
