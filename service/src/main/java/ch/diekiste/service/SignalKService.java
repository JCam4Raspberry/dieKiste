package ch.diekiste.service;

import ch.diekiste.model.signalk.version.ServerInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NameTokenizers;
import org.modelmapper.jackson.JsonNodeValueReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class SignalKService {

    public static void callSignalK() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:3000/signalk";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl , String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());


//        JsonNode root = null;
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            root = mapper.readTree(response.getBody());
//            JsonNode name = root.path("endpoint");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    public static void main(String... args) {
//        callSignalK();
        mapToObject();
    }

    private static void mapToObject() {
        String test = "{\"endpoints\":{\"v1\":{\"version\":\"1.4.3\",\"signalk-http\":\"http://localhost:3000/signalk/v1/api/\",\"signalk-ws\":\"ws://localhost:3000/signalk/v1/stream\",\"signalk-tcp\":\"tcp://localhost:3858\"}},\"server\":{\"id\":\"signalk-server-node\",\"version\":\"1.4.3\"}}";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode json = mapper.readTree(test);
            ServerInfo serverInfo = mapper.readValue(test, ServerInfo.class);
            System.out.println("Info: " + serverInfo);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
