package es.thefactory.hellospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author Pablo Lorenzo Manzano.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    
    /**
     *
     */
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());
    
    /**
     *
     */
    @Autowired
    private ApplicationContext applicationContext;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Entering method run()");
        
        LOGGER.info("Listado de 'beans' registrados por Spring Boot:");
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        for (String beanName : beanNames) {
            LOGGER.info(beanName);
        }
        
        LOGGER.info("Exiting method run()");
    }
}
