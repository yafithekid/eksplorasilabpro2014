package springapp.domain;

import java.sql.SQLException;
import java.sql.Statement;
import springapp.db.DBConnector;

public class Ticket {
    private Show show;
    private int id;
    private int ticketNo;
    private static String tablename = "ticket";
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Show getShow() {
        return show;
    }
    public void setShow(Show show) {
        this.show = show;
    }
    public int getTicketNo() {
        return ticketNo;
    }
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    
    public String getMovieTitle(){
        if (this.getShow().getMovie() != null){
            return this.getShow().getMovie().getTitle();
        }
        return null;
    }
    
    public int getDate(){
        return this.getShow().getTimeStart();
    }
    
    public int getPrice(){
        return this.getShow().getPrice();
    }
    
    public boolean insert(){
        try{
            Statement st = DBConnector.con.createStatement();
            st.execute("INSERT INTO `"+Ticket.tablename+"`(`show_id`,`ticket_no`) VALUES('"+this.getShow().getId()+"','"+this.getTicketNo()+"')");
            return true;
        } catch (SQLException e){
            return false;
        }
    }
    
    public Ticket findBySql(String query){
        throw new UnsupportedOperationException("Ticket.java : unsupported findbysql exception");
    }
}
