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

    public String nimi;
    public int numero;
    public String joukkue;
    public int ranking;

    /*
     * Luokan tarkoituksena pitää pelaajat listattavina henkilöinä, jotta laajennettaessa esim. voidaan siirtyä mm. 1vs1 kuvioon halutessa.
     */
    
    public Pelaaja(String nimi, int numero, String joukkue, int ranking) {
        this.nimi = nimi;
        this.joukkue = joukkue;
        this.numero = numero;
        this.ranking = ranking;

    }
    
    public String toString() {
        return this.nimi;
    }

    public int haeNumero() {
        return this.numero;
    }

    public String haeJoukkue() {
        return this.joukkue;
    }

    public int haeRanking() {
        return this.ranking;
    }

    public void asetaRanking(int ranking) {
        this.ranking = ranking;
    }
}
