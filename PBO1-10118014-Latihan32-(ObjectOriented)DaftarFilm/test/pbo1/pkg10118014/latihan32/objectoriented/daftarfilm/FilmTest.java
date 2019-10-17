/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118014.latihan32.objectoriented.daftarfilm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Asus
 */
public class FilmTest {
    
    public FilmTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
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
