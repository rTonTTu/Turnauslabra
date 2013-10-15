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

    /**
     * Joukkueessa käytettävät luokkamuuttujat, jotka määrittelevät mm. nimen,
     * rankingin, pisteet sekä joukkueessa olevat pelaajat
     */
    public String nimi;
    public int ranking;
    public int pisteet;
    public ArrayList<Pelaaja> pelaajat;

    /*
     * Joukkueluokan sisältä löytyy joukkuieille tarpeelliset metodit, joilla voidaan hakea tietoa niistä, sekä listata osallistuvat pelaajat niihin.
     */
    /**
     * Joukkueen konstruktori joka luo joukkueen ja lisää sille tarvittavat
     * tiedot, kuten nimen, rankingin sekä pisteet.
     *
     * @param nimi Joukkueen nimi
     * @param pisteet Joukkueen keräämät pisteet
     * @param ranking Joukkueen tämänhetkinen rankingsijoitus
     *
     */
    public Joukkue(String nimi, int ranking, int pisteet) {
        this.nimi = nimi;
        this.ranking = ranking;
        this.pisteet = pisteet;
    }

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.ranking = 0;
        this.pisteet = 0;
    }

    public int haeRanking() {
        return this.ranking;
    }

    public void asetaRanking(int numero) {
        this.ranking = numero;
    }

    @Override
    public String toString() {
        return this.nimi;
    }

    public int haePisteet() {
        return this.pisteet;
    }

    public void asetaPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    /**
     * Metodi lisää pelaajan haluttuun joukkueeseen, joka on luotu aikaisemmin.
     * Metodi pitää huolen ettei joukkueen pelaajamäärä nouse yli kahden.
     *
     * @param pelaaja Määritelty pelaaja joka lisätään
     *
     */
    public void lisaaPelaaja(Pelaaja pelaaja) {
        pelaaja.asetaJoukkue(this.nimi);
        this.pelaajat.add(pelaaja);
    }

    /**
     * Metodi poistaa pelaajan listasta mikäli löytää sen listalta. Mikäli näin
     * ei tapahdu, ilmoittaa ohjelma siitä tekstikentässä huomioiden asian.
     *
     * @param pelaaja Määritelty pelaaja joka poistetaan
     *
     */
    public void poistaPelaaja(Pelaaja pelaaja) {
        if (this.pelaajat.contains(pelaaja)) {
            this.pelaajat.remove(pelaaja);
        } else {
            System.out.println("Pelaajaa ei löytynyt");
        }
    }

    /**
     * Metodi näyttää pelaajat listassa, jotka löytyvät listalta. Mikäli
     * joukkueessa ei ole pelaajia,
     *
     * @param joukkue Listattava joukkue joka käsitellään ja tulostetaan.
     *
     */
    public void listaaPelaajat() {
        if (this.pelaajat.isEmpty()) {
            System.out.println("Joukkueessa ei ole pelaajia");
        }
        System.out.println("Joukkueessa " + this.nimi + " pelaavat:");
        for (Pelaaja pelaaja : pelaajat) {
            System.out.println(pelaaja.toString());
        }
    }
}
