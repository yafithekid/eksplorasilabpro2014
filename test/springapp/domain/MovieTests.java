/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.domain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import springapp.db.DBConnector;

/**
 *
 * @author yafithekid
 */
public class MovieTests {
    
    public MovieTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            DBConnector.initConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MovieTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
        try {
            DBConnector.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MovieTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getId method, of class Movie.
     */
    //@Test
    public void testGetId() {
        System.out.println("getId");
        Movie instance = new Movie();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Movie.
     */
    //@Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Movie instance = new Movie();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Movie.
     */
    //@Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Movie instance = new Movie();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Movie.
     */
    //@Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Movie instance = new Movie();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class Movie.
     */
    //@Test
    public void testGetLength() {
        System.out.println("getLength");
        Movie instance = new Movie();
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Movie.
     */
    //@Test
    public void testSetLength() {
        System.out.println("setLength");
        int movieLength = 0;
        Movie instance = new Movie();
        instance.setLength(movieLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBySql method, of class Movie.
     */
    @Test
    public void testFindBySql() throws SQLException {
        System.out.println("findBySql");
        String query = "SELECT * FROM `movie`";
        Movie instance = new Movie();
        Movie expResult = null;
        Movie result = instance.findBySql(query);
        assertNotNull(result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findAllBySql method, of class Movie.
     */
    @Test
    public void testFindAllBySql() {
        System.out.println("findAllBySql");
        String query = "SELECT * FROM `movie`";
        Movie instance = new Movie();
        ArrayList<Movie> expResult = null;
        ArrayList<Movie> result = instance.findAllBySql(query);
        for (Movie movie : result){
            System.out.println(movie.getTitle());
        }
        assertNotNull(result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Movie.
     */
    //@Test
    public void testInsert() {
        System.out.println("insert");
        Movie instance = new Movie();
        boolean expResult = false;
        boolean result = instance.insert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Movie.
     */
    //@Test
    public void testSave() {
        System.out.println("save");
        Movie instance = new Movie();
        boolean expResult = false;
        boolean result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of model method, of class Movie.
     */
    //@Test
    public void testModel() {
        System.out.println("model");
        Movie expResult = null;
        Movie result = Movie.model();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
