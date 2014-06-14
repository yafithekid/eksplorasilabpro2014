/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.domain;

import java.util.ArrayList;

public class Show {
    private Movie movie;
    private Room room;
    private int timeStart;
    private int price;

    public Movie getMovie() {
            return movie;
    }
    public void setMovie(Movie movie) {
            this.movie = movie;
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
}