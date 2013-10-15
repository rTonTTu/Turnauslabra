/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sovelluslogiikka;

import Osallistuja.Joukkue;
import java.util.ArrayList;


/*
 * luokka pitää joukkueet lohkon sisällä, jolloin voidaan seurata lohkojen sisällä olevien otteluiden tuloksia.
 */
public class Lohkot {
    
    /**
     * Luokkaan laitettu lista joukkueista, jotka kuuluvat kyseiseen lohkoon
     */
    
    private ArrayList<Joukkue> lohko;
    
    
    /**
     * Konstruktorissa luodaan lohkolle lista joukkueita. Kyseessä on tavallaan apuluokka jolla vain kontrolloidaan osaa joukkueista mikäli siihen on tarve.
     */
    
    public Lohkot() {
        this.lohko = new ArrayList<Joukkue>();
    }
    
    
    /**
     * Metodi lisää joukkueen lohkon listaan
     * @param joukkue Lisättävä joukkue
     */
    public void lisaaJoukkue(Joukkue joukkue) {
        this.lohko.add(joukkue);
    }
    
    /**
     * Metodi poistaa joukkueen lohkon listalta
     * @param joukkue Poistettava joukkue
     */
    
    public void poistaJoukkue(Joukkue joukkue) {
        this.lohko.remove(joukkue);
    }
    
    
    /**
     * Metodi tulostaa joukkueet, jotka kuuluvat listaan.
     */
    
    public void tulostaJoukkueet() {
        for (Joukkue joukkue : this.lohko) {
            System.out.println(joukkue.toString());
        }
    }
    
    public ArrayList<Joukkue> getLohko() {
        return this.lohko;
    }
}
