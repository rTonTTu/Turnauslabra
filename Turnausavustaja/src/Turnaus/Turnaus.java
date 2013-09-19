/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Turnaus;

/**
 *
 * @author TonTTu
 */
import Osallistuja.Joukkue;
import Sovelluslogiikka.Lohkot;
import java.util.ArrayList;

public class Turnaus {
    
    /*
     * Luokan tehtävänä on ylläpitää turnausta sekä siihen osallistuvia joukkueita.
     */

    private ArrayList<Joukkue> osallistujat;
    private String nimi;
    private String pvm;

    public Turnaus(String nimi, String pvm) {
        this.nimi = nimi;
        this.pvm = pvm;
        this.osallistujat = new ArrayList<>();
    }

    public void lisaaJoukkue(Joukkue joukkue) {
        this.osallistujat.add(joukkue);
    }

    public void tulostaJoukkue(Joukkue joukkue) {
        System.out.println(joukkue);
    }

    public void tulostaLohko(Lohkot lohko) {
        lohko.tulostaJoukkueet();
    }

    public void poistaJoukkue(Joukkue joukkue) {
        this.osallistujat.remove(joukkue);
    }

    public void tulostaKaikki() {
        for (Joukkue osallistuja : this.osallistujat) {
            System.out.println(osallistuja);
        }
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.pvm + ")";
    }
}
