/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Osallistuja;

import Sovelluslogiikka.Pisteenlasku;
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
    public Pisteenlasku pisteet;
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
        this.pisteet = new Pisteenlasku();
        this.pelaajat = new ArrayList<Pelaaja>();
    }

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.ranking = 0;
        this.pisteet = new Pisteenlasku();
        this.pelaajat = new ArrayList<Pelaaja>();
    }

    public int haeRanking() {
        return this.ranking;
    }

    public void asetaRanking(int numero) {
        this.ranking = numero;
    }

    public Pisteenlasku haePisteet() {
        return this.pisteet;
    }

    /**
     * Metodi lisää pelaajan haluttuun joukkueeseen, joka on luotu aikaisemmin.
     * Metodi pitää huolen ettei joukkueen pelaajamäärä nouse yli kahden.
     *
     * @param pelaaja Määritelty pelaaja joka lisätään
     *
     */
    public void lisaaPelaaja(Pelaaja pelaaja) {
        if (this.pelaajat.size() > 2) {
            System.out.println("Liian monta pelaajaa joukkueessa");
        } else {
            pelaaja.asetaJoukkue(this.nimi);
            this.pelaajat.add(pelaaja);
        }
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

    public String toString() {
        return this.nimi + "(Pelaajat: " + this.pelaajat.toString() + ")";
    }
}
