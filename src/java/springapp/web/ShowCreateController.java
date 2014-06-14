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

public class ShowCreateController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        Show show = new Show();
        if (request.getParameter("form-submit") != null){
            show.setMovieId(Integer.parseInt(request.getParameter("movie_id")));
            show.setRoomId(Integer.parseInt(request.getParameter("room_id")));
            show.setTimeStart(Integer.parseInt(request.getParameter("time")));
            show.insert();
            return new ModelAndView("show/index");
        }
        HashMap<String,Object> myModel = new HashMap<>();
        myModel.put("movies", Movie.model().findAllBySql("SELECT * FROM `movie`"));
        return new ModelAndView("show/create","model",myModel);
//return new ModelAndView("greeting", "model", myModel);
    } 

}