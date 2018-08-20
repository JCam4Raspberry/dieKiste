package ch.diekiste.service;

import java.util.concurrent.atomic.AtomicLong;

import ch.diekiste.exception.SignalKCommunicationException;
import ch.diekiste.model.signalk.version.ServerInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Service {


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {

        try {
             ServerInfo result = SignalKService.getServerInfo();
             return result.toString();
        } catch (SignalKCommunicationException e) {
            return "Es ist ein Fehler aufgetraten: " + e;
        }
    }

}
