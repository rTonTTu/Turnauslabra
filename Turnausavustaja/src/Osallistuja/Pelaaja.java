/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Osallistuja;

/**
 *
 * @author TonTTu
 */
public class Pelaaja {

    public String name;
    public int number;
    public String team;
    public int ranking;

    public Pelaaja(String nimi, int numero, String joukkue, int ranking) {
        this.name = nimi;
        this.team = joukkue;
        this.number = numero;
        this.ranking = ranking;

    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getTeam() {
        return this.team;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
