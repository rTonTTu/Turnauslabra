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

    /**
     * Pelaaja-luokan sisällä olevat määrittelevät luokkamuuttujat kertovat pelaajan nimen, pelaajanumeron, joukkueen johon he kuuluvat sekä rankingin listoilla
     */
    
    public String nimi;
    public int numero;
    public String joukkue;
    public int ranking;

    /*
     * Luokan tarkoituksena pitää pelaajat listattavina henkilöinä, jotta laajennettaessa esim. voidaan siirtyä mm. 1vs1 kuvioon halutessa.
     */
    
    /**
     * Konstruktorissa luodaan Pelaaja attribuuteilla, jotka määrittelevät hänen toimintansa joukkueessa.
     * 
     * @param nimi Pelaajan nimi
     * @param numero Pelaajanumero
     * @param joukkue Joukkue johon pelaaja kuuluu
     * @param ranking Ranking-arvo jonka pelaaja saa luotuaan hänet kertaalleen
     */
    
    public Pelaaja(String nimi, int numero, String joukkue, int ranking) {
        this.nimi = nimi;
        this.joukkue = joukkue;
        this.numero = numero;
        this.ranking = ranking;

    }

    public Pelaaja(String pelaaja1Nimi, String joukkue) {
       this.nimi = pelaaja1Nimi;
       this.joukkue = joukkue;
       this.numero = 0;
       this.ranking = 0;
    }
    
    public Pelaaja(String pelaaja1Nimi) {
        this.nimi = pelaaja1Nimi;
        this.numero = 0;
        this.ranking = 0;
        
    }
    
    @Override
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
