package tech.jaya.improvingjayatest.controllers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jaya.improvingjayatest.models.Payload;
import tech.jaya.improvingjayatest.services.PayloadService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/payload")
public class PayloadController {

    private PayloadService payloadService;

    @Autowired
    public PayloadController(PayloadService payloadService) {
        this.payloadService = payloadService;
    }

    @GetMapping
    public List<Payload> listAll() {
        return payloadService.listAll();
    }

    @PostMapping(consumes = {"application/x-www-form-urlencoded"})
    public Payload create(String payload) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        Payload serializedObject = objectMapper.readValue(payload, Payload.class);
        return payloadService.create(serializedObject);
    }
}
