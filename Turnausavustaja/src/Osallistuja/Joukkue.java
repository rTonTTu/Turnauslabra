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

    public String name;
    public int ranking;
    public int points;
    public ArrayList<Pelaaja> players;

    public Joukkue(String nimi, int ranking, int pisteet) {
        this.name = nimi;
        this.ranking = ranking;
        this.points = pisteet;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int numero) {
        this.ranking = numero;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int pisteet) {
        this.points = pisteet;
    }
    
    public void addPlayer(Pelaaja pelaaja) {
        if (this.players.size() > 2) {
            System.out.println("Too many players in team");
        } else {
            this.players.add(pelaaja);
        }
        
    }
    
    public void removePlayer(Pelaaja pelaaja) {
        if (this.players.contains(pelaaja)) {
            this.players.remove(pelaaja);
        } else {
            System.out.println("No such player in team");
        }
    }
    
    
}
