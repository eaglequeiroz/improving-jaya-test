package tech.jaya.improvingjayatest.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import tech.jaya.improvingjayatest.services.PayloadService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PayloadController.class)
public class PayloadControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PayloadService payloadService;

    @Test
    public void postShouldReturnA400Status() throws Exception {
        String jsonPayload = "{\"action\":\"closed\",\"issue\":{\"id\":\"1\",\"created_at\":\"1984-11-30\"}}";
        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/payload")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .accept(MediaType.APPLICATION_FORM_URLENCODED)
                .characterEncoding("UTF-8")
                .content("payload=" + jsonPayload))
                .andExpect(status().isOk());

    }
}
