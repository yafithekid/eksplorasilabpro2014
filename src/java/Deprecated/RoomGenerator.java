/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.service;

import springapp.domain.*;

public class RoomGenerator {
    public static Room getInstance(int roomId){
        Room room = new Room();
        room.initSeats(100);
        //room.setRoomNo(roomId);
        return room;
    }
}
