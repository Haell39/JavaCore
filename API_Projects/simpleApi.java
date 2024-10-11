package API_Projects;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class simpleApi {
    public static void main(String[] args) throws IOException {
        // Cria o servidor na porta 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Configura o endpoint "/hello" com o método GET
        server.createContext("/hello", new HelloHandler());
        
        // Inicia o servidor
        server.start();
        System.out.println("Servidor iniciado na porta 8080...");
    }

    // Define a classe de tratamento para a rota "/hello"
    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Verifica se o método é GET
            if ("GET".equals(exchange.getRequestMethod())) {
                // Resposta da API
                String response = "Hello, World!";
                
                // Define o código de resposta HTTP (200 OK)
                exchange.sendResponseHeaders(200, response.getBytes().length);
                
                // Envia a resposta
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                // Se não for GET, responde com 405 (Método não permitido)
                exchange.sendResponseHeaders(405, -1);
            }
        }
    }
}
