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
    public void lisataanRanking() {
        this.pelaaja.asetaRanking(5);
        assertEquals(this.pelaaja.haeRanking(), 5);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
