package com.company;

public class Garde {

    private boolean soif = true;
    private boolean faim = true;
    private boolean motDePass = false;

    public Garde() {
        this.faim = true;
        this.soif = true ;
        this.motDePass = false;
    }

    public boolean isSoif() {
        return soif;
    }

    public void setSoif(boolean soif) {
        this.soif = soif;
    }

    public boolean isFaim() {
        return faim;
    }

    public void setFaim(boolean faim) {
        this.faim = faim;
    }

    public boolean isMotDePass() {
        return motDePass;
    }

    public void setMotDePass(boolean motDePass) {
        this.motDePass = motDePass;
    }

    public void verifyMDP(String mdpJoueur){
        //TODO
        String MDP ="billet" ;
        if (MDP.equalsIgnoreCase(mdpJoueur )|| mdpJoueur.equalsIgnoreCase("Un billet" ) ){
            this.setMotDePass(true);
        }
    }
}
