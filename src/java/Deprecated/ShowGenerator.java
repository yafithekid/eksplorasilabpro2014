/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.service;
import java.sql.*;
import javax.sql.*;
/**
 *
 * @author yafithekid
 */
import java.util.ArrayList;
import springapp.domain.*;

public class ShowGenerator {
    public static ArrayList createRandom(int n){
        ArrayList<Show> retval = new ArrayList<>();
        for(int i = 0; i < n; i++){
            retval.add(ShowGenerator.createRandom());
        }
        return retval;
    }
    
    public static Show createRandom(){
        Show show = new Show();
        
        show.setMovie(MovieGenerator.createRandom());
        show.setPrice(120);      
        show.setRoom(RoomGenerator.getInstance(1));
        show.setTimeStart(100);
        return show;
    }
    

}
