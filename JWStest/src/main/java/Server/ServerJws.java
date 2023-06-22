package Server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJws {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8085/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("web service deploye sur "+url);

    }
}
