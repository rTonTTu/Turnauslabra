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

    public Pelaaja(String nimi, int numero, String joukkue) {
        this.name = nimi;
        this.team = joukkue;
        this.number = numero;

    }

    public String getName(String nimi) {
        return this.name;
    }
    
    public String getAge()
}
