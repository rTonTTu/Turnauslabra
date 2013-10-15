package OsallistujaTest;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Osallistuja.Pelaaja;
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
public class PelaajaTest {

    public Pelaaja pelaaja;

    public PelaajaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        String nimi = "pekka";
        String joukkue = "Kikkareet";
        this.pelaaja = new Pelaaja(nimi, joukkue);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoRankingAsettaminen() {
        this.pelaaja.asetaRanking(5);
        assertEquals(this.pelaaja.haeRanking(), 5);

    }

    @Test
    public void toimiikoJoukkueenAsettaminen() {
        this.pelaaja.asetaJoukkue("Joukkue");
        assertEquals(this.pelaaja.haeJoukkue(), "Joukkue");
    }

    @Test
    public void toimiikoUudenPelaajanLuonti() {
        Pelaaja testattava = new Pelaaja("Janne", 7, "Karvapallot", 2);
        assertEquals(testattava.toString(), "Janne");
        assertEquals(testattava.haeNumero(), 7);
        assertEquals(testattava.haeJoukkue(), "Karvapallot");
        assertEquals(testattava.haeRanking(), 2);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
