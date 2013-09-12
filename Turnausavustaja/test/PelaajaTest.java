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
    
    public PelaajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Pelaaja pelaaja;
        pelaaja = new Pelaaja(Pekka, 50, Kikkareet);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void lisataanRanking() {
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
