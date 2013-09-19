/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Osallistuja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TonTTu
 */
public class Joukkue {

    public String nimi;
    public int ranking;
    public int pisteet;
    public ArrayList<Pelaaja> pelaajat;

    public Joukkue(String nimi, int ranking, int pisteet) {
        this.nimi = nimi;
        this.ranking = ranking;
        this.pisteet = pisteet;
    }

    public int haeRanking() {
        return this.ranking;
    }

    public void asetaRanking(int numero) {
        this.ranking = numero;
    }

    public int haePisteet() {
        return this.pisteet;
    }

    public void asetaPisteet(int pisteet) {
        this.pisteet = pisteet;
    }
    
    public void lisaaPelaaja(Pelaaja pelaaja) {
        if (this.pelaajat.size() > 2) {
            System.out.println("Too many players in team");
        } else {
            this.pelaajat.add(pelaaja);
        }
        
    }
    
    public void poistaPelaaja(Pelaaja pelaaja) {
        if (this.pelaajat.contains(pelaaja)) {
            this.pelaajat.remove(pelaaja);
        } else {
            System.out.println("No such player in team");
        }
    }
    
    
}
