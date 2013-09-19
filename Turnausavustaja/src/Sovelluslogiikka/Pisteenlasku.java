/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sovelluslogiikka;

/**
 *
 * @author TonTTu
 */
public class Pisteenlasku {

    /*
     * Luokka pitää kirjaa joukkueiden voitoista, häviöistä, pisteistä, tasapeleistä sekä ylipäänsä pelatuista peleistä, jotta tuloksia voidaan ylläpitää.
     */
    private int pisteet;
    private int voitot;
    private int pelatut;
    private int tasapelit;
    private int haviot;

    public Pisteenlasku() {
        this.pisteet = 0;
        this.pelatut = 0;
        this.voitot = 0;
        this.tasapelit = 0;
        this.haviot = 0;
    }

    /*
     * halutessaan tuomarit voivat säätää käsin turnauksen osallistuneen joukkueen tuloksia, mikäli esim. turnaus on ehtinyt alkaa tai tarvitaan muista turnauksista tuloksia.
     */
    public void setPisteet(int voitot, int tasapelit, int haviot) {
        if (voitot < 0 || tasapelit < 0 || haviot < 0) {
            System.out.println("Tulokset eivät voi olla negatiivisia!");
        } else {
            this.voitot = voitot;
            this.tasapelit = tasapelit;
            this.haviot = haviot;
            this.pelatut = voitot + tasapelit + haviot;
            this.pisteet = (voitot * 3) + tasapelit;
        }
    }

    public void lisaaVoitto() {
        this.pisteet += 3;
        this.voitot++;
        this.pelatut++;
    }

    public void lisaaHavio() {
        this.haviot++;
        this.pelatut++;
    }

    public void lisaaTasuri() {
        this.tasapelit++;
        this.pisteet++;
        this.pelatut++;
    }

    public int getPisteet() {
        return this.pisteet;
    }

    public int getVoitot() {
        return this.voitot;
    }

    public int getHaviot() {
        return this.haviot;
    }

    public int getTasapelit() {
        return this.tasapelit;
    }

    public int getOttelujenLkm() {
        return this.pelatut;
    }

    @Override
    public String toString() {
        return "Pelattu " + this.pelatut + " peliä"
                + ", voittoja " + this.voitot
                + ", tasapelejä " + this.tasapelit
                + ", häviöitä " + this.haviot
                + ", pisteitä " + this.pisteet;

    }
}