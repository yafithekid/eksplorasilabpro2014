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

public class MovieIndexController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        Movie movie = new Movie();
        ArrayList<Movie> movies = movie.findAllBySql("SELECT * FROM `movie`");
        HashMap<String,Object> myModel = new HashMap();
        myModel.put("movies", movies);
//        
        return new ModelAndView("movie/index","model",myModel);
    } 

}