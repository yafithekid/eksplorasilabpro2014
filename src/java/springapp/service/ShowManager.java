package springapp.service;
import springapp.domain.*;
import java.util.*;

public class ShowManager {
    Show show;
    
    public ShowManager(Show show){
        this.show = show;
    }
    
    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
    
    public void buyTicket(int pos){
        this.show.bookSeat(pos);
    }
    
    public int findAvailableSeat(){
        return show.findAvailableSeat();
    }
    public ArrayList findAllAvailableSeat(){
        return show.findAllAvailableSeat();
    }
}
