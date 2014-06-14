/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.web;

import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import springapp.domain.Movie;

/**
 *
 * @author yafithekid
 */
public class MovieIndexControllerTest {
    
    public MovieIndexControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of handleRequest method, of class MovieIndexController.
     */
    @Test
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        MovieIndexController instance = new MovieIndexController();
        ModelAndView expResult = null;
        ModelAndView result = instance.handleRequest(request, response);
        Map<?,?> model = result.getModel();
        ArrayList<Movie> movies = (ArrayList<Movie>) model.get("movies");
        for(Movie movie : movies){
            System.out.println(movie.getTitle());
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
