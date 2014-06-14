/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.domain;

import java.util.ArrayList;
import java.util.Vector;

public class Room {
    private boolean[] seat;
    private int id;

    public int countSeat(){
        if (seat == null)
            return 0;
        else
            return seat.length;
    }
    public boolean getSeat(int index) {
        return seat[index];
    }
   
    public void setSeatAt(int index,boolean value){
        if (index < seat.length)
            seat[index] = value;
    }
    
    public void setSeats(boolean[] seat) {
        this.seat = new boolean[seat.length];
        for (int b = 0; b < this.countSeat(); ++b){
            this.seat[b] = seat[b];
        }
    }
    
    public void initSeats(int nSeats){
        this.seat = new boolean[nSeats];
        for (int b = 0; b < this.countSeat(); ++b){
            this.seat[b] = seat[b];
        }
    }
    public int getId() {
            return this.id;
    }
    
    public void setId(int roomNo) {
            this.id = roomNo;
    }
    
    public int findAvailableSeat(){
        for (int i = 0; i < this.countSeat(); i++)
            if (!this.getSeat(i))
                return i;
        return -1;
    }
    
    public ArrayList findAllAvailableSeat(){    
        ArrayList<Integer> retVal;
        retVal = new ArrayList<>();
        for (int i = 0; i < this.countSeat(); i++){
            if (!this.getSeat(i))
                retVal.add(i);
        }
        return retVal;
    }
    
}