package springapp.web; 
import java.io.IOException;
import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.mvc.Controller; 
import springapp.domain.Movie;
import springapp.domain.Room;
import springapp.domain.Show;
import springapp.domain.Ticket;

public class TicketBookController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        Ticket ticket = new Ticket();
        if (request.getParameter("form-submit") != null){
            HashMap<String,Object> model = new HashMap<>();
            ArrayList<Ticket> tickets = new ArrayList<>();            
            for(int i = 0; i < Room.NSEAT; i++){
                ticket = new Ticket();
                ticket.setShowId(Integer.parseInt(request.getParameter("show_id")));
                //for each booked ticket
                if (request.getParameter("ticket_no_"+i) != null){
                    ticket.setTicketNo(i);
                    ticket.insert();
                    tickets.add(ticket);
                }
            }
            Show show = new Show();
            
            show = show.findBySql("SELECT * FROM `show` WHERE id = "+ticket.getShow().getId());
            Movie movie = new Movie();
            movie = movie.findBySql("SELECT * FROM `movie` WHERE id = "+show.getMovieId());
            if (tickets == null){
                throw new UnsupportedOperationException("error");
            }
            model.put("tickets", tickets);
            model.put("movie",movie);
            model.put("show",show);
            return new ModelAndView("ticket/print","model",model);
        }
        int showId = Integer.parseInt(request.getParameter("show_id"));
        ArrayList<Ticket> tickets = new ArrayList<>();
        
        Room room = new Room();
        room.initSeats(Room.NSEAT);
        
        tickets = ticket.findAllBySql("SELECT * FROM `ticket` WHERE `show_id` = "+showId);
        for (Ticket t : tickets){
            room.setSeatAt(t.getTicketNo(), true);
        }
        Map<String, Object> myModel = new HashMap<>();
        myModel.put("showId",showId);
        myModel.put("tickets", ticket);
        myModel.put("room",room);
        return new ModelAndView("ticket/book","model",myModel);
    } 

}