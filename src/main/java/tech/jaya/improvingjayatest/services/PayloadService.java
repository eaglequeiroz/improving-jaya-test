package tech.jaya.improvingjayatest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.jaya.improvingjayatest.models.Payload;
import tech.jaya.improvingjayatest.repositories.PayloadRepository;

import java.util.List;

@Service
public class PayloadService {

    private PayloadRepository payloadRepository;

    @Autowired
    public  PayloadService(PayloadRepository payloadRepository){
        this.payloadRepository = payloadRepository;
    }

    public List<Payload> listAll(){
        return (List<Payload>) payloadRepository.findAll();
    }

    public Payload create(Payload payload){
        return  payloadRepository.save(payload);
    }
}
