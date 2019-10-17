/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118014.latihan32.objectoriented.daftarfilm;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Asus
 */
public class FilmNGTest {
    
    public FilmNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of nowPlaying method, of class Film.
     */
    @Test
    public void testNowPlaying() {
        System.out.println("nowPlaying");
        String parJudul = "";
        String parGenre = "";
        double parRating = 0.0;
        int parDuration = 0;
        Film instance = new Film();
        instance.nowPlaying(parJudul, parGenre, parRating, parDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
