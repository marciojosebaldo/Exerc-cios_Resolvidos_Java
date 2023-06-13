// Atividade desenvolvida com o professor

import Controller.C_Login;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        C_Login loginHandler = new C_Login();

        server.createContext("/", loginHandler);

        server.start();
        System.out.println("Server iniciado http://localhost:8080");
    }
}