package com.company;

import java.util.Scanner;

import static com.company.MurTof.indiceGameDesigner;
import static com.company.Porte.porte;

public class Salon {

    static Scanner sc = new Scanner(System.in);

    public static void salon(Player joueur,Garde gardeDoor, Pizza pizza) {
        //playVideo(File vidéo entrée salleTv)
        System.out.println("\nSur votre DROITE se trouve un mur de photos ... Peut être pourriez vous y trouver le responsable de vos malheurs !");
        System.out.println("Vous pourriez également FOUILLER la salle afin d'y trouver des choses interessantes");
        System.out.println("Il semble également qu'un COULOIR partant de cette piece conduit à un autre endroit");
        System.out.println("Sinon vous pouvez SORTIR.");
        String choixJoueur = "";

        while (!choixJoueur.equals("sortir")&& !choixJoueur.equals("couloir")) {
            System.out.println("Que faites vous ?");
            choixJoueur = sc.nextLine().toLowerCase();
            switch (choixJoueur) {
                case "droite":
                    System.out.println("Vous vous tournez vers le mur de photos et commencez à chercher un responsable à vos maux");
                    //ouvrir Code.txt
                    if(indiceGameDesigner() == 18){
                        // TODO : video du game designer
                    }
                    break;
                case "fouiller":
                    fouille(joueur);
                    break;
                case "sortir":
                    System.out.println("Vous ressortez de la salle et retournez sur vos pas");
                    break;
                case "couloir" :
                    System.out.println("Vous empruntez le couloir :");
                    //TODO : pause
                    porte(joueur,gardeDoor,pizza);
                default:
                    System.out.println("Vous semblez bloqué dans une boucle");
                    break;
            }
        }


    }
    public static void fouille(Player joueur){
        System.out.println("Dans la salle où vous êtes vous pouvez voir trois CANAPEs (appelons les canape_1...) et une TABLE basse ");

        boolean continuer = true;
        while(continuer){
            System.out.println("Que voulez vous fouiller ");
            String choixJoueur = sc.nextLine();
            switch (choixJoueur){
                case "table" :
                    System.out.println("Des jeux et des conneries, rien d'interessant ici !");
                    break;
                case "canape_1":
                    System.out.println("Vous trouvez des empreintes de pas sous le canapé ... étrange !");
                    System.out.println("Vous essayez de suivre les traces mais sous quel canape ?");
                    String choixJoueurNext = sc.nextLine();
                    switch (choixJoueurNext){
                        case "canape_3":
                            System.out.println("Les traces continues effectivement derrière ce canape !");
                            System.out.println("Elles semblent continuer plus avant mais vers quel canape ?");
                            String choixJoueurNextFin = sc.nextLine();
                            switch (choixJoueurNextFin){
                                case "canape_2" :
                                    System.out.println("Vous trouvez une bouteille d'eau à moitié pleine sous les coussins du canape ! Vous l'ajoutez à votre inventaire");
                                    joueur.setInventaire("bouteille");
                                    System.out.println("Vous ne trouverez rien de plus ici");
                                    continuer = false;
                                    break;
                                default:
                                    System.out.println("Vous perdez la piste");
                                    continue;
                            }

                            break;

                        default:
                            System.out.println("Rien d'intéressant sous ce canape !");
                            System.out.println("Une boucle semble être en cours");
                            continue;


                }
            }
        }

    }
}
