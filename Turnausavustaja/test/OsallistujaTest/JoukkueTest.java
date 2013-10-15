package OsallistujaTest;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Osallistuja.Joukkue;
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
public class JoukkueTest {

    public Joukkue testiJoukkue;
    public Pelaaja testiPelaaja;

    public JoukkueTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testiJoukkue = new Joukkue("Jengi", 5, 5);
        testiPelaaja = new Pelaaja("Veikko");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pelaajanLisaaminenJoukkueeseen() {
        this.testiJoukkue.lisaaPelaaja(testiPelaaja);
        assertEquals(1, this.testiJoukkue.pelaajat.size());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
