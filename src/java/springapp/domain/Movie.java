/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.domain;

public class Movie {
    private String title;
    private int movieLength;

    public String getTitle() {
            return title;
    }
    public void setTitle(String title) {
            this.title = title;
    }
    public int getMovieLength() {
            return movieLength;
    }
    public void setMovieLength(int movieLength) {
            this.movieLength = movieLength;
    }
}