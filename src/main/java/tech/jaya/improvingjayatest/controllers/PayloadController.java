package tech.jaya.improvingjayatest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jaya.improvingjayatest.models.Payload;
import tech.jaya.improvingjayatest.services.PayloadService;

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

    @PostMapping(consumes = {"application/x-www-form-urlencoded"} )
    public Payload create(String payload) {
        //Testing to see what's being sent as payload
        System.out.println(payload);
        Payload  hh = new Payload();
        return payloadService.create(hh);
    }
}
