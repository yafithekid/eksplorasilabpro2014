/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.service;

import springapp.domain.*;

public class MovieGenerator {
    public static Movie createRandom(){
        Movie movie = new Movie();
        movie.setTitle("Random");
        movie.setLength(120);
        return movie;
    }
}
