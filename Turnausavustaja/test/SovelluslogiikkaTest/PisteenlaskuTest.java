/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SovelluslogiikkaTest;

import Osallistuja.Joukkue;
import Sovelluslogiikka.Pisteenlasku;
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
public class PisteenlaskuTest {

    public Pisteenlasku testiPisteenlasku;
    public Joukkue testiJoukkue;

    public PisteenlaskuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testiPisteenlasku = new Pisteenlasku();
        testiJoukkue = new Joukkue("Mankelit");

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testataanPisteidenLisaamista() {
        testiPisteenlasku.asetaPisteet(5, 2, 3);
        assertEquals(testiPisteenlasku.haeHaviot(), 3);
        assertEquals(testiPisteenlasku.haeVoitot(), 5);
        assertEquals(testiPisteenlasku.haeTasapelit(), 2);
        assertEquals(testiPisteenlasku.haeOttelujenLkm(), 10);
        assertEquals(testiPisteenlasku.haePisteet(), 17);
    }

    @Test
    public void testataanVoitonLisaysta() {
        testiPisteenlasku.lisaaVoitto();
        assertEquals(testiPisteenlasku.haeVoitot(), 1);
        assertEquals(testiPisteenlasku.haeOttelujenLkm(), 1);
        assertEquals(testiPisteenlasku.haePisteet(), 3);
    }

    @Test
    public void testataanHavionLisaysta() {
        testiPisteenlasku.lisaaHavio();
        assertEquals(testiPisteenlasku.haeOttelujenLkm(), 1);
        assertEquals(testiPisteenlasku.haePisteet(), 0);
    }

    @Test
    public void testataanTasapelinLisaysta() {
        testiPisteenlasku.lisaaTasuri();
        assertEquals(testiPisteenlasku.haeOttelujenLkm(), 1);
        assertEquals(testiPisteenlasku.haePisteet(), 1);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
