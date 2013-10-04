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
    
    /**
     * Luokan muuttujat jotka hallinnoivat tärkeitä tietoja turnauksen osalta, kuten päivämäärää, turnauksen nimeä sekä listaa osallistuvista joukkueista
     * 
     */
    private ArrayList<Joukkue> osallistujat;
    private String nimi;
    private String pvm;
    
    /**
     * Konstruktorissa luodaan uusi turnaus, jonka yhteydessä määritellään turnauksen nimi sekä päivämäärä, jolloin turnaus pelataan. HUOM! Turnaus voidaan tehdä etukäteen, siksi käsin täytettävä päivämäärä
     * @param nimi Turnauksen nimi
     * @param pvm Päivämäärä, jolloin turnaus pelataan
     */

    public Turnaus(String nimi, String pvm) {
        this.nimi = nimi;
        this.pvm = pvm;
        this.osallistujat = new ArrayList<>();
    }

    /**
     * Metodi lisää joukkueen turnaukseen
     * @param joukkue lisättävä joukkue
     */
    
    public void lisaaJoukkue(Joukkue joukkue) {
        this.osallistujat.add(joukkue);
    }
    
    /**
     * Metodi tulostaa paramterina annetun joukkueen tiedot
     * @param joukkue tulostettava joukkue
     */

    public void tulostaJoukkue(Joukkue joukkue) {
        System.out.println(joukkue);
    }
    
    /**
     * Metodi tulostaa lohkossa pelaavat joukkueet 
     * @param lohko Pelattavan lohkon joukkueet
     */

    public void tulostaLohko(Lohkot lohko) {
        lohko.tulostaJoukkueet();
    }

    /**
     * Metodi poistaa annetun joukkueen turnauksesta
     * @param joukkue Poistettava joukkue
     */
    
    public void poistaJoukkue(Joukkue joukkue) {
        this.osallistujat.remove(joukkue);
    }
    
    /**
     * Metodi tulostaa kaikki turnaukseen osallistuvat joukkueet
     */

    public void tulostaKaikki() {
        for (Joukkue osallistuja : this.osallistujat) {
            System.out.println(osallistuja);
        }
    }

    /**
     * Metodi lisää halutun joukkueen haluttuun lohkoon
     * @param lohko haluttu lohko
     * @param joukkue lisättävä joukkue
     */
    
    public void lisaaLohkoon(Lohkot lohko, Joukkue joukkue) {
        lohko.lisaaJoukkue(joukkue);
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.pvm + ")";
    }
}
