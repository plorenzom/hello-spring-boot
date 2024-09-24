package es.thefactory.hellospringboot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Pablo Lorenzo Manzano.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {
    
    /**
     *
     */
    @Autowired
    private MockMvc mockMvc;
    
    /**
     * @throws Exception
     */
    @Test
    public void getRequest_shouldReturnHelloWorldMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("¡Hola mundo!"));
    }
}
