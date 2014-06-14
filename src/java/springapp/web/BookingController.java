package springapp.web; 
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import java.io.IOException;
import java.util.Map;
import java.util.HashMap; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 

public class BookingController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        int id = 0, content = 0;
        if (request.getParameter("id") != null)
            id = Integer.parseInt(request.getParameter("id"));
        if (request.getParameter("content") != null)
            content = Integer.parseInt(request.getParameter("content"));
        Map<String, Object> myModel = new HashMap<>();
        myModel.put("id", id);
        myModel.put("content",content);
        return new ModelAndView("redirect:hello.htm");
//return new ModelAndView("greeting", "model", myModel);
    } 

}