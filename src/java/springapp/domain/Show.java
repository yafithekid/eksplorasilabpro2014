/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import springapp.db.DBConnector;

public class Show {
    private Movie movie;
    private Room room;
    private int timeStart;
    private int price;
    private int id;
    private static String tablename = "show";

    public Show(){
        this.movie = new Movie();
        this.room = new Room();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Movie getMovie() {
            return movie;
    }
    public int getMovieId(){
        return this.movie.getId();
    }
    public String getMovieTitle(){
        return this.movie.getTitle();
    }
    public int getRoomId(){
        return this.room.getId();
    }
    public void setMovie(Movie movie) {
            this.movie = movie;
    }
    public void setMovieId(int id){
        this.movie.setId(id);
    }
    public void setRoomId(int id){
        this.room.setId(id);
    }
    public Room getRoom() {
            return room;
    }
    public void setRoom(Room room) {
            this.room = room;
    }
    public int getTimeStart() {
            return timeStart;
    }
    public String getTimeStartFormatted(){
        int h,m,s;
        s = this.getTimeStart();
        h = s/3600;
        s %= 3600;
        m = s/60;
        s %= 60;
        return h+":"+m;
    }
    public void setTimeStart(int timeStart) {
            this.timeStart = timeStart;
    }
    public int getPrice() {
            return price;
    }
    
    public void setPrice(int price) {
            this.price = price;
    }
    
    public boolean isSeatAvailable(int pos){
        return !room.getSeat(pos);
    }
    
    public boolean bookSeat(int pos){
        if (this.isSeatAvailable(pos)){
            room.setSeatAt(pos, true);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean unbookSeat(int pos){
        if (!this.isSeatAvailable(pos)){
            room.setSeatAt(pos, false);
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList findAllAvailableSeat(){
        return room.findAllAvailableSeat();
    }
    public int findAvailableSeat(){
        return room.findAvailableSeat();
    }
    
    public boolean insert(){
        try {
            Statement st = DBConnector.con.createStatement();
            st.execute("INSERT INTO `"+Show.tablename+"`(movie_id,room_id,time) VALUES('"+this.getMovieId()+"','"+this.getRoomId()+"','"+this.getTimeStart()+"')");
            return true;
        } catch (SQLException e){
            return false;
        }
    }
    
    public Show findBySql(String query){
        try {
            Statement st = DBConnector.con.createStatement();
            ResultSet result = st.executeQuery(query);
            result.next();
            
            result = st.getResultSet();
            Show show = new Show();
            show.setId(result.getInt("id"));
            show.setMovieId(result.getInt("movie_id"));
            show.setRoomId(result.getInt("room_id"));
            show.setTimeStart(result.getInt("time"));
            return show;
        } catch (SQLException e){
            return null;
        }
    }
    public ArrayList<Show> findAllBySql(String query){
        try {
            Statement st = DBConnector.con.createStatement();
            
            ArrayList<Show> shows = new ArrayList<>();
            ResultSet result = st.executeQuery(query);

            while (result.next()){
                result = st.getResultSet();
                Show show = new Show();
                show.setId(result.getInt("id"));
                show.setMovieId(result.getInt("movie_id"));
                show.setRoomId(result.getInt("room_id"));
                show.setTimeStart(result.getInt("time"));
                Movie movie = new Movie();
                show.movie = movie.findBySql("SELECT * FROM `movie` WHERE `id`="+show.getMovieId());
                shows.add(show);
            }
            return shows;
        } catch (SQLException e){
            return null;
        }
        
    }
}