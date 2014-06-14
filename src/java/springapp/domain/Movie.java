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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int movieLength) {
        this.length = movieLength;
    }
    
    public Movie findBySql(String query) throws SQLException{
        try {
            
            Statement st = DBConnector.con.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM `movie` LIMIT 1");
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
    
    public boolean insert() {
        try {
            Statement st = DBConnector.con.createStatement();
            st.execute("INSERT INTO `"+Movie.tablename+"`(title,length) VALUES('"+this.getTitle()+"','"+this.getLength()+"')");
            return true;
        } catch (SQLException e){
            return false;
        }
    }
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
    public static Movie model(){
        return new Movie();
    }
}