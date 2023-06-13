package Controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class C_Login implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestPath = exchange.getRequestURI().getPath();

        if (requestPath.equals("/")) {
            String conteudoPagina = exibirPagina("/View/V_Login.html");
            enviarRespostaHTML(exchange, conteudoPagina);
        }
    }

    private void enviarRespostaHTML(HttpExchange exchange, String conteudoPagina) throws IOException {
        byte[] responseBytes = conteudoPagina.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(200, responseBytes.length);
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(responseBytes);
        outputStream.close();
    }

    private String exibirPagina(String caminho) {
         //Código para ler o conteúdo do arquivo login.html
        String conteudoPagina = lerConteudoArquivo(caminho);
        return conteudoPagina;
    }

    private String lerConteudoArquivo(String caminho) {
        try (InputStream inputStream = getClass().getResourceAsStream(caminho);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            StringBuilder conteudo = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            return conteudo.toString();
        } catch (IOException e) {
            return "Erro ao carregar a página, " + e.getMessage();
        }
    }
}