/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import springapp.db.DBConnector;

public class Movie {
    private int id;
    private String title;
    private int length;
    private static String tablename = "movie";

    /**
     * getter of movie id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * setter of movie id
     * @param id int
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * getter for movie title
     * @return String
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * setter for movie title
     * @param title String
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * get movie duration
     * @return int
     */
    public int getLength() {
        return length;
    }
    
    /**
     * set movie duration
     * @param movieLength int 
     */
    public void setLength(int movieLength) {
        this.length = movieLength;
    }
    
    /**
     * return ORM from sql
     * @param query the query string
     * @return new object movie, null if not exist
     */
    public Movie findBySql(String query) {
        try {
            
            Statement st = DBConnector.con.createStatement();
            ResultSet result = st.executeQuery(query);
            result.next();
            Movie movie = new Movie();
            movie.setId(result.getInt("id"));
            movie.setLength(result.getInt("length"));
            movie.setTitle(result.getString("title"));
            return movie;
        } catch (SQLException e){
            return null;
        }
    }
    
    /**
     * return ORM of sql
     * @param query the query string
     * @return ArrayList of Movie
     */
    public ArrayList<Movie> findAllBySql(String query){
        try {
            Statement st = DBConnector.con.createStatement();
            
            ArrayList<Movie> movies = new ArrayList<>();
            ResultSet result = st.executeQuery(query);

            while (result.next()){
                result = st.getResultSet();
                Movie movie = new Movie();
                movie.setId(result.getInt("id"));
                movie.setLength(result.getInt("length"));
                movie.setTitle(result.getString("title"));
                movies.add(movie);
            }
            return movies;
        } catch (SQLException e){
            return null;
        }
        
    }
    
    /**
     * insert current object into sql
     * @return true if success
     */
    public boolean insert() {
        try {
            Statement st = DBConnector.con.createStatement();
            st.execute("INSERT INTO `"+Movie.tablename+"`(title,length) VALUES('"+this.getTitle()+"','"+this.getLength()+"')");
            return true;
        } catch (SQLException e){
            return false;
        }
    }

    /**
     * Unsupported
     * @return
     */
    public boolean save(){
        Statement st;
        throw new UnsupportedOperationException("Movie.java : save not supported");
//        try {
//            st = DBConnector.con.createStatement();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //st.execute("UPDATE `"++"` SET title='',length=''")
    }

    /**
     * return new model
     * @return Movie
     */
    public static Movie model(){
        return new Movie();
    }
}