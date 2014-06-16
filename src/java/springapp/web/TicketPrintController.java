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
import springapp.domain.*;
import springapp.service.ShowGenerator;

public class TicketPrintController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        HashMap<String,Object> model = new HashMap<>();
        model = (HashMap<String,Object>) request.getAttribute("model");
        if (model == null){
            throw new UnsupportedOperationException("model is null");
        }
        //ArrayList<Ticket> tickets = (ArrayList<Ticket>) model.get("tickets");
        //Movie movie = (Movie) model.get("movie");
        //Show show = (Show) model.get("show");
////        model.clear();
////        model.put("tickets", tickets);
        //model.put("movie",movie);
        //model.put("show",show);
         throw new UnsupportedOperationException("hello");
////return new ModelAndView("ticket/print","model",model);
////return new ModelAndView("greeting", "model", myModel);
//        throw new UnsupportedOperationException("hello");
    } 

}