package springapp.web; 
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap; 
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.mvc.Controller; 
import springapp.domain.Movie; 
import springapp.service.ProductManager;
public class InventoryController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    private ProductManager productManager; 
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        String now = (new java.util.Date()).toString();
        logger.info("returning hello view with " + now); 
        Map<String, Object> myModel = new HashMap<>();
        myModel.put("now", now);
        
        myModel.put("products", this.productManager.getProducts());
        Movie movie = new Movie();
        movie.setTitle("Hello World");
        movie.setLength(120);
        myModel.put("movie",movie);
        movie.findBySql("SELECT * FROM `movie`");
        
        return new ModelAndView("hello", "model", myModel);
    } 
    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    } 
}