package ch.diekiste.service;

import java.util.concurrent.atomic.AtomicLong;

import ch.diekiste.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Model greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Model(counter.incrementAndGet(),
                String.format(template, name));
    }

}
