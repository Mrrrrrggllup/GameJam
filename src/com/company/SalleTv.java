package com.company;

import java.util.Scanner;

import static com.company.TimeLoop.aventure;

public class SalleTv {

    static Scanner sc = new Scanner(System.in);

    public static void salleTv(Player joueur,Garde gardeDoor, Pizza pizza) {
        //playVideo(File vidéo entrée salleTv)
        System.out.println("\nSur votre DROITE, caché derrière un étrange présentoire, semble se cacher des statues primitives, vestiges d'un ancien temps");
        System.out.println("Sur votre GAUCHE la piece semble vide mais une fouille minutieuse pourrait peut-être vous permettre de trouver un truc !");
        System.out.println("Sinon vous pouvez SORTIR.");
        Scanner sc = new Scanner(System.in);
        String choixJoueur = "";
        while (!choixJoueur.equals("sortir")) {
            System.out.println("Que faites vous ?");
            choixJoueur = sc.nextLine().toLowerCase();
            switch (choixJoueur) {
                case "gauche":
                    fondFouille(joueur,gardeDoor,pizza);
                    break;
                case "droite":
                    laPoule(joueur,gardeDoor,pizza);
                    break;
                default:
                    System.out.println("Vous semblez bloqué dans une boucle");
                    break;
            }
        }
        System.out.println("Vous retournez sur vos pas");
        aventure(joueur,gardeDoor,pizza);


    }

    public static void fondFouille(Player joueur,Garde gardeDoor, Pizza pizza) {
        // vidéo déplacement ?
        String bec = "Un truc qui ressemble vaguement à un bec";
        boolean continuer = true;
        int counter = 1;
        while (continuer) {
            switch (counter) {
                case 1:
                    System.out.println("Vous ne trouvez rien !");
                    break;
                case 2:
                    System.out.println("Vous finissez par voir une petite pile de détritus sans interet !");
                    break;
                case 3:
                    System.out.println("Bravant votre dégout vous fouillez la pile de détritus et vous trouvez un objet étrange qui ressemble vaguement à un bec !");
                    System.out.println("Vous le placez, en toute logique, dans votre inventaire");
                    joueur.setInventaire(bec);
                    break;
                default:
                    System.out.println("Rien d'interessant ici");
                    break;
            }
            counter++;
            System.out.println("Continuer à fouiller ? (true/false");
            continuer = sc.nextBoolean();
        }
        System.out.println("Vous retournez sur vos pas");
        salleTv(joueur,gardeDoor,pizza);

    }

    public static void laPoule(Player joueur,Garde gardeDoor, Pizza pizza){
        //video fouille
        System.out.println("Comme vous l'aviez vu de loin, vous êtes devant des scultures étranges...");
        System.out.println("L'une d'elle ressemblant vaguement à une poule semble abimée");
        if (joueur.getInventaire().contains("Un truc qui ressemble vaguement à un bec")){
            System.out.println("Vous semblez avoir un objet permettant de la réparer !");
            System.out.println("Souhaitez vous placer le bec à sa place ? ");
            boolean choix = sc.nextBoolean();
            if (choix == true){
                System.out.println("Une voix mécanique s'élève alors de la poule et vous dit : \n" +
                        "Pondu le cinq février à consommer avant le douze mars !");
            }

            System.out.println("Un petit clavier viens d'apparaitre sur le ventre de la statue il est composé de chiffres.");
            int code = 0;
            boolean continuer = true;
            while (code != 0502 && continuer){
                System.out.println("Que tapez-vous ?");
                code = sc.nextInt();
                if (code == 0502) {
                    System.out.println("Le clavier disparait dans une rotation ...");
                    System.out.println("La poule se met alors à vibrer et tout à coup pond un papier roulé en boule");
                    joueur.setInventaire("papierCode");
                    //TODO : code du papier
                } else{
                    System.out.println("Ce code ne semble pas convenir.");
                    System.out.println("Continuez-vous à chercher ? (true/false)");
                    continuer = sc.nextBoolean();
                    }

                }
            }


        }
    }



