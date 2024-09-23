package es.thefactory.hellospringboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Pablo Lorenzo Manzano.
 */
@RestController
public class HelloWorldController {
    
    /**
     *
     */
    private static final Logger LOGGER = Logger.getLogger(HelloWorldController.class.getName());
    
    /**
     *
     * @return String
     */
    @GetMapping(value = "/")
    public String helloWorld() {
        LOGGER.info("Entering method helloWorld()");
        LOGGER.info("Exiting method helloWorld()");
        
        return "¡Hola mundo!";
    }
}
