package com.company;

import java.util.Scanner;

import static com.company.Cuisine.cuisine;
import static com.company.TimeLoop.aventure;

public class Porte {
    static Scanner sc = new Scanner(System.in);
    public static void porte(Player joueur,Garde gardeDoor, Pizza pizza){
        //TODO : vidéo présentation le garde explique qu'il a faim , soif et qu'il veut le mot de passe ! + Pause
        if (joueur.getInventaire().contains("pizza")){
            if(pizza.getIngredients().contains("peperoni")&& pizza.getIngredients().contains("fromage")&& pizza.getIngredients().contains("truite")){
                //TODO : video gardien prend pizza
                gardeDoor.setFaim(false);
                joueur.rmItem("pizza");
            }
        }
        if(joueur.getInventaire().contains("bouteille")){
            //TODO : video gardien prend la bouteille
            gardeDoor.setSoif(false);
            joueur.rmItem("bouteille");

        }

        System.out.println("Vous avez le mot de passe ??");
        String mdpJoueur = sc.nextLine();
        gardeDoor.verifyMDP(mdpJoueur);
        if(gardeDoor.isMotDePass() && !gardeDoor.isFaim()&& !gardeDoor.isSoif()){
            //TODO : video sortie fin du jeu
            System.exit(0);
        }else if (gardeDoor.isMotDePass()){
            System.out.println("C'est bien le bon mot de passe mais tu n'as pas satisfait toute mes requetes !");
            System.out.println("Je ne te laisserais jamais sotir d'ici (sauf si tu mre ramene le reste !)");
        }else{
            System.out.println("HORS DE MA VUE !");
        }

        System.out.println("Que voulez vous faire ? Vous pouvez revenir sur vos pas dans une piece précédentes");
        System.out.println("Après tous odans quelle piece pourriez vous trouver les choses demandées par le garde ? ");
        System.out.println("C'est le mouton à cinqs pates !");
        System.out.println("Vous retournez au DEPART ? Ou vous avez une briallante idée pour trouver les autres ingrédients ?");
        String choixDestination = "";
        while (!choixDestination.equalsIgnoreCase("depart")&& !choixDestination.equalsIgnoreCase("cuisine") )
        choixDestination = sc.nextLine();
        switch (choixDestination){
            case "depart":
                System.out.println("Vous repartez au départ");
                aventure(joueur,gardeDoor,pizza);
                break;
            case "cuisine" :
                System.out.println("Vous partez à la recherche de la cuisine il vous semble l'avoir croisée un peu plus tôt");
                cuisine (joueur,gardeDoor,pizza);
                break;
            default:
                System.out.println("Vous êtes bloqué dans une boucle !");
        }

    }


}
