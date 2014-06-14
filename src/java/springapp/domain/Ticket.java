package springapp.domain;

public class Ticket {
    //private String name;
    private Show show;
    private int ticketNo;

    /*public String getName() {
        return name;
    }
    public void setName(String name) {
            this.name = name;
    }*/
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
}
