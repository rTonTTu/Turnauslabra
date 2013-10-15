/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SovelluslogiikkaTest;

import Osallistuja.Joukkue;
import Sovelluslogiikka.Lohkot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TonTTu
 */
public class LohkotTest {

    public Joukkue testiJoukkue;
    public Lohkot testiLohko;

    public LohkotTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.testiJoukkue = new Joukkue("Testaajat");
        this.testiLohko = new Lohkot();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testataanJoukkueenLisaysta() {
        this.testiLohko.lisaaJoukkue(testiJoukkue);
        assertEquals(this.testiLohko.getLohko().size(), 1);
    }

    @Test
    public void testataanJoukkueenPoistoa() {
        this.testiLohko.lisaaJoukkue(testiJoukkue);
        assertEquals(this.testiLohko.getLohko().size(), 1);
        this.testiLohko.poistaJoukkue(testiJoukkue);
        assertEquals(this.testiLohko.getLohko().size(), 0);
    }
}
