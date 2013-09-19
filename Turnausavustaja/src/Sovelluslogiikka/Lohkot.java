/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sovelluslogiikka;

import Osallistuja.Joukkue;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * luokka pitää joukkueet lohkon sisällä, jolloin voidaan seurata lohkojen sisällä olevien otteluiden tuloksia.
 */
public class Lohkot {
    
    private ArrayList<Joukkue> lohko;
    
    public Lohkot() {
        this.lohko = new ArrayList<>();
    }
    
    public void lisaaJoukkue(Joukkue joukkue) {
        this.lohko.add(joukkue);
    }
    
    public void poistaJoukkue(Joukkue joukkue) {
        this.lohko.remove(joukkue);
    }
    
    public void tulostaJoukkueet() {
        for (Joukkue joukkue : this.lohko) {
            System.out.println(joukkue.toString());
        }
    }
    
    public ArrayList<Joukkue> getLohko() {
        return this.lohko;
    }
}
